using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace ReadWriteConsole {
    internal class ReadFile {
        
        public List<Articulo> leerTXT(String path) {
            List<Articulo> data = new List<Articulo>();
            
            try {
                
                // Instanciamos un StreamReader
                StreamReader sr = new StreamReader(path);

                // Leemos la primer linea de texto (Encabezado)
                sr.ReadLine();

                String line;

                do {

                    line = sr.ReadLine();
                    if (line != null) {
                        string[] objectData = line.Split('\t');

                        Articulo articulo = new Articulo();
                        articulo.Id = int.Parse(objectData[0]);
                        articulo.FechaAlta = objectData[1];
                        articulo.Codigo = objectData[2];
                        articulo.Denominacion = objectData[3];
                        articulo.Precio = double.Parse(objectData[4]);
                        articulo.Publicado = char.Parse(objectData[5]);

                        data.Add(articulo);

                        if (data.Count == 50) {
                            escribirDB(data);
                            data.Clear();
                        }
                    } else {
                        escribirDB(data);
                    }
                } while (line != null);

                sr.Close();

            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
            }
            return data;
        }

        public void escribirDB(List<Articulo> data) {

            MySqlConnection conn = Conexion.conexion();
            conn.Open();
            MySqlCommand command = conn.CreateCommand();
            MySqlTransaction transaction;
            transaction = conn.BeginTransaction();
            

            try {
                foreach (Articulo art in data) {
                    string sqlScript;
                    if (buscarCodigo(art.Codigo)) {
                        command.CommandText = "UPDATE articulo_copy SET fechaAlta = @FechaAlta, codigo = @Codigo, denominacion = @Denominacion, precio = @Precio, publicado = @Publicado WHERE codigo = @Codigo";
                    } else {
                        command.CommandText = "INSERT INTO articulo_copy (fechaAlta, codigo, denominacion, precio, publicado) VALUES (@FechaAlta, @Codigo, @Denominacion, @Precio, @Publicado)";
                    }

                    command.Parameters.AddWithValue("@FechaAlta", DateTime.Parse(art.FechaAlta));
                    command.Parameters.AddWithValue("@Codigo", art.Codigo);
                    command.Parameters.AddWithValue("@Denominacion", art.Denominacion);
                    command.Parameters.AddWithValue("@Precio", art.Precio);
                    command.Parameters.AddWithValue("@Publicado", art.Publicado);
                    command.ExecuteNonQuery();
                    command.Parameters.Clear();
                }

                transaction.Commit();

            } catch (Exception ex) {
                transaction.Rollback();
                Console.WriteLine("[ERROR] " + ex.Message);
            } finally {
                conn.Close();
            }

        }

        public bool buscarCodigo(string cod) {

            bool flag = false;
            string sqlScript = $"SELECT codigo FROM articulo_copy WHERE codigo = '{cod}';";
            MySqlConnection conn = Conexion.conexion();
            conn.Open();
            try {
                MySqlCommand command = new MySqlCommand(sqlScript, conn);
                var rd = command.ExecuteReader();
                if (rd.Read()) {
                    flag = true;
                }
                rd.Close();
            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
            } finally {
                conn.Close();
            }

            return flag;
        }

    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;
using Newtonsoft.Json;

namespace JSON {
    internal class WriteJSON {

        public List<Escritor> leerDB() {
            List<Escritor> escritores = new List<Escritor>();
            MySqlConnection conn = Conexion.GetConnection();

            try {
                              
                conn.Open();
                string sqlQuery = "SELECT * FROM escritor";

                MySqlCommand cmd = new MySqlCommand(sqlQuery, conn);
                MySqlDataReader reader = cmd.ExecuteReader();

                while (reader.Read()) {
                    Escritor escritor = new Escritor();
                    escritor.id = reader.GetInt32(0);
                    escritor.nombre = reader.GetString(2);
                    escritor.apellido = reader.GetString(1);
                    escritor.dni = reader.GetInt64(3);
                    List<Libro> libros = traerLibros(escritor.id);
                    escritor.libros = libros;
                    escritores.Add(escritor);
                }

            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
            }


            return escritores;
        }

        public List<Libro> traerLibros(int idEscritor) {
            List<Libro> libros = new List<Libro>();
            MySqlConnection conn = Conexion.GetConnection();

            try {

                conn.Open();
                string sqlQuery = "SELECT * FROM libro WHERE idEscritor='" + idEscritor + "';";

                MySqlCommand cmd = new MySqlCommand(sqlQuery, conn);
                MySqlDataReader reader = cmd.ExecuteReader();

                while (reader.Read()) {
                    Libro libro = new Libro();
                    libro.id = reader.GetInt16(0);
                    libro.nombre = reader.GetString(1);
                    libro.anioPublicacion = reader.GetInt32(2);
                    libro.editorial = reader.GetString(3);
                    libro.idEscritor = idEscritor;
                    libros.Add(libro);
                }


            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
            }

            return libros;
        }

        public void crearJSON(string path, List<Escritor> data) {

            string JSONFile = JsonConvert.SerializeObject(data.ToArray(), Formatting.Indented);
            
            
            if (File.Exists(path)) {
                File.Delete(path);
            }
            File.WriteAllText(path, JSONFile);

        }

    }
}

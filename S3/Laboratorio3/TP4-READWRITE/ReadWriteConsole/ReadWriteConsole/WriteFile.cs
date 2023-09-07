using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace ReadWriteConsole {
    class WriteFile {

        public List<String> leerDB(int index) {

            // Creamos un reader y la lista de Strings
            MySqlConnection conn = Conexion.conexion();
            MySqlDataReader reader;
            List<String> data = new List<String>();

            try {
                conn.Open();
                string sqlScript = $"SELECT * FROM articulo LIMIT {index}, 50";
                MySqlCommand command = new MySqlCommand(sqlScript, conn);
                reader = command.ExecuteReader();

                while (reader.Read()) {
                    string row = $"{reader.GetString(0)}\t{reader.GetString(1)}\t{reader.GetString(2)}\t{reader.GetString(3)}\t{reader.GetString(4)}\t{reader.GetString(5)}";
                    data.Add(row);
                }

                reader.Close();
            } catch (Exception e) {
                Console.WriteLine(e);
            } finally {
                conn.Close();
            }

            return data;
        }

        public void escribirTXT(List<String> data, String path) {

            // Creamos un StreamWriter
            StreamWriter streamWriter = null;

            try {

                if (File.Exists(path)){
                    streamWriter = new StreamWriter(path, true);
                } else {
                    streamWriter = new StreamWriter(path);
                    streamWriter.WriteLine("ID\tFECHA_ALTA\t\tCODIGO\tDENOMINACION\tPRECIO\tPUBLICADO");
                }

                foreach (var line in data) {
                    streamWriter.WriteLine(line);
                }
            } catch (Exception ex) {
                Console.Write(ex.Message);
            } finally {
                streamWriter.Close();
            }


        }

    }
}

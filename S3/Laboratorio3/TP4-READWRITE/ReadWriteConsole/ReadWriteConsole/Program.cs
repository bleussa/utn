using System;
using System.Reflection;
using MySql.Data.MySqlClient;
using MySqlX.XDevAPI.Common;

namespace ReadWriteConsole {

    class Program {
        static void Main(string[] args) {

            WriteFile wFile = new WriteFile();
            ReadFile rFile = new ReadFile();
            string filePath = Path.GetFullPath("../../../archivo.txt");

            // LECTURA DE LA BD Y ESCRITURA DE TXT
            List<string> data = new List<string>();
            int index = 0;
            
            if (File.Exists(filePath)) {
                File.Delete(filePath);
            }

            do {
                data = wFile.leerDB(index);
                index += 50;
                wFile.escribirTXT(data, filePath);
            } while (data.Count() != 0);

            // LECTURA DE TXT Y ESCRITURA EN DB
            rFile.leerTXT(filePath);

            // VERIFICACION DE REGISTROS EN LAS DOS TABLAS
            if (registrosTablas("articulo") == registrosTablas("articulo_copy")) {
                Console.WriteLine("[INFO] Las tablas tienen la misma cantidad de registros (" + registrosTablas("articulo") + ")");
            } else {
                Console.WriteLine("[INFO] Las tablas no tienen la misma cantidad de registros");
            }

        }

        public static int registrosTablas(string db) {
            try {
                MySqlConnection conn = Conexion.conexion();
                conn.Open();

                string sqlScript = $"SELECT COUNT(*) FROM {db};";

                MySqlCommand command = new MySqlCommand(sqlScript, conn);
                MySqlDataReader reader = command.ExecuteReader();

                if (reader.Read()) {
                    return reader.GetInt32(0);
                } 
            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
            }
            return -1;
        }
    }

}
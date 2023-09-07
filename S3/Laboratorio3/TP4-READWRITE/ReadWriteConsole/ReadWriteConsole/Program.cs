using System;
using System.Reflection;
using MySql.Data.MySqlClient;
using MySqlX.XDevAPI.Common;

namespace ReadWriteConsole {

    class Program {
        static void Main(string[] args) {

            List<string> data = new List<string>();
            WriteFile wFile = new WriteFile();
            int index = 0;
            string filePath = Path.GetFullPath("../../../archivo.txt");
            
            if (File.Exists(filePath)) {
                File.Delete(filePath);
            }

            do {
                data = wFile.leerDB(index);
                index += 50;
                wFile.escribirTXT(data, filePath);

            } while (data.Count() != 0);



        }
    }

}
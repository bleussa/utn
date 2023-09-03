using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace CRUD
{
    class Conexion
    {
        public static MySqlConnection conexion()
        {
            String servidor = "localhost";
            String bd = "tienda";
            String usuario = "root";
            String password = "";
            String cadenaConexion = "Database=" + bd + "; Data Source=" + servidor + "; User ID=" + usuario + "; Password=" + password + "";

            try
            {
                MySqlConnection conexion = new MySqlConnection(cadenaConexion);

                return conexion;
            }
            catch (MySqlException ex)
            {
                Console.WriteLine(ex.Message);
                return null;
            }
        }
    }
}

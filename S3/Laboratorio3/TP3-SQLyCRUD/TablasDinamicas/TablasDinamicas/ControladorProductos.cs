using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace TablasDinamicas {
    class ControladorProductos: Conexion {

        public List<Object> consulta(String dato) {
            List<Object> lista = new List<Object>();

            MySqlDataReader reader;
            string sql;

            if (dato == null) {
                sql = "SELECT * FROM productos ORDER BY nombre ASC";
            } else {
                sql = "SELECT * FROM productos WHERE codigo LIKE '%" + dato + "%' OR nombre LIKE '%" + dato + "%' OR descripcion LIKE '%" + dato + "%' OR precio LIKE '%" + dato + "%' OR existencias LIKE '%" + dato + "%'"; 
            }

            

            try {
                MySqlConnection conexion = base.conexion();
                conexion.Open();
                MySqlCommand comando = new MySqlCommand(sql, conexion);

                reader = comando.ExecuteReader();

                while (reader.Read()) {
                    Productos producto = new Productos();
                    producto.Id = int.Parse(reader.GetString(0));
                    producto.Codigo = reader.GetString(1);
                    producto.Nombre = reader.GetString(2);
                    producto.Descripcion = reader.GetString(3);
                    producto.PrecioPublico = double.Parse(reader.GetString(4));
                    producto.Existencias = int.Parse(reader.GetString(5));
                    lista.Add(producto);
                }
            } catch (MySqlException ex) {
                MessageBox.Show(ex.Message);
                throw;
            }

            return lista;
        }

    }
}

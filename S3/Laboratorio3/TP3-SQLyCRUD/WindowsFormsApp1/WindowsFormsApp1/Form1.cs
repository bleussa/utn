using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String servidor = txtServidor.Text;
            String puerto = txtPuerto.Text;
            String usuario = txtUsuario.Text;
            String contrasenia = txtContrasenia.Text;
            String baseDatos = txtBase.Text;

            String cadenaConexion = "Database=" + baseDatos + "; Data Source=" + servidor + "; Port=" + puerto + "; User Id=" + usuario + "; Password=" + contrasenia;

            MySqlConnection conexion = new MySqlConnection(cadenaConexion);
            MySqlDataReader reader = null;
            String data = null;

            try
            {
                String consulta = "SHOW DATABASES;";
                MySqlCommand comando = new MySqlCommand(consulta);
                comando.Connection = conexion;
                conexion.Open();
                reader = comando.ExecuteReader();

                while(reader.Read())
                {
                    data += reader.GetString(0) + "\n";
                }

                MessageBox.Show(data);
            }
            catch (MySqlException ex)
            {
                MessageBox.Show("Error: " + ex.Message);
            }
            finally
            {
                conexion.Close();
            }

        }
    }
}

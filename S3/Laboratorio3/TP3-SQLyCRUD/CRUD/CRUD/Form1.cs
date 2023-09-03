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

namespace CRUD
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            String id = txtId.Text;

            String sqlScript = "DELETE FROM productos WHERE id='" + id + "'";

            MySqlConnection conexion = Conexion.conexion();
            conexion.Open();

            try {
                MySqlCommand comando = new MySqlCommand(sqlScript, conexion);
                comando.ExecuteNonQuery();
                MessageBox.Show("Registro eliminado");
                limpiar();
            } catch (MySqlException ex) {
                MessageBox.Show("Error: " + ex.Message);

            } finally { conexion.Close(); }
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void btnGuardar_Click(object sender, EventArgs e)
        {
            try {
                String codigo = txtCodigo.Text;
                String nombre = txtNombre.Text;
                String descripcion = txtDescripcion.Text;
                double precioPublico = double.Parse(txtPrecioPublico.Text);
                int existencias = int.Parse(txtExistencias.Text);

                if (codigo != "" && nombre != "" && descripcion != "" && precioPublico > 0 && existencias > 0) {



                    String sqlScript = "INSERT INTO productos (codigo,nombre,descripcion,precio,existencias) VALUES ('" + codigo + "', '" + nombre + "', '" + descripcion + "', '" + precioPublico + "', '" + existencias + "')";

                    MySqlConnection conexion = Conexion.conexion();
                    conexion.Open();

                    try {
                        MySqlCommand comando = new MySqlCommand(sqlScript, conexion);
                        comando.ExecuteNonQuery();
                        MessageBox.Show("Registro guardado");
                        limpiar();
                    } catch (MySqlException ex) {
                        MessageBox.Show("Error: " + ex.Message);

                    } finally { conexion.Close(); }

                } else {
                    MessageBox.Show("Debe completar todos los datos");
                }
            } catch (FormatException fex) {
                MessageBox.Show("Error: " + fex.Message);
            }


        }

        private void btnBuscar_Click(object sender, EventArgs e) {
            String codigo = txtCodigo.Text;

            MySqlDataReader reader = null;

            String sqlScript = "SELECT * FROM productos WHERE codigo LIKE '" + codigo + "' LIMIT 1";

            MySqlConnection conexion = Conexion.conexion();

            conexion.Open();

            try {
                MySqlCommand comando = new MySqlCommand(sqlScript, conexion);
                reader = comando.ExecuteReader();

                if (reader.HasRows) {
                    while (reader.Read()) {
                        limpiar();
                        txtId.Text = reader.GetString(0);
                        txtCodigo.Text = reader.GetString(1);
                        txtNombre.Text = reader.GetString(2);
                        txtDescripcion.Text = reader.GetString(3);
                        txtPrecioPublico.Text = reader.GetString(4);
                        txtExistencias.Text = reader.GetString(5);

                    }
                } else {
                    MessageBox.Show("No se encontraron registros!");
                }

            } catch (MySqlException ex) {
                MessageBox.Show("Error: " + ex.Message);
            } finally {
                conexion.Close();
            }


        }

        private void btnActualizar_Click(object sender, EventArgs e) {
            String id = txtId.Text;
            String codigo = txtCodigo.Text;
            String nombre = txtNombre.Text;
            String descripcion = txtDescripcion.Text;
            double precioPublico = double.Parse(txtPrecioPublico.Text);
            int existencias = int.Parse(txtExistencias.Text);

            String sqlScript = "UPDATE productos SET codigo='" + codigo + "', nombre='" + nombre + "', descripcion='" + descripcion + "', precio='" + precioPublico + "', existencias='" + existencias + "' WHERE id='" + id + "'"; 

            MySqlConnection conexion = Conexion.conexion();
            conexion.Open();

            try {
                MySqlCommand comando = new MySqlCommand(sqlScript, conexion);
                comando.ExecuteNonQuery();
                MessageBox.Show("Registro actualizado");
            } catch (MySqlException ex) {
                MessageBox.Show("Error: " + ex.Message);

            } finally { conexion.Close(); }
        }

        private void btnLimpiar_Click(object sender, EventArgs e) {
            limpiar();
        }

        private void limpiar() {
            txtId.Text = "";
            txtCodigo.Text = "";
            txtNombre.Text = "";
            txtDescripcion.Text = "";
            txtPrecioPublico.Text = "";
            txtExistencias.Text = "";
        }
    }
}

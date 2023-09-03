using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Final {
    public partial class Form1 : Form {
        public Form1() {
            InitializeComponent();
            cargarTabla(null);
        }

        private void cargarTabla(string dato) {
            List<Productos> lista = new List<Productos>();
            ControladorProductos ctrlProductos = new ControladorProductos();
            tablaDinamica.DataSource = ctrlProductos.consulta(dato);
        }

        private void btnBuscar_Click(object sender, EventArgs e) {
            string dato = txtBusqueda.Text;
            cargarTabla(dato);
        }

        private void btnGuardar_Click(object sender, EventArgs e) {
            bool bandera = false;
            Productos producto = new Productos();
            producto.Codigo = txtCodigo.Text;
            producto.Nombre = txtNombre.Text;
            producto.Descripcion = txtDesc.Text;
            producto.PrecioPublico = double.Parse(txtPrecio.Text);
            producto.Existencias = int.Parse(txtExistencia.Text);

            ControladorProductos ctrlProductos = new ControladorProductos();

            if (txtId.Text != "") {
                producto.Id = int.Parse(txtId.Text);
                bandera = ctrlProductos.actualizar(producto);
            } else {
                bandera = ctrlProductos.insertar(producto);
            }

            if (bandera) {
                cargarTabla(null);
                MessageBox.Show("Registro guardado");
                limpiar();
            }

        }

        private void limpiar() {
            txtCodigo.Text = "";
            txtNombre.Text = "";
            txtDesc.Text = "";
            txtPrecio.Text = "";
            txtExistencia.Text = "";
        }

        private void tablaDinamica_CellContentClick(object sender, DataGridViewCellEventArgs e) {

        }

        private void btnLimpiar_Click(object sender, EventArgs e) {
            limpiar();
        }

        private void btnActualizar_Click(object sender, EventArgs e) {
            txtId.Text = tablaDinamica.CurrentRow.Cells[0].Value.ToString();
            txtCodigo.Text = tablaDinamica.CurrentRow.Cells[5].Value.ToString();
            txtNombre.Text = tablaDinamica.CurrentRow.Cells[1].Value.ToString();
            txtDesc.Text = tablaDinamica.CurrentRow.Cells[2].Value.ToString();
            txtPrecio.Text = tablaDinamica.CurrentRow.Cells[3].Value.ToString();
            txtExistencia.Text = tablaDinamica.CurrentRow.Cells[4].Value.ToString();
        }

        private void btnEliminar_Click(object sender, EventArgs e) {
            DialogResult resultado = MessageBox.Show("Seguro que desea eliminar el registro?",
                "Salir", MessageBoxButtons.YesNoCancel);
            if (resultado == DialogResult.Yes) {
                int id = int.Parse(tablaDinamica.CurrentRow.Cells[0].Value.ToString());
                ControladorProductos ctrlProductos = new ControladorProductos();
                ctrlProductos.eliminar(id);
                cargarTabla(null);
            }
        }
    }
}

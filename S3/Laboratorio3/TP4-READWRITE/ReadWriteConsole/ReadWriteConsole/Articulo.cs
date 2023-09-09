using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReadWriteConsole {
    class Articulo {

        private int id;
        private string fechaAlta;
        private string codigo;
        private string denominacion;
        private double precio;
        private char publicado;

        public int Id {
            get { return id; }
            set { id = value; }
        }

        public string FechaAlta {
            get { return fechaAlta; }
            set { fechaAlta = value; }
        }

        public string Codigo {
            get { return codigo; }
            set { codigo = value; }
        }

        public string Denominacion {
            get { return denominacion; }
            set { denominacion = value; }
        }

        public double Precio {
            get { return precio; }
            set { precio = value; }
        }

        public char Publicado {
            get { return publicado; }
            set { publicado = value; }
        }


        public Articulo() {

        }

        public Articulo(int id, string fechaAlta, string codigo, string denominacion, double precio, char publicado) {
            this.id = id;
            this.fechaAlta= fechaAlta;
            this.codigo = codigo;
            this.denominacion= denominacion;
            this.precio = precio;
            this.publicado = publicado;
        }

    }
}

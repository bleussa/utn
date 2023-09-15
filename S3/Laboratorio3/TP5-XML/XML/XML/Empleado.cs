using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace XML {
    class Empleado {

		private int id;
		public int Id {
			get { return id; }
			set { id = value; }
		}

        private string nombreCompleto;
        public string NombreCompleto {
            get { return nombreCompleto; }
            set { nombreCompleto = value; }
        }

        private long cuil;
        public long Cuil {
            get { return cuil; }
            set { cuil = value; }
        }

        private Sector sector;
        public Sector Sector {
            get { return sector; }
            set { sector = value; }
        }

        private double cupoAsignado;
        public double CupoAsignado {
            get { return cupoAsignado; }
            set { cupoAsignado = value; }
        }

        private double cupoConsumido;
        public double CupoConsumido {
            get { return cupoConsumido; }
            set { cupoConsumido = value; }
        }

        public Empleado(int id, string nombreCompleto, long cuil, Sector sector, double cupoAsignado, double cupoConsumido) {
            this.id = id;
            this.nombreCompleto = nombreCompleto;
            this.cuil = cuil;
            this.sector = sector;
            this.cupoAsignado = cupoAsignado;
            this.cupoConsumido = cupoConsumido;
        }

    }
}

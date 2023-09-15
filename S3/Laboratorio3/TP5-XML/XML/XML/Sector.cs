using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace XML {
    class Sector {

        private int id;
        public int Id {
            get { return id; }
            set { id = value; }
        }
        
        private string denominacion;
        public string Denominacion {
            get { return denominacion; }
            set { denominacion = value; }
        }

        private double valorSemaforo;
        public double ValorSemaforo {
            get { return valorSemaforo;}
            set { valorSemaforo = value;}
        }

        private string colorSemaforo;
        public string ColorSemaforo {
            get { return colorSemaforo; }
            set { colorSemaforo = value;}
        }

        public Sector(int id, string denominacion, double valorSemaforo, string colorSemaforo) {
            this.id = id;
            this.denominacion = denominacion;
            this.valorSemaforo = valorSemaforo;
            this.colorSemaforo = colorSemaforo;
        }

    }
}

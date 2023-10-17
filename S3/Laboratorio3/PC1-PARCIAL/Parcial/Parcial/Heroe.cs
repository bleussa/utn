using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Parcial {
    public class Heroe {

        public int id { get; set; }
        public string nombre { get; set; }
        public string bio { get; set; }
        public string img { get; set; }
        public string aparicion { get; set; }
        public string casa { get; set; }

        public List<string> poderes = new List<string>();

    }
}

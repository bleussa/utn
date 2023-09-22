using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JSON {
    class Libro {

        public int id { get; set; }
        public string nombre { get; set; }
        public int anioPublicacion { get; set; }
        public string editorial { get; set; }
        public int idEscritor { get; set; }

        public Libro() { }
    
    }
}

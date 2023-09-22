using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JSON {
    class Escritor {

        public int id { get; set; }
        public string nombre { get; set; }
        public string apellido { get; set; }
        public long dni { get; set; }
        public List<Libro> libros { get; set; }

        public Escritor() { }

    }
}

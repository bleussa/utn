using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio6
{
    public class Deposito
    {
        private String nombre;
        private String domicilio;
        private List<Articulo> articulos;
        public List<Articulo> artículosBajoStock()
        {
            List<Articulo> listaABS = new List<Articulo>();
            foreach (var art in articulos)
            {
                if (art.StockTotal <= art.StockMinimo) listaABS.Add(art);
            }
            return listaABS;
        }


    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio6
{
    public class Articulo
    {
        private int codigo;
        private double stockTotal;
        private double stockMinimo;
        private Deposito deposito;

        public double StockTotal
        {
            get => stockTotal;
            set => stockTotal = value;
        }

        public double StockMinimo
        {
            get => stockMinimo;
            set => stockMinimo = value;
        }
    }
}

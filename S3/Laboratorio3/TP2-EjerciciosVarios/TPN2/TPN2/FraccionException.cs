using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPN2
{
    class FraccionException : Exception
    {
        public FraccionException(string message) : base(message)
        {
        }
    }
}

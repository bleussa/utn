using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPN2
{
    internal class Fraccion
    {
        private int numerador;
        private int denominador;

        public Fraccion(int numerador, int denominador)
        {
            if (denominador == 0)
            {
                throw new FraccionException("El denominador no puede ser cero");
            }

            this.numerador = numerador;
            this.denominador = denominador;
        }

        public Fraccion Sumar(Fraccion otraFraccion)
        {
            int nuevoNumerador = numerador * otraFraccion.denominador + denominador * otraFraccion.numerador;
            int nuevoDenominador = denominador * otraFraccion.denominador;

            return Simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
        }

        public Fraccion Restar(Fraccion otraFraccion)
        {
            int nuevoNumerador = numerador * otraFraccion.denominador - denominador * otraFraccion.numerador;
            int nuevoDenominador = denominador * otraFraccion.denominador;

            return Simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
        }

        public Fraccion Multiplicar(Fraccion otraFraccion)
        {
            int nuevoNumerador = numerador * otraFraccion.numerador;
            int nuevoDenominador = denominador * otraFraccion.denominador;

            return Simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
        }

        public Fraccion Dividir(Fraccion otraFraccion)
        {
            int nuevoNumerador = numerador * otraFraccion.denominador;
            int nuevoDenominador = denominador * otraFraccion.numerador;

            if (nuevoDenominador == 0)
            {
                throw new FraccionException("No se puede dividir, el denominador resultante sería cero");
            }

            return Simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
        }

        private int ObtenerMaximoComunDivisor(int a, int b)
        {
            while (b != 0)
            {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        private Fraccion Simplificar(Fraccion fraccion)
        {
            int mcd = ObtenerMaximoComunDivisor(fraccion.numerador, fraccion.denominador);
            fraccion.numerador /= mcd;
            fraccion.denominador /= mcd;
            return fraccion;
        }

        public override string ToString()
        {
            return $"{numerador}/{denominador}";
        }
    }
}

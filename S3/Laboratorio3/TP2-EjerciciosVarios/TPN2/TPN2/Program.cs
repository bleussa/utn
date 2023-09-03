using System;

namespace TPN2
{
    public static class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                Fraccion fraccion1 = new Fraccion(1, 3);
                Fraccion fraccion2 = new Fraccion(1, 4);

                Fraccion suma = fraccion1.Sumar(fraccion2);
                Console.WriteLine($"Suma: {suma}");

                Fraccion resta = fraccion1.Restar(fraccion2);
                Console.WriteLine($"Resta: {resta}");

                Fraccion multiplicacion = fraccion1.Multiplicar(fraccion2);
                Console.WriteLine($"Multiplicación: {multiplicacion}");

                Fraccion division = fraccion1.Dividir(fraccion2);
                Console.WriteLine($"División: {division}");
            }
            catch (FraccionException ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }
    }

}

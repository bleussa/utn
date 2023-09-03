using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Ingrese la primera cadena: ");
        String cadena1 = Console.ReadLine();

        Console.Write("Ingrese la segunda cadena: ");
        String cadena2 = Console.ReadLine();

        if (cadena2.Length > cadena1.Length)
        {
            Console.WriteLine("La segunda cadena no puede ser más larga que la primera.");
        }
        else
        {
            if (cadena1.Contains(cadena2))
            {
                Console.WriteLine("ENCONTRADO");
            }
            else
            {
                Console.WriteLine("NO ENCONTRADO");
            }
        }
    }
}

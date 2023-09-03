using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Ingrese el número de filas: ");
        int filas = int.Parse(Console.ReadLine());

        Console.Write("Ingrese el número de columnas: ");
        int columnas = int.Parse(Console.ReadLine());

        Console.WriteLine("Resultado:");

        for (int i = 1; i <= filas; i++)
        {
            for (int j = 1; j <= columnas; j++)
            {
                if (i == filas && j == columnas)
                {
                    Console.Write("X");
                }
                else
                {
                    Console.Write("0");
                }

                if (j < columnas)
                {
                    Console.Write(" ");
                }
            }
            Console.WriteLine();
        }
    }
}

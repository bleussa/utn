using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Ingrese la cadena de números separados por coma: ");
        string cadena = Console.ReadLine();

        string[] valores = cadena.Split(',');

        int sumaTotal = 0;
        foreach (string valor in valores)
        {
            if (int.TryParse(valor, out int numero))
            {
                sumaTotal += numero;
            }
        }

        Console.WriteLine($"La suma total de los valores es: {sumaTotal}");
    }
}

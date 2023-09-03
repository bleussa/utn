using System;
using System.Threading;

class Program
{
    static void Main(string[] args)
    {
        Thread hiloCincoSeg = new Thread(EjecutarHiloCincoSeg);
        Thread hiloDiezSeg = new Thread(EjecutarHiloDiezSeg);
        Thread hiloUnSeg = new Thread(EjecutarHiloUnSeg);

        hiloCincoSeg.Start();
        hiloDiezSeg.Start();
        hiloUnSeg.Start();
    }

    static void EjecutarHiloCincoSeg()
    {
        while (true)
        {
            Console.WriteLine("5s - HILO EJECUTADO 5");
            Thread.Sleep(5000); // Espera 5 segundos
        }
    }

    static void EjecutarHiloDiezSeg()
    {
        while (true)
        {
            Console.WriteLine("10s -HILO EJECUTADO 10");
            Thread.Sleep(10000); // Espera 10 segundos
        }
    }

    static void EjecutarHiloUnSeg()
    {
        while (true)
        {
            Console.WriteLine("1s - HILO EJECUTADO 1");
            Thread.Sleep(1000); // Espera 5 segundos
        }
    }
}

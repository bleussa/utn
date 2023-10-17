using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
Codifique un programa que contenga un método llamado “ejecutarHilo()” que imprima
por consola la leyenda “HILO EJECUTADO” implemente el código necesario para que
por medio de la ejecución de Hilos el método “ejecutarHilo()” se ejecute cada 10
segundos.
*/

namespace PreParcial {
    class Ejercicio2 {

        public void iniciarHilo(){
            Thread hiloDiezSeg = new Thread(EjecutarHiloDiezSeg);

            hiloDiezSeg.Start();
        }

        public void EjecutarHiloDiezSeg() {
            while(true) {
                Console.WriteLine("HILO EJECUTADO");
                Thread.Sleep(10000);
            }
        }
    }
}

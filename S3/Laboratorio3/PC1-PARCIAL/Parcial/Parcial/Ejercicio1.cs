using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
Cree una aplicación de Consola que permita por parte del usuario el ingreso por teclado
de un valor entero.
Codifique un método denominado divisionRecursiva (int numero) que aplique la divida el
número a la mitad (numero / 2) y aplique recursión hasta que el valor de numero sea menor
a 1. Muestre por consola cada uno de los valores calculados en cada una de las recursiones
Realice el control de excepciones correspondiente. 15% 
*/

namespace Parcial {
    class Ejercicio1 {

        public int ingresoNumero() {
            int enteroADividir;

            while (true) {
                try {
                    Console.WriteLine("Ingresa un numero entero:");
                    enteroADividir = int.Parse(Console.ReadLine());
                    break;
                } catch (Exception ex) {
                    Console.WriteLine(ex.Message);
                }
            }

            return enteroADividir;
        }

        public void recursion(double numero) {
            if (numero < 1) {
                Console.WriteLine(numero);
            } else {
                Console.WriteLine(numero);
                recursion(numero / 2);
            }
        }

    }
}

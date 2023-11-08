using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
Cree un programa que permita ingresar por teclado un valor entero impar mayor o
igual a 5 el cual indicara el número de filas y de columnas de un array. Valide que el
valor ingresado sea un valor entero impar mayor o igual a 5, caso contrario emita una
excepción (mediante throw) que muestre el mensaje “El valor ingresado no es un
numero entero impar mayor o igual a 5.” Cree un array de 2 dimensiones de orden
filas X columnas.
Genere una matriz cuyas filas/columnas colindantes a la celda central tengan asignado
un carácter X, el resto carácter 0. 
*/

namespace PreParcial {
    class Ejercicio1 {

        public int pedirNumeros() {
            int tamanoMatriz = 0;

            while (true) {
                try {
                    Console.WriteLine("Ingresa un número impar igual o mayor a 5:");
                    tamanoMatriz = int.Parse(Console.ReadLine());

                    if (tamanoMatriz >= 5 && tamanoMatriz % 2 != 0) {
                        return tamanoMatriz;
                    } else {
                        throw new Exception("El valor ingresado no es un numero entero impar mayor o igual a 5.");
                    }
                } catch (Exception ex) {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public void crearMatriz(int tamanio) {
            string[,] matriz = new string[tamanio, tamanio];
            int centro = (tamanio / 2);

            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++) {
                    if (i < centro - 1 || i > centro + 1 || j < centro - 1 || j > centro + 1 || (i == centro && j == centro)){
                        matriz[i, j] = "a";
                    } else {
                        matriz[i, j] = "A";
                    }
                }
            }

            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++) {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine("");
            }

        }

    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
Cree un programa que permita ingresar por teclado un valor entero impar entre 3 y 15
(valide el rango y que sea impar), mediante el valor entero cree una matriz de 2 dimensiones
de orden igual al valor entero. Complete la matriz con números aleatorios Random, a
excepción de la última fila de la matriz que deberá ingresarse de forma manual.
Muestre por pantalla la matriz resultante
Finalmente obtenga los valores almacenados en la celda central de la matriz junto con sus
valores colindantes (las celdas que rodean al centro).
Muestre por pantalla los valores de las celdas centrales y calcule el valor promedio de las
mismas. 
*/

namespace Parcial {
    class Ejercicio2 {

        public int pedirNumeros() {
            int tamanoMatriz = 0;

            while (true) {
                try {
                    Console.WriteLine("Ingresa un número impar igual o mayor a 5 e igual o menor a 15:");
                    tamanoMatriz = int.Parse(Console.ReadLine());

                    if (tamanoMatriz >= 5 && tamanoMatriz <= 15 && tamanoMatriz % 2 != 0) {
                        return tamanoMatriz;
                    } else {
                        throw new Exception("El valor ingresado no es un numero entero impar mayor o igual a 5 y menor o igual a 15.");
                    }
                } catch (Exception ex) {
                    Console.WriteLine(ex.Message);
                }
            }
        }


        public void crearMatriz(int tamanio) {
            int[,] matriz = new int[tamanio, tamanio];
            int centro = (tamanio / 2);
            Random rnm = new Random();

            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++) {
                    
                    if (i == tamanio - 1) {
                        try {
                            Console.WriteLine("Ingresa un entero para la columna " + j + " fila " + i );
                            int numeroIngresado = int.Parse(Console.ReadLine());
                            matriz[i, j] = numeroIngresado;
                        } catch (Exception ex) {
                            Console.WriteLine(ex.Message);
                        }
                    } else {
                        matriz[i, j] = rnm.Next(9);
                    }
                }
            }

            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++) {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }

            List<int> valoresCentrales = new List<int>();
            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++) {
                    if (i < centro - 1 || i > centro + 1 || j < centro - 1 || j > centro + 1 || (i == centro && j == centro)) {
                        // nada
                    } else {
                        valoresCentrales.Add(matriz[i, j]);
                    }
                }
            }
            valoresCentrales.Add(matriz[centro, centro]);

            Console.WriteLine("Valores de las celdas centrales:");
            double promedio = 0;
            foreach (int valor in valoresCentrales) {
                Console.Write(valor + " ");
                promedio += valor;
            }
            Console.WriteLine("El promedio es " + promedio / valoresCentrales.Count);

        }

    }
}
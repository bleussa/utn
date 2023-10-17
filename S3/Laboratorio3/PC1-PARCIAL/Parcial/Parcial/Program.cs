using System;
using MySql.Data.MySqlClient;

namespace Parcial {

    class Program {

        public static void Main() {

            // EJERCICIO 1
            // Ejercicio1 ej1 = new Ejercicio1();
            // ej1.recursion(ej1.ingresoNumero());

            // EJERCICIO 2
            // Ejercicio2 ej2 = new Ejercicio2();
            // ej2.crearMatriz(ej2.pedirNumeros());

            // EJERCICIO 3
            /*
            select id, creation_date from purchase_orders po ;
            select quantity, unit_cost  from purchase_order_details pod ; 
            select product_code, product_name, category from products p ; 
            */

            // EJERCICIO 4
            Console.WriteLine("### EJERCIO 4 ###");
            Ejercicio4 ej4 = new Ejercicio4();
            string data = ej4.obtenerJSON("http://168.194.207.98:8081/json/lista_heroes.php");
            List<Heroe> heroes = ej4.mapearJSON(data);
            ej4.imprimirJSON(ej4.mapearJSON(data));

            // EJERCICIO 5
            Console.WriteLine("### EJERCIO 5 ###");
            string path = Path.GetFullPath("../../../heroes.xml");
            XML.Ejecutar(heroes, path);
            Console.WriteLine("");


        }

    }

}
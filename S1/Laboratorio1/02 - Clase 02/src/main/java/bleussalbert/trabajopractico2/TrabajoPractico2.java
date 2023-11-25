package bleussalbert.trabajopractico2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

/**
 * @author bleussa
 * JDK = 18.0.2.1
 * NETBEANS = 14
 */
public class TrabajoPractico2 {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        // EJERCICIO 01 //
        /* Codifique un programa que solicite el ingreso de un numero decimal y
        asigne el mismo a una variable valorDecimal de tipo double, aplique
        las operaciones de CASTING para convertir la variable a los siguientes 
        tipos de datos, short, int, long, String, float investigue las 
        diferentes formas de lograr la conversión. Muestre por pantalla el 
        resultado de las conversiones */
        
        /*
            double valorDecimal;
            System.out.println("Ingresa un número:");
            valorDecimal = sc.nextDouble();
            
            System.out.println("Valor Decimal: " + valorDecimal);
            System.out.println("Valor Short: " + (short)valorDecimal);
            System.out.println("Valor Integer: " + (int)valorDecimal);
            System.out.println("Valor Long: " + (long)valorDecimal);
            System.out.println("Valor String: " + String.valueOf(valorDecimal));
            System.out.println("Valor Float: " + (float)valorDecimal);
        */
        
        
        // EJERCICIO 02 //
        /* Si se asigna un valor a una variable fuera de rango (mayor de lo 
        establecido) ¿Qué ocurre? ¿Existe alguna forma de resolverlo? */
        
        /*     
            long numberA = 40002L;
            short numberB = (short)numberA;
            System.out.println(numberB);
        */
        
        /*
            * Lo que ocurre al querer convertir un long en un short es una
            * conversion primitiva de estrechamiento. La conversión solo retiene
            * los 16 bits menos significativos (10011100 01000010).
            *
            * Ese 1 inicial se interpreta en la notación de complemento a 2 como 
            * -2^15, no +2^15. Eso explica por qué hay una diferencia de 2^16, 
            * de 65.536, en el valor largo y el valor corto.
        */
        
        
        // EJERCICIO 03 //
        /* Codifique un algoritmo que solicite el ingreso de un numero de 
        3 dígitos (100 - 999) y por medio del uso de las operaciones matemáticas
        módulo 10 y división por 10 efectué la suma de los 3 dígitos del 
        número. */
        
        /*
            int inputNumber;
            int result = 0;
            
            do{
                System.out.println("Escriba un numero del 100 al 999");
                inputNumber = sc.nextInt();
            } while (inputNumber < 100 || inputNumber > 999);
            
            while(inputNumber > 0){
                result += inputNumber % 10;
                inputNumber = inputNumber / 10;
            }
            
            System.out.println(result);
        */
        
        
        // EJERCICIO 04 //
        /* Desarrolle un programa que ayude a una cajera a determinar el número 
        de billetes y monedas que se necesitan de cada una de las siguientes
        denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 
        0.10 y 0.05 centavos para una cantidad de dinero dada. Ejemplo si la 
        cantidad es 1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 
        1 billete de 50, 2 billetes de 20, 1 moneda de 0.50 y una moneda de 0.05
        centavos. */
        
        /*
            double inputMoney;
            inputMoney = sc.nextDouble();

            double b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;

            System.out.println("VALOR INGRESADO = " + inputMoney);

            if (inputMoney >= 0 && inputMoney <= 100000000){

                b200 = inputMoney / 200;
                b200 = (int)b200;
                inputMoney = inputMoney - b200 * 200;

                b100 = inputMoney / 100;
                b100 = (int)b100;
                inputMoney = inputMoney - b100 * 100;

                b50 = inputMoney / 50;
                b50 = (int)b50;
                inputMoney = inputMoney - b50 * 50;

                b20 = inputMoney / 20;
                b20 = (int)b20;
                inputMoney = inputMoney - b20 * 20;

                b10 = inputMoney / 10;
                b10 = (int)b10;
                inputMoney = inputMoney - b10 * 10;

                b5 = inputMoney / 5;
                b5 = (int)b5;
                inputMoney = inputMoney - b5 * 5;

                b2 = inputMoney / 2;
                b2 = (int)b2;
                inputMoney = inputMoney - b2 * 2;

                b1 = inputMoney / 1;
                b1 = (int)b1;
                inputMoney = inputMoney - b1 * 1;
            }

            System.out.println("--------------------------");
            System.out.println("BILLETES DE 200: " + b200);
            System.out.println("BILLETES DE 100: " + b100);
            System.out.println("BILLETES DE 50: " + b50);
            System.out.println("BILLETES DE 20: " + b20);
            System.out.println("BILLETES DE 10: " + b10);
            System.out.println("BILLETES DE 5: " + b5);
            System.out.println("BILLETES DE 2: " + b2);
            System.out.println("BILLETES DE 1: " + b1);
        */

        
        
        // EJERCICIO 05 //
        /* Solicite el ingreso de un número y conviértalo a un String mediante
        String.valueOf */
        
        /*
            System.out.println("Ingresa el Entero: ");
            int inputNumber = sc.nextInt();
            System.out.println("INT -> STRING = " + String.valueOf(inputNumber));
        */
        
        
        // EJERCICIO 06 //
        /* Del siguiente String “La lluvia en Mendoza es escasa” indique cual es
        el tamaño de la cadena es decir su número de caracteres. */
        
        /*
            String inputString = "La lluvia en Mendoza es escasa";
            System.out.println(inputString);
            System.out.println("El tamaño de la cadena es = " + inputString.length());
        */
        
        
        // EJERCICIO 07 //
        /* Solicite el ingreso de una cadena y determine el tamaño de la misma y
        cuantas vocales tiene en total (recorre el String con charAt */
        
        /*
            int contadorVocales = 0;
            String inputCadena = sc.nextLine();
            int caracteres = inputCadena.length();
            System.out.println("El tamaño de la cadena es = " + caracteres);
            
            for (int n = 0; n < caracteres; n++){
                if (inputCadena.charAt(n) == 'A' || inputCadena.charAt(n) == 'a'){
                    contadorVocales = contadorVocales + 1;
                }
                if (inputCadena.charAt(n) == 'E' || inputCadena.charAt(n) == 'e'){
                    contadorVocales = contadorVocales + 1;
                }
                if (inputCadena.charAt(n) == 'I' || inputCadena.charAt(n) == 'i'){
                    contadorVocales = contadorVocales + 1;
                }
                if (inputCadena.charAt(n) == 'O' || inputCadena.charAt(n) == 'o'){
                    contadorVocales = contadorVocales + 1;
                }
                if (inputCadena.charAt(n) == 'U' || inputCadena.charAt(n) == 'u'){
                    contadorVocales = contadorVocales + 1;
                }
            }
            
            System.out.println("Cantidad de Vocales = " + contadorVocales);
        */
        
        
        // EJERCICIO 08 //
        /* Reemplaza todas las a del String anterior por una e. */
        
        /*    
            String inputCadena = sc.nextLine(); 
            inputCadena = inputCadena.replace('A', 'E');
            inputCadena = inputCadena.replace('a', 'e');
            System.out.println(inputCadena);
        */
        
        
        // EJERCICIO 09 // 
        /* Recorre el String del ejercicio 6 y transforma cada carácter a su 
        código ASCII. Muéstralos en línea recta, separados por un espacio entre 
        cada carácter. */

        /*
            String inputString = "La lluvia en Mendoza es escasa.";
            int caracteres = inputString.length();
            for (int n = 0; n < caracteres; n++){
                System.out.print((int)inputString.charAt(n) + " ");
            }

         */
        
        
        // EJERCICIO 10 //
        /* Convertir una frase a mayúsculas o minúsculas, que daremos opción a 
        que el usuario lo pida y mostraremos el resultado por pantalla */
        
        /*
            System.out.println("Ingrese la frase a convertir: ");
            String inputFrase = sc.nextLine();
            int inputConversion;
            
            do {
                System.out.println("Ingrese el numero de la conversion a realizar:");
                System.out.println("1. Minusculas");
                System.out.println("2. Mayusculas");
                inputConversion = sc.nextInt();
            } while (inputConversion <= 0 || inputConversion >= 3);
            
            if (inputConversion == 1){
                inputFrase = inputFrase.toLowerCase();
            } else if (inputConversion == 2){
                inputFrase = inputFrase.toUpperCase();
            }

            System.out.println("RESULTADO = " + inputFrase);
        */
        
        
        // EJERCICIO 11 //
        /* Pedir dos palabras por teclado, indicar si son iguales. (equals, 
        compareTo, compareToIgnoreCase) */
        
        /*
            System.out.println("Ingrese la palabra 1: ");
            String inputPalabra1 = sc.nextLine();
            System.out.println("Ingrese la palabra 2: ");
            String inputPalabra2 = sc.nextLine();

            if(inputPalabra1.compareTo(inputPalabra2) == 0){
                System.out.println("Las palabras son identicas!");
            } else {
                System.out.println("Las palabras no coinciden!");
            }
        */
        
        
        // EJERCICIO 12 //
        /* Dada una cadena, extraer la cuarta y quinta letra usando el método 
        substring. */
        
        /*
            System.out.println("Ingrese la frase: ");
            String inputFrase = sc.nextLine();
            
            System.out.println("Cuarta y Quinta letra = " + inputFrase.substring(4,6));
        */
        
        
        // EJERCICIO 13 //
        /* Pedir el ingreso de dos cadenas por por teclado, indicar si la 
        segunda cadena se encuentra dentro de la primera (usar indexOf o 
        contains). */
        
        /*
            System.out.println("Ingrese la frase 1: ");
            String inputFrase1 = sc.nextLine();
            System.out.println("Ingrese la frase 2: (Busqueda)");
            String inputFrase2 = sc.nextLine();
            
            if (inputFrase1.contains(inputFrase2)) {
                System.out.println("La Frase 1 contiene a la Frase 2");
            } else {
                System.out.println("La Frase 1 no contiene a la Frase 2");
            };
        */
        
        
        // EJERCICIO 14 //
        /* Indique cual es la diferencia entre los datos primitivos (por valor) 
        ejemplo el int y su contraparte por referencia ejemplo Integer. */
        
        /*
            * Las variables tipo VALOR son entidades elementales: un número, 
            * un carácter, un valor verdadero o falso, mientras que las 
            * variables tipo OBJETO son entidades complejas que pueden estar 
            * formadas por la agrupación de muchas variables y métodos.
            * Ademas las variables tipo OBJETO nos permiten asignarle null.
        */
        
        
        // EJERCICIO 15 //
        /* Indique que sucede si realizo la siguiente declaración de variable:
        int numero = null; ¿Qué debo modificar para poder asignar null a la 
        variable?*/
        
        /* 
            * int numero = null;
            * Al intentar asignar el valor null a esa variable el IDE nos dice:
            * "incompatible types: <null> cannot be converted to int"
            * Pero si intentamos asignar el valor null a la variable tipo Objeto
            * no hay problema.
            * Integer numero = null;
        */
        
        
        // EJERCICIO 16 //
        /* Como transformo una variable tipo Double a una variable double */
        
        /*
            Double numero1 = 64.58;
            double numero2 = numero1.doubleValue();
            System.out.println("Double = " + numero1);
            System.out.println("double = " + numero2);
        */    
        
        
        // EJERCICIO 17 //
        /*  */

        /*
            System.out.println("Introducir la fecha: dd/mm/aaaa");
            String inputFecha = sc.nextLine();

            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = format.parse(inputFecha);

            System.out.println(FuncionesPrograma.getFechaString(fecha, format));
        */


        // EJERCICIO 18 //
        /*  */

        /*
            System.out.println("Introducir el dia:");
            int dia = sc.nextInt();
            System.out.println("Introducir el mes:");
            int mes = sc.nextInt();
            System.out.println("Introducir el anio:");
            int anio = sc.nextInt();

            System.out.println(FuncionesPrograma.getFechaDate(dia, mes, anio));
        */



        // EJERCICIO 21 //
        /* Codifique un programa que solicite un número entero mayor a cero y que
        mediante recursión sume todos los números números naturales desde el
        número ingresado hasta 1*/

        /*
            System.out.println("Ingrese el valor a sumar recursivamente: ");
            int valorIngresado = sc.nextInt();

            int resultado = Recursividad.sumaRecursiva(valorIngresado);
            System.out.println(resultado);
        */


        // EJERCICIO 22 //
        /* Suma los dígitos de un número ingresado por el usuario de forma recursiva */

        /*
            System.out.println("Ingresa el valor a sumar sus digitos recursivamente:");
            int valorIngresado = sc.nextInt();

            int resultado = Recursividad.sumaDigitosRecursiva(valorIngresado);
            System.out.println(resultado);
        */


        // EJERCICIO 23 //
        /* Crea un programa donde se pida el ingreso de una cadena y por medio de
        recursión mostrar la cadena de forma inversa. */


            System.out.println("Ingresa el la cadena a visualizar al reves.");
            String valorIngresado = sc.nextLine();

            String resultado = Recursividad.fraseReves(valorIngresado);
            System.out.println(resultado);

    }


}

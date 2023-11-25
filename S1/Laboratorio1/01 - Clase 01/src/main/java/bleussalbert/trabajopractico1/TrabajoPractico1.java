package bleussalbert.trabajopractico1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author bleussa
 * JDK = 18.0.2.1
 * NETBEANS = 14
 */
public class TrabajoPractico1 {

    public static void main(String[] args) {
        
        // EJERCICIO 01 - Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
        /*
            String nombre = "Fernando";
            System.out.println("Bienvenido " + nombre);
        */
        
        // EJERCICIO  02 - Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica Scanner y JOptionPane).
        /*
            String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
            System.out.println("Bienvenido " + nombre);
        */
        
        // EJERCICIO 03 - Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
        /*
            double a = 25;
            double b = 16;

            double suma, resta, div, mod, mult;
            suma = a + b;
            resta = a - b;        
            div = a / b;
            mod = a % b;
            mult = a * b;

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Div: " + div);
            System.out.println("Mod: " + mod);
            System.out.println("Mult: " + mult);
        */

        // EJERCICIO 04 - Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también.
        /*
            String mensaje;
            double a,b;
            a = 5;
            b = 13;
            
            if(a > b){
                mensaje = "A es mayor que B";
            } else if (a == b){
                mensaje = "A es igual que B";
            } else {
                mensaje = "B es mayor que A";
            }
            
            System.out.println(mensaje);
        */
        
        // EJERCICIO 05 - Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
        /*    
            Scanner sc = new Scanner(System.in);
            double num;
            System.out.println("Ingresa un número:");
            num = sc.nextDouble();
        
            if(num % 2 == 0){
                System.out.println("El número es divisible por dos");
            } else {
                System.out.println("El número no es divisible por dos");
            }
        */
        
        // EJERCICIO 06 - Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. 
        /*    
            Scanner sc = new Scanner(System.in);
            double producto;
            System.out.println("Ingresa el precio del producto:");
            producto = sc.nextDouble();
            System.out.println("El precio del producto con IVA es de :" + producto *1.21);
        */

        // EJERCICIO 07 - Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
        /*
            int a,b;
            a = 1;
            b = 100;

            while (a <= b){
                System.out.println(a);
                a = a+1;
            }
        */

        // EJERCICIO 08 - Haz el mismo ejercicio anterior con un bucle for.
        /*
            int a,b;
            a = 1;
            b = 100;

            for (a = 1; a<=b; a++){
                System.out.println(a);
            }
        */

        // EJERCICIO 09 - Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
        /*    
            int a,b;
            a = 1;
            b = 100;

            for (a = 1; a<=b; a++){
               if(a % 2 == 0 || a % 3 == 0)
                    System.out.println(a);   
                }
            }
        */

        // EJERCICIO 10 - Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
        /*
            Scanner sc = new Scanner(System.in);
            double num;

            do{
                System.out.println("Ingresar valor");
                num = sc.nextDouble();
                if (num >= 0){
                        System.out.println(num);
                }
            } while (num < 0); 
        */
        
        // EJERCICIO 11 - Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos.
        /*
            String password, passwordInput;
            int contador;
            password = "clave123";
            contador = 0;
            
            do {
                System.out.println("Ingresa la contraseña: ");
                Scanner sc = new Scanner(System.in);
                passwordInput = sc.nextLine();
                if (password.equals(passwordInput)){
                    System.out.println("Acceso correcto!");
                    contador = 4;
                } else {
                    System.out.println("Contraseña incorrecta");
                    contador = contador + 1;
                }
            } while (contador < 3);
        */
        
        // EJERCICIO 12 - Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no (siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.
        /*
            int dayInput;
            dayInput = 0;
            
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa el número del día (1 a 7)");
                dayInput = sc.nextInt();
            } while (dayInput <= 0 || dayInput >= 8);
                
            switch(dayInput){
                case 1:
                    System.out.println("LUNES: DÍA LABORAL");
                    break;
                case 2:
                    System.out.println("MARTES: DÍA LABORAL");
                    break;
                case 3:
                    System.out.println("MIERCOLES: DÍA LABORAL");
                    break;
                case 4:
                    System.out.println("JUEVES: DÍA LABORAL");
                    break;
                case 5:
                    System.out.println("VIERNES: DÍA LABORAL");
                    break;
                case 6:
                    System.out.println("SABADO: DÍA NO LABORAL");
                    break;
                case 7:
                    System.out.println("DOMINGO: DÍA NO LABORAL");
                    break;
            }
        */
        
        // EJERCICIO 13 - Pide un número por teclado e indica si es un número primo o no.
        /*   
            int numInput, contador;
            contador = 0;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un número:");
            numInput = sc.nextInt();
            
            for(int i = numInput; i > 0; i--){
                if(numInput % i == 0 ){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.println("ES PRIMO");;
            } else {
                System.out.println("NO ES PRIMO");
            }
        */
        
        // EJERCICIO 14
        /*    
            int numInput, numRandom, contador;
            numInput = 0;
            contador = 0;
        
            numRandom = new Double(Math.random() * 100).intValue();
            System.out.println(numRandom);
            
            while (numInput != numRandom){
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa un número del 1 al 100:");
                numInput = sc.nextInt();
                
                if (numInput > numRandom){
                    System.out.println("El numero ingresado es muy alto!");
                    contador = contador + 1;
                } else if (numInput < numRandom) {
                    System.out.println("El número ingresado es muy bajo!");
                    contador = contador + 1;
                } else {
                    System.out.println("Encontraste el número!");
                    System.out.println("Numero de Intentos: " + contador);
                } 
            }
        */
    }
}

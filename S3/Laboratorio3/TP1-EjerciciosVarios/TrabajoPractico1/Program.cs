using System;

public class TP1
{
    public static void Main(string[] args)
    {

        // EJERCICIO 1
        /* Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 5. Utiliza las
        iteraciones for, while, do/while para resolver el mismo problema. */

        /*
        Console.WriteLine("-- BUCLE FOR ------");
        for (int a = 1; a <= 100; a++)
        {
            if (a % 2 == 0 && a % 5 == 0)
            {
                Console.WriteLine(a);
            }
        }

        Console.WriteLine("-- BUCLE WHILE ----");
        int b = 1;
        while (b <= 100)
        {
            if (b % 2 == 0 && b % 5 == 0)
            {
                Console.WriteLine(b);
            }
            b++;
        }

        Console.WriteLine("-- BUCLE DO WHILE -");
        int c = 1;
        do
        {
            if (c % 2 == 0 && c % 5 == 0)
            {
                Console.WriteLine(c);
            }
            c++;
        } while (c <= 100); 
        */

        // EJERCICIO 2
        /*
        int a = numeroAleatorio();
        int b = 0;
        int intentos = 0;
        while (a != b)
        {
            Console.WriteLine("Escribi un numero:");
            b = int.Parse(Console.ReadLine());
            if (b > a)
            {
                Console.WriteLine("El numero que escribiste es mayor!");
                intentos++;
            }
            else if (b < a)
            {
                Console.WriteLine("El numero que escribiste es menor!");
                intentos++;
            }
            else
            {
                Console.WriteLine("Excelente le pegaste! Te tomo " + intentos + " intentos.");
                break;
            }
        }
        */

        // EJERCICIO 3
        /*
        Console.WriteLine("Escriba un numero (0 para salir)");
        int a = -1;
        do
        {
            a = int.Parse(Console.ReadLine());
            if (esPar(a))
            {
                Console.WriteLine("Es par");
            }
            else
            {
                Console.WriteLine("No es par");
            }
        } while (a != 0); 
        */

        // EJERCICIO 4
        /*
        seleccionarOperacion(); 
        */

        // EJERCICIO 5
        /*
        while (true)
        {
            Console.WriteLine("Desea ingresar un trabajador? (S/N)");
            String decision;
            decision = Console.ReadLine();
            if (decision.ToLower().Equals("s"))
            {
                ingresarTrabajador();
            }
            else if (decision.ToLower().Equals("n"))
            {
                break;
            }
            else
            {
                Console.WriteLine("Dato invalido. Por favor ingresar S o N.");
            }
        }  
        */

        // EJERCICIO 6
        // recursionHasta100m(2); 


        // EJERCICIO 7
        /*
        String Lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi maximus leo non magna ornare dignissim.";

        // LENGHT -> Da el tamaño de caracteres
        Console.WriteLine("LENGHT       | Tamaño del string: " + Lorem.Length);

        // CONTAINS -> Devuelve un boolean si contiende el caracter pasado como parametro
        if (Lorem.Contains("L"))
        {
            Console.WriteLine("CONTAINS     | Contiene la letra 'L'");
        } else
        {
            Console.WriteLine("CONTAINS     | No contiene la letra 'L'");
        }

        // INDEX OF -> Devuelve el numero de posicion del primer caracter encontrado
        int indexOft = Lorem.IndexOf("t");
        Console.WriteLine("INDEX OF 't' | " + indexOft);

        // REMOVE ->  Remueve todo a partir de la posicion pasada por parametro
        String onlyLorem = Lorem.Remove(5);
        Console.WriteLine("REMOVE       | " + onlyLorem);

        // REPLACE -> Reemplaza un valores indicados
        String ReplaceString = "Uno, Dos, Tres, Tres, Doce, Cuatro, Dos, Uno, Uno";
        Console.WriteLine("REPLACE 1    | " + ReplaceString);
        String newReplaceString = ReplaceString.Replace("Uno", "Cero");
        Console.WriteLine("REPLACE 2    | " + newReplaceString);

        // SUBSTRING -> Trae una cadena interna de un texto
        Console.WriteLine("SUBSTRING    | " + Lorem.Substring(6, 11));

        // TO LOWER & TO UPPER -> Cambia el tipo de texto
        Console.WriteLine("TO LOWER     | " + Lorem.ToLower());
        Console.WriteLine("TO UPPER     | " + Lorem.ToUpper()); 
        */
    }

    public static long recursionHasta100m(long x)
    {
        long resultado = x * x;
        if(resultado > 100000000L) {
            Console.WriteLine(x + " * " + x + " = " + resultado);
            return resultado;
        }
        else
        {
            Console.WriteLine(x + " * " + x + " = " + resultado);
            return recursionHasta100m(resultado);
        }
    }
    
    public static void ingresarTrabajador()
    {
        Console.WriteLine("Ingrese la hora de ingreso (formato HH:mm):");
        string horaIngresoStr = Console.ReadLine();
        Console.WriteLine("Ingrese la hora de salida (formato HH:mm):");
        string horaSalidaStr = Console.ReadLine();

        if (DateTime.TryParseExact(horaIngresoStr, "HH:mm", null, System.Globalization.DateTimeStyles.None, out DateTime horaIngreso) &&
            DateTime.TryParseExact(horaSalidaStr, "HH:mm", null, System.Globalization.DateTimeStyles.None, out DateTime horaSalida))
        {
            if (horaSalida < horaIngreso)
            {
                horaSalida = horaSalida.AddDays(1);
            }

            TimeSpan tiempoLaboral = horaSalida - horaIngreso;
            int minutosLaborales = (int)tiempoLaboral.TotalMinutes;

            if (minutosLaborales > 480)
            {
                Console.WriteLine("La cantidad de horas trabajadas no puede superar las 8 horas.");
                return;
            }

            decimal valorHora = 10.0m;
            if ((horaIngreso.Hour >= 20 || horaSalida.Hour < 8) ||
                (horaIngreso.Hour < 8 && horaSalida.Hour < 8 && horaSalida.Hour >= horaIngreso.Hour))
            {
                valorHora *= 1.5m;
            }

            decimal sueldo = valorHora * (decimal)(minutosLaborales / 60.0);

            Console.WriteLine($"Horas trabajadas: {minutosLaborales / 60.0}");
            Console.WriteLine($"Sueldo a pagar: ${sueldo}");
        }
        else
        {
            Console.WriteLine("Formato de hora incorrecto. Usar HH:mm.");
        }
    }

    public static Boolean validarHora(int hora)
    {
        if (hora >= 0 && hora <= 23)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static Boolean validarMinuto(int min)
    {
        if (min >= 0 && min <= 59)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    



    public static int numeroAleatorio()
    {
        Random rn = new Random();
        return rn.Next(0, 100 + 1);
    }

    public static Boolean esPar(int n)
    {
        if (n % 2 == 0)
        {
            return true;
        }
        else return false;
    }
    public static void seleccionarOperacion()
    {
        int opcion = -1;
        while (true)
        {
            Console.WriteLine("Seleccione una opción");
            Console.WriteLine("1. Suma");
            Console.WriteLine("2. Resta");
            Console.WriteLine("3. Multiplicacion");
            Console.WriteLine("4. Division");
            Console.WriteLine("5. Modulo");
            Console.WriteLine("0. Salir");
            opcion = int.Parse(Console.ReadLine());
            if (opcion == 0)
            {
                break;
            }
            else
            {
                switch (opcion)
                {
                    case 1:
                        Console.WriteLine(suma());
                        break;
                    case 2:
                        Console.WriteLine(resta());
                        break;
                    case 3:
                        Console.WriteLine(multiplicar());
                        break;
                    case 4:
                        Console.WriteLine(dividir());
                        break;
                    case 5:
                        Console.WriteLine(modulo());
                        break;
                    default:
                        Console.WriteLine("Error");
                        break;
                }
            }

        }

    }

    public static int pedirNumero()
    {
        Console.WriteLine("Ingresa un numero: ");
        int numero = int.Parse(Console.ReadLine());
        return numero;
    }
    public static int suma()
    {
        int a = pedirNumero();
        int b = pedirNumero();
        return a + b;
    }
    public static int resta()
    {
        int a = pedirNumero();
        int b = pedirNumero();
        return a - b;
    }
    public static int multiplicar()
    {
        int a = pedirNumero();
        int b = pedirNumero();
        return a * b;
    }
    public static int dividir()
    {
        int a = pedirNumero();
        int b = pedirNumero();
        return a / b;
    }
    public static int modulo()
    {
        int a = pedirNumero();
        int b = pedirNumero();
        return a % b;
    }
}



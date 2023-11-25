package bleussa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Metodos mtd = new Metodos();
        Alumno alm = new Alumno();
        Scanner scan = new Scanner(System.in);

        int cantAlumnosIngresados = 0;
        while (cantAlumnosIngresados < 3){
            System.out.println("Cuantos alumnos desea ingresar?");
            cantAlumnosIngresados = scan.nextInt();
        }

        Alumno[] arrayAlumnos = new Alumno[cantAlumnosIngresados];

        alm.CrearAlumnos(arrayAlumnos);

        alm.TablaAlumnos(arrayAlumnos);

        MejorAlumno malm = new MejorAlumno(arrayAlumnos);

    }
}
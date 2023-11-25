package bleussa;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {

    private String apellido;
    private String nombre;
    private int legajo;
    private double[] notas;
    private double promedioNotas;
    Scanner scan = new Scanner(System.in);

    public Alumno(){};

    public Alumno(String apellido, String nombre, int legajo, double[] notas, double promedioNotas){
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = notas;
        this.promedioNotas = promedioNotas;
    }

    public void MostrarAlumno(){
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Notas: " + Arrays.toString(this.notas));
        System.out.println("Promedio: " + this.promedioNotas);
    }

    public void CrearAlumnos(Alumno[] arrayAlumnos){
        for (int i = 0; i < arrayAlumnos.length; i++){
            System.out.println();
            System.out.println("-- ALUMNO " + i + "--");

            System.out.println("Ingrese el apellido");
            String apellidoIngresado = scan.next();

            System.out.println("Ingrese el nombre");
            String nombreIngresado = scan.next();

            System.out.println("Ingrese el legajo");
            int legajoIngresado = scan.nextInt();

            System.out.println("Ingrese la cantidad de notas:");
            int cantNotas = scan.nextInt();
            double[] notasIngresadas = new double[cantNotas];
            double notasTotal = 0;
            for (int j = 0; j < notasIngresadas.length; j++){
                int notasIngresada = 0;
                while (notasIngresada < 1 || notasIngresada > 10){
                    System.out.println("Ingrese la nota " + j);
                    notasIngresadas[j] = scan.nextDouble();
                    if (notasIngresadas[j] >= 1 && notasIngresadas[j] <=10){
                        notasTotal = notasTotal + notasIngresadas[j];
                        break;
                    } else {
                        System.out.println("Nota invalida");
                    }

                }
            }

            double promedioNotasIngresadas = notasTotal / notasIngresadas.length;

            arrayAlumnos[i] = new Alumno(apellidoIngresado, nombreIngresado, legajoIngresado, notasIngresadas, promedioNotasIngresadas);
        }
    }

    public void TablaAlumnos(Alumno[] arrayAlumnos){
        System.out.println("");
        System.out.println("LISTADO ALUMNOS");
        for (int i = 0; i < arrayAlumnos.length; i++){
            System.out.print(arrayAlumnos[i].legajo + " ");
            System.out.print(arrayAlumnos[i].apellido + " ");
            System.out.print(arrayAlumnos[i].nombre + " ");
            System.out.print(Arrays.toString(arrayAlumnos[i].notas) + " ");
            System.out.println(arrayAlumnos[i].promedioNotas+ " ");
        }
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
}

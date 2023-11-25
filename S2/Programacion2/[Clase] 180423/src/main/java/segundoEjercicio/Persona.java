package segundoEjercicio;

import java.util.Scanner;

public class Persona {
    private String nombre;
    public Documento d;

    public Persona(String nombre, int tipoDoc, long numero) {
        this.nombre = nombre;
        while (true) {
            try {
                this.d = new Documento(tipoDoc, numero);
                break;
            } catch (Exception e) {
                System.out.println("Error en el número de DNI");
                System.out.println("Ingrese un nuevo número: ");
                Scanner scan = new Scanner(System.in);
                numero = scan.nextLong();
            }
        }
    }

    @Override
    public String toString() {
        return "> Persona" + "\n> Nombre: " + nombre + d.toString();
    }
}

package tienda;

import java.util.HashSet;
import java.util.Scanner;

public class ComponenteCPU {

    // Atributos
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    // Getters y Setters
    public String getComponente() {
        return componente;
    }
    public void setComponente(String componente) {
        this.componente = componente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Constructores
    public ComponenteCPU(){};

    public ComponenteCPU(String componente, String marca, int cantidad, double precio) {
        this.componente = componente;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Metodos
    public static ComponenteCPU crearComponente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Componente: ");
        String componente = sc.nextLine();
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.println("Precio: ");
        double precio = sc.nextDouble();
        return new ComponenteCPU(componente, marca, cantidad, precio);
    }
}

package tienda;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Computadora{

    // Atributos
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> componentes;

    // Getters and Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public HashSet<ComponenteCPU> getComponentes() {
        return componentes;
    }
    public void setComponentes(HashSet<ComponenteCPU> componentes) {
        this.componentes = componentes;
    }

    // Constructores
    public Computadora(){
        componentes = new HashSet<ComponenteCPU>();
    };

    public Computadora(String marca, String modelo, HashSet<ComponenteCPU> componentes) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = componentes;
    }

    public static Computadora crearPresupuesto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Marca: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("## COMPONENTES ## ");
        System.out.println("Agregar componente? S/N");
        String ingresar = sc.nextLine();
        HashSet<ComponenteCPU> componentes = new HashSet<>();
        while (!ingresar.equalsIgnoreCase("N")){
            componentes.add(ComponenteCPU.crearComponente());
            System.out.println("Agregar componente? S/N");
            ingresar = sc.nextLine();
        }

        return new Computadora(marca, modelo, componentes);
    }

    public static double totalPresupuesto(Computadora compu){
        double total = 0;
        for (ComponenteCPU componente : compu.getComponentes()){
            total += componente.getPrecio() * componente.getCantidad();
        }
        return total;
    }

    public static double sugeridoPresupuesto(double total){
        double totalSugerido = 0;
        if (total < 50000){
            totalSugerido = total * 0.4;
        } else {
            totalSugerido = total * 0.3;
        }
        return totalSugerido;
    }

    public static void mostrarPresupuesto(Computadora compu){
        System.out.println(" ");
        System.out.println("#### COMPUTADORA ####");
        System.out.println("Marca = " + compu.getMarca());
        System.out.println("Modelo = " + compu.getModelo());
        System.out.println("Componentes = ");
        System.out.printf("%15s %15s %15s %20s %20s", "Componente", "Marca", "Cantidad", "Precio x Unidad", "SubTotal");
        System.out.println(" ");
        for (ComponenteCPU componente : compu.getComponentes()) {
            System.out.printf("%15s %15s %15s %20s %20s", componente.getComponente(), componente.getMarca(),
                    componente.getCantidad(), componente.getPrecio(), componente.getPrecio() * componente.getCantidad());
            System.out.println("");
        }
        System.out.printf("%15s %15s %15s %20s %20s", " ", " ", " ", "Costo Total", totalPresupuesto(compu));
        System.out.println(" ");
        System.out.println("El precio sugerido de venta es " + totalPresupuesto(compu) + " + " + sugeridoPresupuesto(totalPresupuesto(compu)) + " = " + (totalPresupuesto(compu) + sugeridoPresupuesto(totalPresupuesto(compu))));
        System.out.println(" ");
    }



}

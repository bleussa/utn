/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bleussa.clase140323;

/**
 *
 * @author bleussa
 */
public class Camion extends Vehiculo implements Trabajar{
    private int cantidadEjes;

    public Camion(int cantidadEjes, String marca, int modelo, int cantidadPuertas) {
        super(marca, modelo, cantidadPuertas);
        this.cantidadEjes = cantidadEjes;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    @Override
    public void cantidadHoras() {
        System.out.println("Trabajo 24hs");
    }

    @Override
    public void velocidad_promedio() {
        System.out.println("80 km/h");
    }
    
    
    
}

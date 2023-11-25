/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bleussa.Clase2103232;

/**
 *
 * @author bleussa
 */
public abstract class PoligonoRegular {
    protected int numLados; 
    protected double lado; // longitud de un lado
    
    public PoligonoRegular(int numLados, double lado) {
        this.numLados = numLados;
        this.lado = lado;
    }
    
    public double perimetro() {
        return numLados*lado;
    }
    
    public abstract double area();
    
}



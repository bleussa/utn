/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bleussa.clase210323;

/**
 *
 * @author bleussa
 */
public class Clase2103233 {

    public static void main(String[] args) {
        Perro p1 = new Perro();
        Gato g1 = new Gato();
        
        hazleHablar(p1);
        hazleHablar(g1);

    }
    
    static void hazleHablar(Animal a){
        a.habla();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bleussa.Clase2103232;

/**
 *
 * @author bleussa
 */
public class Clase2103232 {

    public static void main(String[] args) {
        
        Cuadrado c1 = new Cuadrado(4, 5.3);
        
        try {
            System.out.println(c1.area());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}

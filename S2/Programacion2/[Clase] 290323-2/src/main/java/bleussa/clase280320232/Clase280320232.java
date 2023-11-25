/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bleussa.clase280320232;

/**
 *
 * @author bleussa
 */
public class Clase280320232 {

    public static void main(String[] args) {
        Recibo r1 = new Recibo();
        r1.getFecha().setDia(28);
        r1.getFecha().setMes(03);
        r1.getFecha().setAnio(2023);
        
        r1.setTipo('A');
        r1.setNumero(2525);
        r1.getP().setCodigo(165);
        r1.getP().setRazonSocial("GEOF S.A.");
        
        r1.setDetalle("Compra mensual");        
        
        mostrarRecibo(r1);

    }
    
    public static void mostrarRecibo(Recibo r){
        System.out.println(r.getFecha().toString());
        System.out.println("Tipo: " + r.getTipo());
        System.out.println("Numero: " + r.getNumero());
        System.out.println(r.getP().toString());
        System.out.println("Detalle: " + r.getDetalle());
    }
}

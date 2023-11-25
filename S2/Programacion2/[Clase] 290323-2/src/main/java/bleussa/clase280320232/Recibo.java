/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bleussa.clase280320232;

/**
 *
 * @author bleussa
 */
public class Recibo extends Comprobante{
    private Proveedor p = new Proveedor();
    private float total;
    private String detalle;

    public Recibo() {
    }

    public Proveedor getP() {
        return p;
    }

    public void setP(Proveedor p) {
        this.p = p;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
}

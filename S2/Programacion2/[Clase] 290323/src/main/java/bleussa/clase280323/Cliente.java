/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bleussa.clase280323;

/**
 *
 * @author bleussa
 */
public class Cliente {
    private int codigo;
    private String razonSocial;

    public Cliente() {}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", razonSocial=" + razonSocial + '}';
    }
    
    
    
    
}

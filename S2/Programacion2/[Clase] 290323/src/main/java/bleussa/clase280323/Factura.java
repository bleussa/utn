/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bleussa.clase280323;

import java.util.ArrayList;

/**
 *
 * @author bleussa
 */
public class Factura extends Comprobante{
    private float total;
    private ArrayList<Producto> productos = new ArrayList<>();
    private Cliente cliente;

    public Factura() {
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addProducto(Producto p){
        this.productos.add(p);
    }
    public void deleteProducto(Producto p){
        this.productos.remove(p);
    }
    public Producto getProducto(int codigo){
        return productos.get(codigo);
    }

    @Override
    public String toString() {
        return "Factura{" + "productos=" + productos + '}';
    }

    void getFecha(Fecha fecha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

package bleussa;

import java.util.ArrayList;

public class Producto {
    private int numeroProducto;
    private String marca;
    private double precio;
    private int stock;
    private ArrayList<DetallePedido> detallesPedidos = new ArrayList<>();

    public Producto() {
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<DetallePedido> getDetallesPedidos() {
        return detallesPedidos;
    }

    public void setDetallesPedidos(ArrayList<DetallePedido> detallesPedidos) {
        this.detallesPedidos = detallesPedidos;
    }
}

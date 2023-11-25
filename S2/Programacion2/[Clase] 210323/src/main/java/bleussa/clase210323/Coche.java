package bleussa.clase210323;

public class Coche {
    private int modelo;
    private String color;
    private String marca;
    static private int descuento;

    public Coche(int modelo, String color, String marca) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public static int getDescuento() {
        return descuento;
    }
    public static void setDescuento(int descuento) {
        Coche.descuento = descuento;
    }
    
    
    
    
}

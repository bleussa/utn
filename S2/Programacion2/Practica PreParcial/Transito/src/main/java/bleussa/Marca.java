package bleussa;

public class Marca {
    private String marcaAuto;
    private Modelo modelo;

    public Marca() {}

    public String getMarcaAuto() {
        return marcaAuto;
    }
    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String queModelo(){
        return "Modelo: " + this.marcaAuto;
    }
}

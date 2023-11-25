package bleussa;

public class Fecha {
    // ATRIBUTOS
    private int dia;
    private int mes;
    private int anio;

    // CONSTRUCTORES
    public Fecha(){}

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // METODOS
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean esBisiesto(int anio) {
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}

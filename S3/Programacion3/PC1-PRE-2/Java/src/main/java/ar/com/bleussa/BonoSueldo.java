package ar.com.bleussa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class BonoSueldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoBono;

    private int mes;

    private int anio;

    private double total;

    @ManyToOne(cascade = CascadeType.ALL)
    private Empleado empleado;

    @OneToMany(mappedBy = "bonoSueldo")
    private List<ItemBono> itemsBono = new ArrayList<>();

    public int getCodigoBono() {
        return codigoBono;
    }

    public void setCodigoBono(int codigoBono) {
        this.codigoBono = codigoBono;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<ItemBono> getItemsBono() {
        return itemsBono;
    }

    public void setItemsBono(List<ItemBono> itemsBono) {
        this.itemsBono = itemsBono;
    }

    /*
    Codifique en la clase BonoSueldo un método denominado “public double
    calcularTotalHaber()” que retorne la suma calculada de los Items del Bono cuyo
    estado sea remunerativo
    */
    public double calcularTotalHaber() {
        double sumaTotal = 0;
        for (ItemBono itemBono : this.getItemsBono()) {
            if (itemBono.isEsRemunerativo()){
                sumaTotal += itemBono.getMonto();
            }
        }
        return sumaTotal;
    }

    /*
    Codifique en la clase BonoSueldo un método denominado “public double
    calcularTotalDebe()” que retorne la suma calculada de los Items del Bono cuyo
    estado no sea remunerativo.
    */
    public double calcularTotalDebe() {
        double sumaTotal = 0;
        for (ItemBono itemBono : this.getItemsBono()) {
            if (!itemBono.isEsRemunerativo()){
                sumaTotal += itemBono.getMonto();
            }
        }
        return sumaTotal;
    }

    /*
    Codifique en la clase BonoSueldo un método denominado “public double
    calcularTotalBono()” que retorne el resultante de la diferencia del total del haber
    menos el total del debe. (Debe - Haber)
    */
    public double calcularTotalBono() {
        return this.calcularTotalHaber() - this.calcularTotalDebe();
    }
}

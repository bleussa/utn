/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author bleussa
 */
public class EstadoControl {
    private long id;
    private boolean aprobado;
    private ArrayList<Control> controles = new ArrayList<>();

    public EstadoControl(long id, boolean aprobado) {
        this.id = id;
        this.aprobado = aprobado;
    }

    public EstadoControl() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setControles(ArrayList<Control> controles) {
        this.controles = controles;
    }
    
    
    
}

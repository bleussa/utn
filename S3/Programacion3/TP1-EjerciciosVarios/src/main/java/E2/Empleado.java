/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre, domicilio, email;
    private long cuit;
    private ArrayList<Asistencia> asistencias = new ArrayList<>();
    private ArrayList<Tardanza> tardanzas = new ArrayList<>();
    private RegimenHorario regimen;

    public Empleado() {
    }

    public Empleado(String nombre, String domicilio, String email, long cuit, RegimenHorario regimen) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.cuit = cuit;
        this.regimen = regimen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public ArrayList<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(ArrayList<Tardanza> tardanzas) {
        this.tardanzas = tardanzas;
    }


    public RegimenHorario getRegimen() {
        return regimen;
    }

    public void setRegimen(RegimenHorario regimen) {
        this.regimen = regimen;
    }
    
    /*
    Codifique en la clase public List<Asistencia> getAsistenciaXMesXAnio(int mes,
    int anio){} que retorne solo las asistencias del empleado correspondientes al mes y
    año indicados
    */
    public ArrayList<Asistencia> getAsistenciaXMesXAnio(int mes, int anio){
        ArrayList<Asistencia> asistencias = new ArrayList<>();
        for(Asistencia asis : this.getAsistencias()){
            if (asis.getFecha().getMonth() == mes && asis.getFecha().getYear() == anio){
                asistencias.add(asis);
            }
        }
        return asistencias;
    }

    /*
    Codifique en la clase public List<Tardanza> getDiasConTardanza(int mes, int
    anio){} retorne los días con tardanza para hacerlo verifique el horario de la asistencia
    contra el horario asignado en el régimen horario, si la asistencia supera en 15
    minutos el horario establecido en el régimen instancia de Tardanza y copie la
    información de la Asistencia a la Tardanza, almacene la tardanza en un Array del
    mismo tipo, finalmente retorne el Array de tardanzas. Reutilice el método punto
    anterior.
    */
    public ArrayList<Tardanza> getDiasConTardanza(int mes, int anio){
        ArrayList<Tardanza> tardanzas = new ArrayList<>();
        ArrayList<Asistencia> asistencias = getAsistenciaXMesXAnio(mes, anio);
        for (Asistencia asistencia : asistencias) {
            int minutosAsistencia = asistencia.getHora() * 60 + asistencia.getMinuto();
            int minutosRegimen = asistencia.getEmpleado().getRegimen().getHoraIngreso() * 60 + asistencia.getEmpleado().getRegimen().getMinutoIngreso();
            if (minutosAsistencia < minutosRegimen){
                // ACA VALIDAMOS UNA POSIBLE LLEGADA TEMPRANO DE HASTA 2 HORAS
                if (minutosRegimen - 120 > minutosAsistencia){
                    minutosAsistencia += 24 * 60;
                }
            }
            if (minutosRegimen + 15 < minutosAsistencia){
                Tardanza tardanza = new Tardanza();
                tardanza.setFecha(asistencia.getFecha());
                tardanza.setEmpleado(asistencia.getEmpleado());
                tardanza.setTipo(asistencia.getTipo());
                tardanza.setId(asistencia.getId());
                tardanza.setHora(asistencia.getHora());
                tardanza.setMinuto(asistencia.getMinuto());
                tardanzas.add(tardanza);
            }
        }
        return tardanzas;
    }
    
    

}

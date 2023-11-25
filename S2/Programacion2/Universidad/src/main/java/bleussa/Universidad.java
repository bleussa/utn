package bleussa;

import java.util.ArrayList;

public class Universidad {
    private String cunaDelConocimiento;
    private String diferentesCarreras;
    private String privada;
    private String publica;
    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private ArrayList<PersonalDocente> docentes = new ArrayList();
    private ArrayList<recoleccionDeInformacion> recoleccionDeInformacion = new ArrayList();
    private ArrayList<Region> regiones = new ArrayList();

    public Universidad(String cunaDelConocimiento, String diferentesCarreras, String privada, String publica, ArrayList<Estudiante> estudiantes, ArrayList<PersonalDocente> docentes, ArrayList<bleussa.recoleccionDeInformacion> recoleccionDeInformacion, ArrayList<Region> regiones) {
        this.cunaDelConocimiento = cunaDelConocimiento;
        this.diferentesCarreras = diferentesCarreras;
        this.privada = privada;
        this.publica = publica;
        this.estudiantes = estudiantes;
        this.docentes = docentes;
        this.recoleccionDeInformacion = recoleccionDeInformacion;
        this.regiones = regiones;
    }

    public Universidad() {
    }

    public String ayudarSociedad(){
        return "Ayudar Sociedad";
    }
    public void capacitarEstudiante(){

    }
    public String Desarrollo(){
        return "Desarrollo";
    }
    public String investigacion(){
        return "Investigacion";
    }

    public String getCunaDelConocimiento() {
        return cunaDelConocimiento;
    }

    public void setCunaDelConocimiento(String cunaDelConocimiento) {
        this.cunaDelConocimiento = cunaDelConocimiento;
    }

    public String getDiferentesCarreras() {
        return diferentesCarreras;
    }

    public void setDiferentesCarreras(String diferentesCarreras) {
        this.diferentesCarreras = diferentesCarreras;
    }

    public String getPrivada() {
        return privada;
    }

    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getPublica() {
        return publica;
    }

    public void setPublica(String publica) {
        this.publica = publica;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<PersonalDocente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<PersonalDocente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<bleussa.recoleccionDeInformacion> getRecoleccionDeInformacion() {
        return recoleccionDeInformacion;
    }

    public void setRecoleccionDeInformacion(ArrayList<bleussa.recoleccionDeInformacion> recoleccionDeInformacion) {
        this.recoleccionDeInformacion = recoleccionDeInformacion;
    }

    public ArrayList<Region> getRegiones() {
        return regiones;
    }

    public void setRegiones(ArrayList<Region> regiones) {
        this.regiones = regiones;
    }
}

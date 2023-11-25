package video2;

public enum Mes {
    ENERO(1,31, Estacion.VERANO),
    FEBRERO(2,28, Estacion.VERANO),
    MARZO(3,31, Estacion.VERANO),
    ABRIL(4,30, Estacion.OTONIO),
    MAYO(5,31, Estacion.OTONIO),
    JUNIO(6,30, Estacion.OTONIO),
    JULIO(7,31, Estacion.INVIERNO),
    AGOSTO(8,31, Estacion.INVIERNO),
    SEPTIEMBRE(9,30, Estacion.INVIERNO),
    OCTUBRE(10,31, Estacion.PRIMAVERA),
    NOVIEMBRE(11,30, Estacion.PRIMAVERA),
    DICIEMBRE(12,31, Estacion.PRIMAVERA);

    private int orden;
    private int numDias;
    private Estacion estacion;

    private Mes(int orden, int numDias, Estacion estacion){
        this.orden = orden;
        this.numDias = numDias;
        this.estacion = estacion;
    }
    public int getOrden(){
        return this.orden;
    }
    public int getNumDias() {
        return this.numDias;
    }
    public Estacion getEstacion() {
        return estacion;
    }

    @Override
    public String toString() {
        return "El mes "+ this.name().toLowerCase() + " es el mes " + getOrden() + "º y tiene " + getNumDias() + " dias, pertenece a la estacion: " + getEstacion().toString().toLowerCase();
    }
}

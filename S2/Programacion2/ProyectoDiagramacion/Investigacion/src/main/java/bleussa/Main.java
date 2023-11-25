package bleussa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos un detective y seteamos sus datos
        Detective detective = new Detective("Joaquin", "Peralta", new Foto(), new ArrayList<MedioDeComunicacion>(), new ArrayList<Perfil>(), "ARG263");
        detective.getFoto().setNombre("ARG263_profile.jpg");
        detective.getFoto().setTamanio(2.32F);
        detective.getFoto().setPathToFile("/img/profile_photos/");
        detective.getComunicaciones().add(new MedioDeComunicacion());
        detective.getComunicaciones().get(0).setDescripcion("Walkietokie");
        detective.getComunicaciones().get(0).setTipoDeMedio("Radio Frecuencia");
        detective.getComunicaciones().add(new MedioDeComunicacion());
        detective.getComunicaciones().get(1).setDescripcion("Celular");
        detective.getComunicaciones().get(1).setTipoDeMedio("Red Movil");
        detective.getPerfiles().add(new Perfil());
        detective.getPerfiles().get(0).setTipoPerfil(0);
        detective.getPerfiles().get(0).setDescripcion("Civil");
        detective.getPerfiles().add(new Perfil());
        detective.getPerfiles().get(1).setTipoPerfil(1);
        detective.getPerfiles().get(1).setDescripcion("Policia");

        // Creamos un mafioso y seteamos sus datos
        Mafioso mafioso1 = new Mafioso("Tomas", "Binichi", new Foto(), new ArrayList<MedioDeComunicacion>(), new ArrayList<Perfil>(), new ArrayList<Lugar>());
        mafioso1.getFoto().setNombre("TomasBinichi_profile.jpg");
        mafioso1.getFoto().setTamanio(1.58F);
        mafioso1.getFoto().setPathToFile("/img/profile_photos/");
        mafioso1.getComunicaciones().add(new MedioDeComunicacion());
        mafioso1.getComunicaciones().get(0).setTipoDeMedio("Red Satelital");
        mafioso1.getComunicaciones().get(0).setDescripcion("Celular Satelital");
        mafioso1.getPerfiles().add(new Perfil());
        mafioso1.getPerfiles().get(0).setTipoPerfil(0);
        mafioso1.getPerfiles().get(0).setDescripcion("Mafioso");
        mafioso1.getPerfiles().add(new Perfil());
        mafioso1.getPerfiles().get(1).setTipoPerfil(1);
        mafioso1.getPerfiles().get(1).setDescripcion("Civil");
        mafioso1.getPerfiles().add(new Perfil());
        mafioso1.getPerfiles().get(2).setTipoPerfil(2);
        mafioso1.getPerfiles().get(2).setDescripcion("Policia");
        mafioso1.getLugaresFrecuentes().add(new Lugar());
        mafioso1.getLugaresFrecuentes().get(0).setNombre("Plaza");
        mafioso1.getLugaresFrecuentes().get(0).setDescripcion("Plaza frente a la comisaria");

        // Creamos otro mafioso y seteamos sus datos
        Mafioso mafioso2 = new Mafioso("Pablo", "Lutter", new Foto(), new ArrayList<MedioDeComunicacion>(), new ArrayList<Perfil>(), new ArrayList<Lugar>());
        mafioso2.getFoto().setNombre("PabloLutter_profile.jpg");
        mafioso2.getFoto().setTamanio(2.2F);
        mafioso2.getFoto().setPathToFile("/img/profile_photos/");
        mafioso2.getComunicaciones().add(new MedioDeComunicacion());
        mafioso2.getComunicaciones().get(0).setTipoDeMedio("Red Satelital");
        mafioso2.getComunicaciones().get(0).setDescripcion("Celular Satelital");
        mafioso2.getComunicaciones().add(new MedioDeComunicacion());
        mafioso2.getComunicaciones().get(1).setTipoDeMedio("Red Movil");
        mafioso2.getComunicaciones().get(1).setDescripcion("Celular");


        imprimirReporte(detective, mafioso1, mafioso2);
        imprimirReporte(mafioso1);
        imprimirReporte(mafioso2);
    }
    public static void imprimirReporte(Detective detective, Mafioso mafioso1, Mafioso mafioso2){
        System.out.println(" > DETECTIVE");
        System.out.println("    > NOMBRE COMPLETO: " + detective.getNombre() + " " + detective.getApellido());
        System.out.println("    > NUMERO DE PLACA: " + detective.getNumeroPlaca());
        System.out.println("    > FOTO");
        System.out.println("        > NOMBRE: " + detective.getFoto().getNombre());
        System.out.println("        > RUTA DEL ARCHIVO: " + detective.getFoto().getPathToFile());
        System.out.println("        > TAMANIO DEL ARCHIVO: " + detective.getFoto().getTamanio());
        System.out.println("    > MEDIOS DE COMUNICACION");
        for (MedioDeComunicacion mdc : detective.getComunicaciones()) {
            System.out.println("        > TIPO DE MEDIO: " + mdc.getTipoDeMedio());
            System.out.println("        > DESCRIPCION: " + mdc.getDescripcion());
        }
        System.out.println("    > PERFILES");
        for (Perfil p : detective.getPerfiles()) {
            System.out.println("        > TIPO: " + p.getTipoPerfil());
            System.out.println("        > DESCRIPCION: " + p.getDescripcion());
        }
        System.out.println("");
        if (detective.investigarMafioso(mafioso1)){
            System.out.println("El detective " + detective.getNombre() + " esta investigando a " + mafioso1.getNombre());
        } else {
            System.out.println("El detective " + detective.getNombre() + " no esta investigando a " + mafioso1.getNombre());
        }
        if (detective.investigarMafioso(mafioso2)){
            System.out.println("El detective " + detective.getNombre() + " esta investigando a " + mafioso2.getNombre());
        } else {
            System.out.println("El detective " + detective.getNombre() + " no esta investigando a " + mafioso2.getNombre());
        }
        System.out.println("");
    }

    public static void imprimirReporte(Mafioso mafioso){
        System.out.println(" > MAFIOSO");
        System.out.println("    > NOMBRE COMPLETO: " + mafioso.getNombre() + " " + mafioso.getApellido());
        System.out.println("    > FOTO");
        System.out.println("        > NOMBRE: " + mafioso.getFoto().getNombre());
        System.out.println("        > RUTA DEL ARCHIVO: " + mafioso.getFoto().getPathToFile());
        System.out.println("        > TAMANIO DEL ARCHIVO: " + mafioso.getFoto().getTamanio());
        System.out.println("    > MEDIOS DE COMUNICACION");
        for (MedioDeComunicacion mdc : mafioso.getComunicaciones()) {
            System.out.println("        > TIPO DE MEDIO: " + mdc.getTipoDeMedio());
            System.out.println("        > DESCRIPCION: " + mdc.getDescripcion());
        }
        System.out.println("    > PERFILES");
        for (Perfil p : mafioso.getPerfiles()) {
            System.out.println("        > TIPO: " + p.getTipoPerfil());
            System.out.println("        > DESCRIPCION: " + p.getDescripcion());
        }
        System.out.println("    > LUGARES FRECUENTES");
        for (Lugar l : mafioso.getLugaresFrecuentes()){
            System.out.println("        > NOMBRE: " + l.getNombre());
            System.out.println("        > DESCRIPCION: " + l.getDescripcion());
        }
        System.out.println("");
        if (mafioso.investigar()){
            System.out.println("El mafioso " + mafioso.getNombre() + " esta siendo investigado.");
        } else {
            System.out.println("El mafioso " + mafioso.getNombre() + " no esta siendo investigado.");
        }
        System.out.println("");
    }


}
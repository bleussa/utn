package bleussa;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        estudiante.setAspiranteAGrado(5);

        // SETEAMOS LA UNIVERSIDAD
        estudiante.getUniversidades().add(new Universidad());
        estudiante.getUniversidades().get(0).setCunaDelConocimiento("Ingenieria");
        estudiante.getUniversidades().get(0).setDiferentesCarreras("Sistemas,Civil,Industrial,Mecanica");
        estudiante.getUniversidades().get(0).setPrivada("FALSE");
        estudiante.getUniversidades().get(0).setPublica("TRUE");
        estudiante.getUniversidades().get(0).getEstudiantes().add(estudiante);
        // SETEAMOS LA REGION DE LA UNIVERSIDAD
        estudiante.getUniversidades().get(0).getRegiones().add(new Region());
        estudiante.getUniversidades().get(0).getRegiones().get(0).setAspectoSocioCulturales("Aspecto Socio Cultural X");
        estudiante.getUniversidades().get(0).getRegiones().get(0).setNivelGrupal("Medio");
        estudiante.getUniversidades().get(0).getRegiones().get(0).setNivelPersonal("Medio");
        estudiante.getUniversidades().get(0).getRegiones().get(0).setParteEspecificaDelPais("Norte");
            // APLICAMOS BIDIRECCIONALIDAD
        estudiante.getUniversidades().get(0).getRegiones().get(0).getUniversidades().add(estudiante.getUniversidades().get(0));

            // SETEAMOS LAS NECESIDADES DE LA REGION
        estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().add(new Necesidad());
        estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().get(0).setDefinir("Cambio de proyectores");
        estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().get(0).getInterfazIngresoInformaciones().add(new interfazIngresoInformacion());
        estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().get(0).getInterfazIngresoInformaciones().get(0).setComentariosAbiertosEnLinea("No se ve correctamente el proyector del aula 5");
        estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().get(0).getInterfazIngresoInformaciones().get(0).setPlataformaDeSoftware((byte) 1);
        estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().get(0).getInterfazIngresoInformaciones().get(0).setFormularioEnLinea("Proyecto Proyector 2024");

        //Problemas
        estudiante.getUniversidades().get(0).getRegiones().get(0).getProblemas().add(new Problema());
        estudiante.getUniversidades().get(0).getRegiones().get(0).getProblemas().get(0).setDefinir("Playa");
        //InterfazIngresoInformacion de Problemas
        estudiante.getUniversidades().get(0).getRegiones().get(0).getProblemas().get(0).getInterfazIngresoInformaciones().add(new interfazIngresoInformacion());
        estudiante.getUniversidades().get(0).getRegiones().get(0).getProblemas().get(0).getInterfazIngresoInformaciones().get(0).setComentariosAbiertosEnLinea("No hay espacio para los vehiculos en la playa");
        estudiante.getUniversidades().get(0).getRegiones().get(0).getProblemas().get(0).getInterfazIngresoInformaciones().get(0).setFormularioEnLinea("Proyecto Playa 2024");
        estudiante.getUniversidades().get(0).getRegiones().get(0).getProblemas().get(0).getInterfazIngresoInformaciones().get(0).setPlataformaDeSoftware((byte) 0);

        // SETEAMOS EL PROYECTO DE GRADO
        estudiante.setProyectoDeGrado(new ProyectoDeGrado());
        estudiante.getProyectoDeGrado().setAlcance("Nacional");
        estudiante.getProyectoDeGrado().setCosto(299999);
        estudiante.getProyectoDeGrado().setObjetivo("Crear un sistema de organizacion");
        estudiante.getProyectoDeGrado().setPlanDeProyecto("Plan de Proyecto #1");
        estudiante.getProyectoDeGrado().setTiempoDeRealizacion(3);
        estudiante.getProyectoDeGrado().setTitulo("ST");
        estudiante.getProyectoDeGrado().setViabilidad(75);

        // SETEAMOS LOS DOCENTES
        estudiante.getDocentes().add(new PersonalDocente());
        estudiante.getDocentes().get(0).setConocimiento("Informatica");
        estudiante.getDocentes().get(0).setExperiencia("10 anios");
        estudiante.getDocentes().get(0).setTrayectoria(10);
        estudiante.getDocentes().add(new PersonalDocente());
        estudiante.getDocentes().get(1).setConocimiento("Sistemas Operativos");
        estudiante.getDocentes().get(1).setExperiencia("5 anios");
        estudiante.getDocentes().get(1).setTrayectoria(5);
        estudiante.getDocentes().get(0).setRecopilacion(new Recopilacion());
        estudiante.getDocentes().get(1).setRecopilacion(estudiante.getDocentes().get(0).getRecopilacion());
        estudiante.getDocentes().get(0).getRecopilacion().setDatosMayorFavorabilidad("Dato Favorable #1");
        estudiante.getDocentes().get(0).getRecopilacion().setDatosMayorUrgencia("Dato Urgente #1");
        estudiante.getDocentes().get(0).getRecopilacion().setDatosDeLosAfecutados("Afectados");
        estudiante.getDocentes().get(0).getRecopilacion().setDatosDeLosDirectamenteInterezados("Directamente Interesados");
        estudiante.getDocentes().get(0).getRecopilacion().setComentariosAbiertosEnLinea("Comentario en Linea");
        estudiante.getDocentes().get(0).getRecopilacion().setFormularioEnLinea("Formulario en linea");
        estudiante.getDocentes().get(0).getRecopilacion().setPlataformaDeSoftware((byte) 0);
        estudiante.getDocentes().get(0).getUniversidades().add(estudiante.getUniversidades().get(0));
        estudiante.getDocentes().get(1).getUniversidades().add(estudiante.getUniversidades().get(0));
        estudiante.getDocentes().get(0).setProyecto(estudiante.getProyectoDeGrado().getEjecucionDelProyecto());
        estudiante.getDocentes().get(1).setProyecto(estudiante.getProyectoDeGrado().getEjecucionDelProyecto());

        // SETEAMOS EJECUCION DEL PROYECTO
        estudiante.setEjecucionDelProyecto(estudiante.getProyectoDeGrado().getEjecucionDelProyecto());
        estudiante.getEjecucionDelProyecto().getEstudiantes().add(estudiante);
        estudiante.getEjecucionDelProyecto().setProyectoDeGradoTerminado("En progreso");
        estudiante.getEjecucionDelProyecto().setRecursosDisponibles(100);
        estudiante.getEjecucionDelProyecto().getResultado().setImplementacionFinalizada("La implementacion todavia no finaliza");

        // SETEAMOS PROYECTO DE GRADO
        estudiante.getProyectoDeGrado().setSolucion(new Solucion());
        estudiante.getProyectoDeGrado().getSolucion().setAlternativas("[Pendiente]");
        estudiante.getEstudianteSolucion().add(new EstudianteSolucion());
        estudiante.getEstudianteSolucion().get(0).setEstudiante(estudiante);
        estudiante.getProyectoDeGrado().getSolucion().getEstudianteSolucion().add(estudiante.getEstudianteSolucion().get(0));
        estudiante.getEstudianteSolucion().get(0).setSolucion(estudiante.getProyectoDeGrado().getSolucion());

        imprimirReporte(estudiante);

    }

    public static void imprimirReporte(Estudiante estudiante){
        System.out.println("\n# REPORTE DE DATOS #");
        System.out.println("\n1. Universidad que estudia el Estudiante");
        for (int i = 0; i < estudiante.getUniversidades().size(); i++) {
            System.out.println("    Universidad: " + estudiante.getUniversidades().get(i).getCunaDelConocimiento());
            System.out.println("    Carreras: " + estudiante.getUniversidades().get(i).getDiferentesCarreras());
            System.out.println("    Privada: " + estudiante.getUniversidades().get(i).getPrivada());
            System.out.println("    Publica: " + estudiante.getUniversidades().get(i).getPublica());
        }

        System.out.println("\n2. Necesidades Instafisfechas");
        for (int i = 0; i < estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().size(); i++) {
            System.out.println("    " + estudiante.getUniversidades().get(0).getRegiones().get(0).getNecesidades().get(i).getDefinir());
        }

        System.out.println("\n3. Proyecto de Grado");
        System.out.println("    Titulo: " + estudiante.getProyectoDeGrado().getTitulo());
        System.out.println("    Alcance: " + estudiante.getProyectoDeGrado().getAlcance());
        System.out.println("    Costo: " + estudiante.getProyectoDeGrado().getCosto());
        System.out.println("    Objetivo: " + estudiante.getProyectoDeGrado().getObjetivo());
        System.out.println("    Plan: " + estudiante.getProyectoDeGrado().getPlanDeProyecto());
        System.out.println("    Tiempo de Realización: " + estudiante.getProyectoDeGrado().getTiempoDeRealizacion());
        System.out.println("    Viabilidad: " + estudiante.getProyectoDeGrado().getViabilidad());

        System.out.println("\n4. Resultados del Proyecto de Grado");
        System.out.println("    " + estudiante.getEjecucionDelProyecto().getResultado().getImplementacionFinalizada());

        System.out.println("\n5. Afectados e Interesados");
        System.out.println("    Datos de los afectados: " + estudiante.getDocentes().get(0).getRecopilacion().getDatosDeLosAfecutados());
        System.out.println("    Datos de los interesados: " + estudiante.getDocentes().get(0).getRecopilacion().getDatosDeLosDirectamenteInterezados());

        System.out.println("\n6. Docentes");
        for (int i = 0; i < estudiante.getDocentes().size(); i++) {
            System.out.println("    Docente : " + (i+1));
            System.out.println("    Conocimientos: " + estudiante.getDocentes().get(i).getConocimiento());
            System.out.println("    Experiencia: " + estudiante.getDocentes().get(i).getExperiencia());
            System.out.println("    Trayectoria: " + estudiante.getDocentes().get(i).getTrayectoria());
        }

    }
}
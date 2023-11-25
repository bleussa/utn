package bleussa;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Primero creamos una clinica con un listado de especialidades vacio
        Clinica clinica = new Clinica(new ArrayList<Especialidad>());

        // Agregamos especialidades creadas dentro del constructor
        clinica.addEspecialidad(new Especialidad("Traumatologia"));
        clinica.addEspecialidad(new Especialidad("Radiologia"));
        clinica.addEspecialidad(new Especialidad("Pediatria"));
        clinica.addEspecialidad(new Especialidad("Psiquiatria"));

        // Agregamos medicos a las especialidades
        clinica.obtenerEspecialidad("Traumatologia").addMedico(new Medico("Fernando Gomez"));
        clinica.obtenerEspecialidad("Traumatologia").addMedico(new Medico("Carlos Lettuk"));
        clinica.obtenerEspecialidad("Radiologia").addMedico(new Medico("Jose Maria Rinno"));
        clinica.obtenerEspecialidad("Pediatria").addMedico(new Medico("Esteban Sosa"));
        clinica.obtenerEspecialidad("Psiquiatria").addMedico(new Medico("Agustina Vasquez"));
        clinica.obtenerEspecialidad("Psiquiatria").addMedico(new Medico("Romina Nieto"));

        // Agregamos habitaciones a las especialidades
        clinica.obtenerEspecialidad("Traumatologia").addHabitacion(new Habitacion(1));
        clinica.obtenerEspecialidad("Traumatologia").addHabitacion(new Habitacion(2));
        clinica.obtenerEspecialidad("Traumatologia").addHabitacion(new Habitacion(3));
        clinica.obtenerEspecialidad("Radiologia").addHabitacion(new Habitacion(4));
        clinica.obtenerEspecialidad("Radiologia").addHabitacion(new Habitacion(5));
        clinica.obtenerEspecialidad("Pediatria").addHabitacion(new Habitacion(6));
        clinica.obtenerEspecialidad("Pediatria").addHabitacion(new Habitacion(7));
        clinica.obtenerEspecialidad("Pediatria").addHabitacion(new Habitacion(8));
        clinica.obtenerEspecialidad("Psiquiatria").addHabitacion(new Habitacion(9));

        // Agregamos camas a las habitaciones
        clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(0).addCama(new Cama());
        clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(0).addCama(new Cama());
        clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(1).addCama(new Cama());
        clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(1).addCama(new Cama());
        clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(2).addCama(new Cama());
        clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(2).addCama(new Cama());
        clinica.obtenerEspecialidad("Radiologia").getHabitaciones().get(0).addCama(new Cama());
        clinica.obtenerEspecialidad("Radiologia").getHabitaciones().get(1).addCama(new Cama());
        clinica.obtenerEspecialidad("Pediatria").getHabitaciones().get(0).addCama(new Cama());
        clinica.obtenerEspecialidad("Pediatria").getHabitaciones().get(0).addCama(new Cama());
        clinica.obtenerEspecialidad("Pediatria").getHabitaciones().get(1).addCama(new Cama());
        clinica.obtenerEspecialidad("Pediatria").getHabitaciones().get(1).addCama(new Cama());
        clinica.obtenerEspecialidad("Pediatria").getHabitaciones().get(2).addCama(new Cama());
        clinica.obtenerEspecialidad("Pediatria").getHabitaciones().get(2).addCama(new Cama());
        clinica.obtenerEspecialidad("Psiquiatria").getHabitaciones().get(0).addCama(new Cama());

        // Agregamos pacientes a cada medico y los asignamos a una habitacion y a una cama

            // PACIENTE 1
            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").addPaciente(new Paciente("A01", "Soledad Esturlo", 'F', new Fecha(15, 2, 1975)));

            clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(0).getCama(0).setPaciente(
                    clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Soledad Esturlo")
            );

            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Soledad Esturlo").getDiagnosticos().add(new Diagnostico("Dolor de cabeza", TipoDiagnostico.TD_LEVE));

            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Soledad Esturlo").getDiagnosticos().get(0).setTratamiento(new Tratamiento("Parasetamol"));

            // PACIENTE 2
            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").addPaciente(new Paciente("K02", "Gonzalo Tobares", 'M', new Fecha(5, 12, 1999)));

            clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(0).getCama(1).setPaciente(
                    clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Gonzalo Tobares")
            );

            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Gonzalo Tobares").getDiagnosticos().add(new Diagnostico("Dolor de coxis", TipoDiagnostico.TD_LEVE));
            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Gonzalo Tobares").getDiagnosticos().get(0).setTratamiento(new Tratamiento("Corticoides"));

            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Gonzalo Tobares").getDiagnosticos().add(new Diagnostico("Fractura expuesta", TipoDiagnostico.TD_MUYGRAVE));
            clinica.obtenerEspecialidad("Traumatologia").getMedico("Fernando Gomez").getPaciente("Gonzalo Tobares").getDiagnosticos().get(1).setTratamiento(new Tratamiento("A cirugia"));

            // PACIENTE 3
            clinica.obtenerEspecialidad("Traumatologia").getMedico("Carlos Lettuk").addPaciente(new Paciente("F84", "Carla Jimenez", 'F', new Fecha(10, 2, 1995)));

            clinica.obtenerEspecialidad("Traumatologia").getHabitaciones().get(1).getCama(0).setPaciente(
                    clinica.obtenerEspecialidad("Traumatologia").getMedico("Carlos Lettuk").getPaciente("Carla Jimenez")
            );

            clinica.obtenerEspecialidad("Traumatologia").getMedico("Carlos Lettuk").getPaciente("Carla Jimenez").getDiagnosticos().add(new Diagnostico("Infeccion", TipoDiagnostico.TD_GRAVE));
            clinica.obtenerEspecialidad("Traumatologia").getMedico("Carlos Lettuk").getPaciente("Carla Jimenez").getDiagnosticos().get(0).setTratamiento(new Tratamiento("Dieta"));

            clinica.obtenerEspecialidad("Traumatologia").getMedico("Carlos Lettuk").getPaciente("Carla Jimenez").getDiagnosticos().add(new Diagnostico("Dolor abdominal", TipoDiagnostico.TD_LEVE));
            clinica.obtenerEspecialidad("Traumatologia").getMedico("Carlos Lettuk").getPaciente("Carla Jimenez").getDiagnosticos().get(1).setTratamiento(new Tratamiento("Buscapina"));


















        imprimirReporte(clinica);
    }

    public static void imprimirReporte(Clinica clinica){
        System.out.println("");
        System.out.println("> REPORTE DE CLINICA");
        System.out.println("");

        System.out.println("\u001B[34m" + "    > ESPECIALIDADES" + "\u001B[0m");
        for (Especialidad e : clinica.getEspecialidades()) {
            System.out.println("\u001B[34m" + "        > NOMBRE: " + e.getNombre());
            System.out.println("        > MEDICOS: " + e.getMedicos().toString());
            System.out.println("        > HABITACIONES: " + e.getHabitaciones().toString());
            System.out.println("\u001B[0m");
        }

        System.out.println("\u001B[35m" + "    > PACIENTES + DIAGNOSTICO x MEDICO" + "\u001B[0m");
        for (Especialidad e : clinica.getEspecialidades()) {
            for (Medico m : e.getMedicos()) {
                System.out.println("\u001B[35m" + "        > MEDICO: " + m.getNombreApellidos() + " (PACIENTES: " + m.getCargaPacientes() + ")");
                for (Paciente p : m.getPacientes()) {
                    System.out.println("            > NOMBRE: " + p.getNombreApellidos());
                    System.out.println("            > FECHA NAC: " + p.getFechaNacimiento().toString());
                    System.out.println("            > NSIP: " + p.getNsip());
                    System.out.println("            > SEXO: " + p.getSexo());
                    System.out.println("            > DIAGNOSTICOS: ");
                    for (Diagnostico d: p.getDiagnosticos()) {
                        System.out.println("                > DESCRIPCION: " + d.getTexto());
                        System.out.println("                > TRATAMIENTO: " + d.getTratamiento().getTexto());
                        System.out.println("                > TIPO: " + d.getTipoDiagnostico().toString());
                    }
                    System.out.println("");
                }
                System.out.println("\u001B[0m");
            }
        }

        System.out.println("\u001B[36m" + "    > CAMAS x HABITACION x ESPECIALIDAD" + "\u001B[0m");
        for (Especialidad e : clinica.getEspecialidades()) {
            System.out.println("\u001B[36m" + "        > NOMBRE: " + e.getNombre());
            for (Habitacion h : e.getHabitaciones()){
                System.out.println("        |   > HABITACION: " + h.getNumero());
                System.out.println("        |   > NUMERO DE CAMAS: " + h.getNumCamas());
                for (Cama c : h.getCamas()){
                    System.out.println("        |       > CAMA: " + h.getCamas().indexOf(c));
                    System.out.println("        |       > ES OCUPADA: " + c.esOcupada());
                    if (c.esOcupada()){
                        System.out.println("        |       > POR: " + c.getPaciente().getNombreApellidos());
                    } else {
                        System.out.println("        |       > POR: NADIE");
                    }
                }
            }
            System.out.println("\u001B[0m");
        }
    }
}
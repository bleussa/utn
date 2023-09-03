/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Creamos un empleado
        Empleado albert = new Empleado("Alberto", "Gutierrez", "ba@gmail.com", 20442470635L, new RegimenHorario());

        // Seteamos su regimen Horario
        albert.getRegimen().setId(46548);
        albert.getRegimen().setHoraIngreso(9);
        albert.getRegimen().setMinutoIngreso(30);
        albert.getRegimen().setHoraEgreso(17);
        albert.getRegimen().setMinutoEgreso(30);

        // Creamos algunas asistencias
        albert.getAsistencias().add(new Asistencia());
        albert.getAsistencias().get(0).setEmpleado(albert);
        albert.getAsistencias().get(0).setId(464878);
        albert.getAsistencias().get(0).setTipo("Entrada");
        albert.getAsistencias().get(0).setFecha(new Date(2023, 8, 5));
        albert.getAsistencias().get(0).setHora(9);
        albert.getAsistencias().get(0).setMinuto(58);

        albert.getAsistencias().add(new Asistencia());
        albert.getAsistencias().get(1).setEmpleado(albert);
        albert.getAsistencias().get(1).setId(45648);
        albert.getAsistencias().get(1).setTipo("Entrada");
        albert.getAsistencias().get(1).setFecha(new Date(2023, 8, 6));
        albert.getAsistencias().get(1).setHora(10);
        albert.getAsistencias().get(1).setMinuto(00);

        albert.getAsistencias().add(new Asistencia());
        albert.getAsistencias().get(2).setEmpleado(albert);
        albert.getAsistencias().get(2).setId(75449);
        albert.getAsistencias().get(2).setTipo("Entrada");
        albert.getAsistencias().get(2).setFecha(new Date(2023, 7, 3));
        albert.getAsistencias().get(2).setHora(9);
        albert.getAsistencias().get(2).setMinuto(46);

        albert.getAsistencias().add(new Asistencia());
        albert.getAsistencias().get(3).setEmpleado(albert);
        albert.getAsistencias().get(3).setId(12498);
        albert.getAsistencias().get(3).setTipo("Entrada");
        albert.getAsistencias().get(3).setFecha(new Date(2023, 7, 6));
        albert.getAsistencias().get(3).setHora(9);
        albert.getAsistencias().get(3).setMinuto(25);

        System.out.println("Horario de Entrada: " + albert.getRegimen().getHoraIngreso() + ":" + albert.getRegimen().getMinutoIngreso());

        System.out.println("Asistencias:");
        ArrayList<Asistencia> asistenciasPrint = albert.getAsistenciaXMesXAnio(7, 2023);
        for (Asistencia asis : asistenciasPrint) {
            System.out.println(" - " + asis.getFecha() + " (" + asis.getHora() + ":" + asis.getMinuto() + ")");
        }

        System.out.println("Tardanzas:");
        ArrayList<Tardanza> tardanzasPrint = albert.getDiasConTardanza(7, 2023);
        for (Tardanza tar : tardanzasPrint) {
            System.out.println(" - " + tar.getFecha() + " (" + tar.getHora() + ":" + tar.getMinuto() + ")");
        }

    }
}

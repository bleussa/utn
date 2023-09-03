package main;

import entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class PersistenceApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Domicilio domicilio1 = new Domicilio();
            domicilio1.setLocalidad("Guaymallen");
            domicilio1.setCalle("Gutierrez");
            domicilio1.setNumero(2027);

            Domicilio domicilio2 = new Domicilio();
            domicilio2.setCalle("Calle Principal");
            domicilio2.setNumero(123);
            domicilio2.setLocalidad("Ciudad AE");

            Domicilio domicilio3 = new Domicilio();
            domicilio3.setLocalidad("Godoy Cruz");
            domicilio3.setCalle("San Martin");
            domicilio3.setNumero(3698);

            Domicilio domicilio4 = new Domicilio();
            domicilio4.setCalle("Jose Riquelme");
            domicilio4.setNumero(65);
            domicilio4.setLocalidad("Capital");

            Especialidad especialidad1 = new Especialidad("Odontologia");
            Especialidad especialidad2 = new Especialidad("Neurologia");
            Especialidad especialidad3 = new Especialidad("Enfermeria");
            Especialidad especialidad4 = new Especialidad("Cirugia");

            Medico medico1 = new Medico();
            medico1.setNombre("Luis");
            medico1.setApellido("García");
            medico1.setCelular(2615551234L);
            medico1.setDni(12345678);
            medico1.setMatricula(9876);
            medico1.setDomicilio(domicilio1);
            medico1.getEspecialidades().add(especialidad1);

            Medico medico2 = new Medico();
            medico2.setNombre("Ana");
            medico2.setApellido("Martínez");
            medico2.setCelular(2615559876L);
            medico2.setDni(87654321);
            medico2.setMatricula(5678);
            medico2.setDomicilio(domicilio2);
            medico2.getEspecialidades().add(especialidad2);
            medico2.getEspecialidades().add(especialidad4);

            Medico medico3 = new Medico();
            medico3.setNombre("Marcela");
            medico3.setApellido("Pérez");
            medico3.setCelular(2617778888L);
            medico3.setDni(65432198);
            medico3.setMatricula(3456);
            medico3.setDomicilio(domicilio2);
            medico3.getEspecialidades().add(especialidad3);

            Empleado empleado1 = new Empleado();
            empleado1.setNombre("Esteban");
            empleado1.setApellido("Quito");
            empleado1.setDni(45685236);
            empleado1.setNrolegajo(9876);
            empleado1.setSueldo(59000);
            empleado1.setDomicilio(domicilio3);

            Empleado empleado2 = new Empleado();
            empleado2.setNombre("Esteban");
            empleado2.setApellido("Gonzalez");
            empleado2.setDni(23658699);
            empleado2.setNrolegajo(6359);
            empleado2.setSueldo(50000);
            empleado2.setDomicilio(domicilio4);

            Paciente paciente1 = new Paciente();
            paciente1.setNombre("Alejandra");
            paciente1.setApellido("Melnik");
            paciente1.setDni(36568699L);
            paciente1.setNroSocio(46876);
            paciente1.setDomicilio(domicilio4);

            Paciente paciente2 = new Paciente();
            paciente2.setNombre("Esteban");
            paciente2.setApellido("Morales");
            paciente2.setDni(36589655L);
            paciente2.setNroSocio(41588);
            paciente2.setDomicilio(domicilio3);

            em.persist(medico1);
            em.persist(medico2);
            em.persist(medico3);
            em.persist(empleado1);
            em.persist(empleado2);
            em.persist(paciente1);
            /* em.persist(paciente2); */

            em.flush();
            em.getTransaction().commit();

        } catch (Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }


    }
}

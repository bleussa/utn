package bleussa;

public class Main {
    public static void main(String[] args) {

        ActaDeConstatacion acta = new ActaDeConstatacion();

        acta.getInfracciones().add(new Infraccion());
        acta.getInfracciones().get(0).getInfraccionNomenclada().add(new TipoDeInfraccion());
        acta.getInfracciones().get(0).getInfraccionNomenclada().get(0).setId_infrac(1);
        acta.getInfracciones().get(0).getInfraccionNomenclada().get(0).setDescripInfraccion("Desc");
        acta.getInfracciones().get(0).getInfraccionNomenclada().get(0).setTipoGravedad("Grave");
        acta.getInfracciones().get(0).getInfraccionNomenclada().get(0).setImporteAsignadoInfraccion(1955);
        acta.getInfracciones().get(0).getInfraccionNomenclada().get(0).setPorcentajeDescuento(25);
        acta.getInfracciones().get(0).setDescripInfraccion("Desc");
        acta.getInfracciones().get(0).setImporteInfraccion(acta.getInfracciones().get(0).getInfraccionNomenclada().get(0).getImporteAsignadoInfraccion());

        acta.setOrganizacionEstatal(new OrganizacionEstatal());
        acta.getOrganizacionEstatal().setNombreOrganizacion("Nombre");
        acta.getOrganizacionEstatal().setLocalidad("Mendoza");

        acta.setLicencias(new Licencias());
        acta.getLicencias().setIdLicencia(1);
        acta.getLicencias().setFechaDeVto("21-1-1990");
        acta.getLicencias().setPuntosInicialesLicencia(123);

        Conductor conductor1 = new Conductor();
        conductor1.setNombre("A");
        conductor1.setApellido("B");
        conductor1.setDni(44247063);
        conductor1.setGenero("M");
        conductor1.setDomicilio("Avenida");

        Conductor conductor2 = new Conductor();
        conductor2.setNombre("E");
        conductor2.setApellido("A");
        conductor2.setDni(56589696);
        conductor2.setGenero("F");
        conductor2.setDomicilio("Calle");

        acta.getLicencias().getConductorLicencias().add(new ConductorLicencias(conductor1, acta.getLicencias()));
        acta.getLicencias().getConductorLicencias().add(new ConductorLicencias(conductor2, acta.getLicencias()));
        conductor1.getConductorLicencias().add(acta.getLicencias().getConductorLicencias().get(0));
        conductor2.getConductorLicencias().add(acta.getLicencias().getConductorLicencias().get(1));

    }
}
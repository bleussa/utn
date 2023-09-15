using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace XML {
    class XElementWrite {

        public static XElement Ejecutar(List<Empleado> empleadosList) {

			try {
                XElement empleados = new XElement("empleados");

                XElement listado = new XElement("listado");

                foreach (Empleado emp in empleadosList) {
                    XElement empleado = new XElement("empleado");

                    XElement id = new XElement("id", emp.Id);
                    empleado.Add(id);

                    XElement nombreCompleto = new XElement("nombreCompleto", emp.NombreCompleto);
                    empleado.Add(nombreCompleto);

                    XElement cuil = new XElement("cuil", emp.Cuil);
                    empleado.Add(cuil);

                    XElement sector = new XElement("sector");

                    XAttribute idAtributo = new XAttribute("id", emp.Sector.Id);
                    sector.Add(idAtributo);

                    XAttribute denominacionAtributo = new XAttribute("denominacion", emp.Sector.Denominacion);
                    sector.Add(denominacionAtributo);

                    XAttribute valorSemaforo = new XAttribute("valorSemaforo", emp.Sector.ValorSemaforo);
                    sector.Add(valorSemaforo);

                    XAttribute colorSemaforo = new XAttribute("colorSemaforo", emp.Sector.ColorSemaforo);
                    sector.Add(colorSemaforo);

                    empleado.Add(sector);

                    XElement cupoAsignado = new XElement("cupoAsignado", emp.CupoAsignado);
                    empleado.Add(cupoAsignado);

                    XElement cupoConsumido = new XElement("cupoConsumido", emp.CupoAsignado);
                    empleado.Add(cupoConsumido);

                    listado.Add(empleado);
                }

                empleados.Add(listado);

                XElement subsectores = new XElement("subsectores", 5);
                empleados.Add(subsectores);

                XElement totalCupoAsignadoSector = new XElement("totalCupoAsignadoSector", 4217.21);
                empleados.Add(totalCupoAsignadoSector);

                XElement totalCupoConsumidoSector = new XElement("totalCupoConsumidoSector", 1405.88);
                empleados.Add(totalCupoConsumidoSector);

                XElement valorDial = new XElement("valorDial", 33.34);
                empleados.Add(valorDial);

                return empleados;
            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
                return null;
			}

        }

        public static void Guardar(XElement empleados, string path) {

            if (File.Exists(path)) {
                Console.WriteLine("[MENSAJE] Archivo XML previo eliminado correctamente!");
                File.Delete(path);
            }
            
            StreamWriter sw = null;

            try {
                sw = new StreamWriter(path);
                sw.WriteLine(empleados.ToString());
                Console.WriteLine("[MENSAJE] Archivo XML guardado correctamente!");
            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
            } finally {
                sw.Close();
            }
        }

    }
}

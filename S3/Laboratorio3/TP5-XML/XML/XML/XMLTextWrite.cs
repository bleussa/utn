using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace XML {
    class XMLTextWrite {

        public static XmlTextWriter Ejecutar(List<Empleado> empleadosList, string path) {

			try {

                if (File.Exists(path)) {
                    Console.WriteLine("[MENSAJE] Archivo XML previo eliminado correctamente!");
                    File.Delete(path);
                }

                // CREAMOS EL WRITER Y LE DEFINIMOS UN PATH
                XmlTextWriter writer = new XmlTextWriter(path, Encoding.UTF8);

                // LE AGREGAMOS LA IDENTACION
                writer.Formatting = Formatting.Indented;

                // AGREGAMOS LOS COMPONENTES
                writer.WriteStartDocument();

                writer.WriteStartElement("empleados");

                writer.WriteStartElement("listado");

                foreach (Empleado emp in empleadosList) {
                    writer.WriteStartElement("empleado");
                    writer.WriteElementString("id", emp.Id + "");
                    writer.WriteElementString("nombreCompleto", emp.NombreCompleto);
                    writer.WriteElementString("cuil", emp.Cuil + "");
                    writer.WriteStartElement("sector", null);
                    writer.WriteAttributeString("id", emp.Sector.Id + "");
                    writer.WriteAttributeString("denominacion", emp.Sector.Denominacion);
                    writer.WriteAttributeString("valorSemaforo", emp.Sector.ValorSemaforo + "");
                    writer.WriteAttributeString("colorSemaforo", emp.Sector.ColorSemaforo);
                    writer.WriteEndElement();
                    writer.WriteElementString("cupoAsignado", emp.CupoAsignado + "");
                    writer.WriteElementString("cupoConsumido", emp.CupoConsumido + "");
                    writer.WriteEndElement();
                }

                writer.WriteEndElement();

                writer.WriteElementString("subsectores", "5");
                writer.WriteElementString("totalCupoAsignadoSector", "4217.21");
                writer.WriteElementString("totalCupoConsumidoSector", "1405.88");
                writer.WriteElementString("valorDial", "33.34");

                writer.WriteEndElement();

                writer.WriteEndDocument();

                writer.Flush();
                writer.Close();

                Console.WriteLine("[MENSAJE] Archivo XML guardado correctamente!");

                return writer;

            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);

                return null;
			} 
        }

    }
}

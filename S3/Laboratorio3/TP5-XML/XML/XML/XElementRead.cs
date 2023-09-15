using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Linq;

namespace XML {
    class XElementRead {

        public static void Leer(string path) {
			try {

                XmlDocument document = new XmlDocument();
                document.Load(path);

                XmlNodeList empleados = document.SelectNodes("empleados");
                XmlNodeList listado = ((XmlElement)empleados[0]).GetElementsByTagName("listado");
                XmlNodeList listaEmpleados = ((XmlElement)listado[0]).GetElementsByTagName("empleado");

                foreach (XmlNode node in listaEmpleados) {

                    Console.WriteLine("Empleado:");
                    Console.WriteLine("\tID:" + node.SelectSingleNode("id").InnerText);
                    Console.WriteLine("\tNombre:" + node.SelectSingleNode("nombreCompleto").InnerText);
                    Console.WriteLine("\tCUIL:" + node.SelectSingleNode("cuil").InnerText);

                    Console.WriteLine("\tSector:" + node.SelectSingleNode("sector").InnerText);
                    Console.WriteLine("\t\tID:" + node.SelectSingleNode("sector").Attributes["id"].Value);
                    Console.WriteLine("\t\tValor Semaforo:" + node.SelectSingleNode("sector").Attributes["valorSemaforo"].Value);
                    Console.WriteLine("\t\tColor Semaforo:" + node.SelectSingleNode("sector").Attributes["colorSemaforo"].Value);

                    Console.WriteLine("\tCupo Asignado:" + node.SelectSingleNode("cupoAsignado").InnerText);
                    Console.WriteLine("\tCupo Consumido:" + node.SelectSingleNode("cupoConsumido").InnerText);
                }

                XmlNode subsector = ((XmlElement)empleados[0]).SelectSingleNode("subsectores");
                Console.WriteLine("Subsectores:" + subsector.InnerText);

                XmlNode totalCupoAsignadoSector = ((XmlElement)empleados[0]).SelectSingleNode("totalCupoAsignadoSector");
                Console.WriteLine("Total Cupos Asignados por Sector:" + totalCupoAsignadoSector.InnerText);

                XmlNode totalCupoConsumidoSector = ((XmlElement)empleados[0]).SelectSingleNode("totalCupoConsumidoSector");
                Console.WriteLine("Total Cupos Consumidos por Sector:" + totalCupoConsumidoSector.InnerText);

                XmlNode valorDial = ((XmlElement)empleados[0]).SelectSingleNode("valorDial");
                Console.WriteLine("Valor Dial:" + valorDial.InnerText);

            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
			}
        }

    }
}

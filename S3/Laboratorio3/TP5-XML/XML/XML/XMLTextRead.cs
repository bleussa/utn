using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace XML {
    class XMLTextRead {

        public static void Leer(String path) {

            try {

                XmlReader reader = XmlReader.Create(path);

                while (reader.Read()) {

                    if (reader.IsStartElement()) {

                        switch (reader.Name) {
                            case "empleados":
                                Console.WriteLine("Elemento N1\tEmpleados");
                                break;
                            case "listado":
                                Console.WriteLine("Elemento N2\t\tListado");
                                break;
                            case "empleado":
                                Console.WriteLine("Elemento N3\t\t\tEmpleado");
                                break;
                            case "id":
                                Console.WriteLine("Elemento N4\t\t\t\tID: " + reader.ReadElementContentAsString());
                                break;
                            case "nombreCompleto":
                                Console.WriteLine("Elemento N4\t\t\t\tNombre: " + reader.ReadElementContentAsString());
                                break;
                            case "cuil":
                                Console.WriteLine("Elemento N4\t\t\t\tCuil: " + reader.ReadElementContentAsString());
                                break;
                            case "sector":
                                Console.WriteLine("Elemento N4\t\t\t\tSector");
                                string idSector = reader.GetAttribute("id");
                                if (idSector != null) {
                                    Console.WriteLine("Atributo N4\t\t\t\t  ID:" + idSector);
                                }
                                string denominacion = reader.GetAttribute("denominacion");
                                if (denominacion != null) {
                                    Console.WriteLine("Atributo N4\t\t\t\t  Denominacion:" + denominacion);
                                }
                                string valorSemaforo = reader.GetAttribute("valorSemaforo");
                                if (valorSemaforo != null) {
                                    Console.WriteLine("Atributo N4\t\t\t\t  Valor Semaforo:" + valorSemaforo);
                                }
                                string colorSemaforo = reader.GetAttribute("colorSemaforo");
                                if (colorSemaforo != null) {
                                    Console.WriteLine("Atributo N4\t\t\t\t  Color Semaforo:" + colorSemaforo);
                                }
                                break;
                            case "subsectores":
                                Console.WriteLine("Elemento N2\t\tSubsectores:" + reader.ReadElementContentAsString());
                                break;
                            case "totalCupoAsignadoSector":
                                Console.WriteLine("Elemento N2\t\tTotal Cupo Asignado Sector:" + reader.ReadElementContentAsDouble());
                                break;
                            case "totalCupoConsumido":
                                Console.WriteLine("Elemento N2\t\tTotal Cupo Consumido:" + reader.ReadElementContentAsString());
                                break;
                            case "valorDial":
                                Console.WriteLine("Elemento N2\t\tValor Dial:" + reader.ReadElementContentAsDouble());
                                break;
                        }

                    }

                }

                reader.Close();

            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);
            }


        }

    }
}

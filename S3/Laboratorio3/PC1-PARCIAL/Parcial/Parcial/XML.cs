using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace Parcial {
    class XML {

        public static XmlTextWriter Ejecutar(List<Heroe> heroes, string path) {

            try {

                if (File.Exists(path)) {
                    Console.WriteLine("Archivo XML previo eliminado correctamente!");
                    File.Delete(path);
                }

                XmlTextWriter writer = new XmlTextWriter(path, Encoding.UTF8);
                writer.Formatting = Formatting.Indented;

                writer.WriteStartDocument();
                writer.WriteStartElement("heroes");

                foreach (Heroe hr in heroes) {
                    writer.WriteStartElement("heroe");
                    writer.WriteElementString("id", hr.id + "");
                    writer.WriteElementString("nombre", hr.nombre);
                    writer.WriteStartElement("poderes", null);
                    foreach(string poder in hr.poderes) {
                        writer.WriteElementString("poder", poder);
                    }
                    writer.WriteEndElement();
                    writer.WriteElementString("bio", hr.bio + "");
                    writer.WriteElementString("img", hr.img + "");
                    writer.WriteElementString("aparicion", hr.aparicion + "");
                    writer.WriteElementString("casa", hr.casa + "");
                    writer.WriteEndElement();
                }

                writer.WriteEndElement();

                writer.WriteEndDocument();

                writer.Flush();
                writer.Close();

                Console.WriteLine("Archivo XML guardado correctamente!");

                return writer;

            } catch (Exception ex) {
                Console.WriteLine("[ERROR] " + ex.Message);

                return null;
            }
        }

    }
}
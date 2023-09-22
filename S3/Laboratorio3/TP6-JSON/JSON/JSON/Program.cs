using System;

namespace JSON {

    class Program {

        static void Main(string[] args) {

            string path, url;

            // LECTURA DE DB Y ESCRITURA DE ARCHIVO JSON
            /* WriteJSON writeJSON = new WriteJSON();
            path = Path.GetFullPath("../../../escritores.json");
            List<Escritor> escritores = writeJSON.leerDB();
            writeJSON.crearJSON(path, escritores); */

            // LECTURA DE JSON Y CREACIÓN DE OBJETOS
            ReadJSON readJSON = new ReadJSON();
            url = "https://randomuser.me/api/?results=10";
            string resultado = readJSON.obtenerJSON(url);
            readJSON.mapearJSON(resultado);




        }

    }

}
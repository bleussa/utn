using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace JSON {
    class ReadJSON {
        
        public ReadJSON() { }

        public string obtenerJSON(string url) {
            string json;

            WebClient wc = new WebClient();
            json = wc.DownloadString(url);

            return json;
        }

        public void mapearJSON(string data) {

            Nodo nodo = JsonConvert.DeserializeObject<Nodo>(data);
            int contador = 1;

            foreach (Usuario usr in nodo.results) {
                Console.WriteLine("# Usuario " + contador);
                Console.WriteLine("Nombre Completo: " + usr.name.title + ". " + usr.name.first + " " + usr.name.last);
                Console.WriteLine("Usuario: " + usr.login.username + "\tContrasenia: " + usr.login.password);
                Console.WriteLine("");

                contador++;
            }

        }
    }
}

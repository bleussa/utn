using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace Parcial {
    class Ejercicio4 {

        public string obtenerJSON(string url) {
            string json;

            WebClient wc = new WebClient();
            json = wc.DownloadString(url);

            return json;
        }



        public List<Heroe> mapearJSON(string data) {
            List<Heroe> heroes = JsonConvert.DeserializeObject<List<Heroe>>(data);

            return heroes;
        }

        public void imprimirJSON(List<Heroe> heroes) {
            foreach (Heroe heroe in heroes) {
                Console.WriteLine("Id: " + heroe.id);
                Console.WriteLine("Nombre: " + heroe.nombre);
                Console.Write("Poderes: ");
                foreach (string poder in heroe.poderes) {
                    Console.Write(poder + ", ");
                }
                Console.WriteLine("\nBio: " + heroe.bio);
                Console.WriteLine("Imagen: " + heroe.img);
                Console.WriteLine("Aparicion: " + heroe.aparicion);
                Console.WriteLine("Casa: " + heroe.casa);
                Console.WriteLine("");
            }
        }



    }
}

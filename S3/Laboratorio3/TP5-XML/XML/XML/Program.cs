using System;
using System.Xml.Linq;

namespace XML {
    class Program {
        static void Main(string[] args) {

            string path = "";

            // HARDCODEAMOS LOS EMPLEADOS Y CREAMOS UN LISTADO
            Empleado emp1 = new Empleado(4884, "Rodriguez, Victor", 20103180326, new Sector(137, "Gerencia RRHH", 130.13, "Verde"), 1837.15, 658.02);

            Empleado emp2 = new Empleado(1225, "Sanchez, Juan Ignacio", 20271265817, new Sector(44, "Gerencia Operativa", 130.13, "Rojo"), 750.87, 625.46);

            List<Empleado> empleados = new List<Empleado>();
            empleados.Add(emp1);
            empleados.Add(emp2);

            // WRITER 1
            path = Path.GetFullPath("../../../empleados1.xml");
            XElement data = XElementWrite.Ejecutar(empleados);
            XElementWrite.Guardar(data, path);
            Console.WriteLine("");

            // WRITER 2
            path = Path.GetFullPath("../../../empleados2.xml");
            XMLTextWrite.Ejecutar(empleados, path);
            Console.WriteLine("");

            // READER 1
            path = Path.GetFullPath("../../../empleados1.xml");
            XElementRead.Leer(path);
            Console.WriteLine("");

            // READER 2
            path = Path.GetFullPath("../../../empleados2.xml");
            XMLTextRead.Leer(path);

        }

    }

}

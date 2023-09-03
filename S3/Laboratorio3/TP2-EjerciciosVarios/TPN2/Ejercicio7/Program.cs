using Ejercicio7;

class Program
{
    public static void Main(string[] args)
    {
        List<Figura> listaFiguras = new List<Figura>();
        listaFiguras.Add(new Circulo());
        listaFiguras.Add(new Triangulo());
        listaFiguras.Add(new Rectangulo());
        listaFiguras.Add(new Figura());

        foreach (Figura figura in listaFiguras)
        {
            figura.Dibujar();
        }
    }
}
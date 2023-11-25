package bleussalbert.trabajopractico2;

public class Calculo {

    public static void main(String[] args){

        // EJERCICIO 19  //
        /* Cree una clase OperacionMatematica con dos atributos numéricos decimales,
        valor1 y valor2 y un atributo String de nombre operación. Cree los
        correspondientes métodos get/set */

        OperacionMatematica x = new OperacionMatematica();

        x.setValor1(10);
        x.setValor2(5);

        x.aplicarOperacion("+");
        x.aplicarOperacion("-");
        x.aplicarOperacion("*");
        x.aplicarOperacion("/");

    }

}

package bleussalbert.trabajopractico2;

public class OperacionMatematica{

    // EJERCICIO 19  //
    /* Cree una clase OperacionMatematica con dos atributos numéricos decimales,
    valor1 y valor2 y un atributo String de nombre operación. Cree los
    correspondientes métodos get/set */

    private double valor1;
    private double valor2;

    public OperacionMatematica(){};

    public OperacionMatematica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    private double sumarNumeros() {
        return this.valor1 + this.valor2;
    }

    private double restarNumeros() {
        return this.valor1 - this.valor2;
    }

    private double multiplicarNumeros() {
        return this.valor1 * this.valor2;
    }

    private double dividirNumeros() {
        return this.valor1 / this.valor2;
    }

    public double aplicarOperacion(String operacion){
        switch(operacion){
            case "+":
                System.out.println(sumarNumeros());
                break;
            case "-":
                System.out.println(restarNumeros());
                break;
            case "*":
                System.out.println(multiplicarNumeros());
                break;
            case "/":
                System.out.println(dividirNumeros());
                break;
            default:
                System.out.println("ERROR");
        }
        return 0;
    }

}

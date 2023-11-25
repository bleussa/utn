package bleussalbert.trabajopractico2;

public class Fraccion {

        private int numerador;
        private int denominador;


        public Fraccion(){};
        public Fraccion(int numerador, int denominador){
                this.numerador = numerador;
                this.denominador = denominador;
        }

        public int getNumerador() {
                return numerador;
        }
        public void setNumerador(int numerador) {
               this.numerador = numerador;
        }
        public int getDenominador() {
                return denominador;
        }
        public void setDenominador(int denominador) {
                this.denominador = denominador;
        }

        public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
                int resultadoNumerador = f1.numerador * f2.denominador + f1.denominador * f2.numerador;
                int resultadoDenominador = f1.denominador * f2.denominador;
                Fraccion resultado = new Fraccion(resultadoNumerador, resultadoDenominador);
                return resultado;
        }

        public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
                int resultadoNumerador = f1.numerador * f2.denominador - f1.denominador * f2.numerador;
                int resultadoDenominador = f1.denominador * f2.denominador;
                Fraccion resultado = new Fraccion(resultadoNumerador, resultadoDenominador);
                return resultado;
        }

        public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
                int resultadoNumerador = f1.numerador * f2.numerador;
                int resultadoDenominador = f1.denominador * f2.denominador;
                Fraccion resultado = new Fraccion(resultadoNumerador, resultadoDenominador);
                return resultado;
        }

        public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
                int resultadoNumerador = f1.numerador * f2.denominador;
                int resultadoDenominador = f1.denominador * f2.numerador;
                Fraccion resultado = new Fraccion(resultadoNumerador, resultadoDenominador);
                return resultado;
        }

}

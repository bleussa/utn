package segundoEjercicio;

public class Documento {
    private int tipo;
    private long numero;

    public Documento(int tipo, long numero) throws Exception{

        if (tipo == 1){
            if (numero < 9999 || numero > 99999999){
                throw new Exception();
            }
        }
        this.tipo = tipo;
        this.numero = numero;

    }

    @Override
    public String toString() {
        return "\n> Documento (" + "Tipo: " + tipo + "; Numero: " + numero + ')';
    }
}

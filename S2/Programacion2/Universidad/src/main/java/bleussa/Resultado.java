package bleussa;

public class Resultado {
    private String implementacionFinalizada;

    public Resultado(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }

    public Resultado() {
    }

    public int efectosPositivosYNegativos(){
        return 5;
    }
    public int medidasDeSatisfaccionDeDiferentesAspectos(){
        return 2;
    }

    public String getImplementacionFinalizada() {
        return implementacionFinalizada;
    }

    public void setImplementacionFinalizada(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }
}

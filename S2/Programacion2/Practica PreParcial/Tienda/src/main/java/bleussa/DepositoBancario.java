package bleussa;

public class DepositoBancario extends Pago{
    private int numeroBoucher;

    public DepositoBancario() {
    }

    public int getNumeroBoucher() {
        return numeroBoucher;
    }

    public void setNumeroBoucher(int numeroBoucher) {
        this.numeroBoucher = numeroBoucher;
    }
}

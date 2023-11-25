package bleussa;

public class Cliente extends Persona implements EstadoCuenta{
    // ATRIBUTOS
    private TarjetaDeCredito credit;

    // CONSTRUCTORES

    public Cliente() {
    }
    public Cliente(int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
    }
    public Cliente(int dni, String nombre, String apellido, long cuit, TarjetaDeCredito credit) {
        super(dni, nombre, apellido, cuit);
        this.credit = credit;
    }

    // METODOS
    public TarjetaDeCredito getCredit() {
        return credit;
    }
    public void setCredit(TarjetaDeCredito credit) {
        this.credit = credit;
    }
    @Override
    public boolean problemaVerazCodeme() {
        return false;
    }
}

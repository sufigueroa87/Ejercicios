public class Cuenta {

    private float saldo;

    //Constructor
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    //Método para añadir dinero
    public void ingresar(float c) {
        saldo = saldo + c;
    }

    //Método para sacar dinero
    public void extraer(float c) throws SaldoInsuficienteException {
        if (c > saldo) {
            throw new SaldoInsuficienteException();
        } else {
            saldo = saldo - c;
        }
    }

    //Método que devuelve el saldo actual
    public float getSaldo(){
        return saldo;
    }
}

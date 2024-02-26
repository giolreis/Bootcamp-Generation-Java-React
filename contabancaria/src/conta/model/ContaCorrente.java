package conta.model;

public class ContaCorrente extends Conta {

    protected int numero;

    public ContaCorrente(int agencia, String titular, float saldo, int numero){
        super(agencia, titular, saldo);
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}

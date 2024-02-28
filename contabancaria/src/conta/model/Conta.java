package conta.model;

public abstract class Conta {
    private int agencia;
    private String titular;
    private float saldo;

    public Conta(int agencia, String titular, float saldo) {
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public abstract float sacar(float saque);

    public abstract float depositar(float deposito);
}


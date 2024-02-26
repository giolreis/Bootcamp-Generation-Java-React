package conta.model;

public class Conta {

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

    public float sacar(float saque){
        return saldo -= saque;
    }

    public float depositar(float deposito){
        return saldo += deposito;
    }
}

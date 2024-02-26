package conta.model;

public class ContaPoupanca extends Conta {

    private int numero;
    private float juros;
    private int anos;

    public ContaPoupanca(int agencia, String titular, int saldo, int numero, float juros, int anos){
        super(agencia, titular, saldo);
        this.numero = numero;
        this.juros = juros;
        this.anos = anos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    @Override
    public void setSaldo(float saldo) {
        float valorFinal = 0;

        for(int i = 1; i <= anos; i++){
            valorFinal += saldo * juros;
        }

        super.setSaldo(valorFinal);
    }
}

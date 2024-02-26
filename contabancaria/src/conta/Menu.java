package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
    public static void main(String[] args){
        Conta novaConta = new Conta(1234, "Alexandre Ferreira", 1000);

        System.out.println("\nDados da Conta:" +
                "\nAgência: " + novaConta.getAgencia() +
                "\nTitular: " + novaConta.getTitular() +
                "\nSaldo: " + novaConta.getSaldo());

        novaConta.sacar(500);
        novaConta.depositar(1000);

        System.out.println("Saldo Atualizado: " + novaConta.getSaldo());

        ContaCorrente novaContaCorrente = new ContaCorrente(5456, "Giovani Morais", 2000, 121234);
        System.out.println("\nDados da Conta:" +
                "\nNúmero da Conta: " + novaContaCorrente.getNumero() +
                "\nAgência: " + novaContaCorrente.getAgencia() +
                "\nTitular: " + novaContaCorrente.getTitular() +
                "\nSaldo: " + novaContaCorrente.getSaldo());

        novaContaCorrente.sacar(1500);
        System.out.println("Saldo atualizado: " + novaContaCorrente.getSaldo());

        ContaPoupanca novaContaPoupanca = new ContaPoupanca(6789, "Cristiano Tavares", 500, 126798, 1.2F, 10);
        System.out.println("\nDados da Conta:" +
                "\nNúmero da Conta: " + novaContaPoupanca.getNumero() +
                "\nAgência: " + novaContaPoupanca.getAgencia() +
                "\nTitular: " + novaContaPoupanca.getTitular() +
                "\nSaldo inicial: " + novaContaPoupanca.getSaldo());

        novaContaPoupanca.setSaldo(novaContaPoupanca.getSaldo());
        System.out.println("Saldo final após " + novaContaPoupanca.getAnos() + ": " + novaContaPoupanca.getSaldo());
    }
}

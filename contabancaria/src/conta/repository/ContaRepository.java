package conta.repository;
import conta.model.Conta;

public interface ContaRepository {
	
void salvar(Conta conta);
Conta buscarPorNumero(String numeroConta);
void sacar(String numeroConta, float valor);
void depositar(String numeroConta, float valor);
}





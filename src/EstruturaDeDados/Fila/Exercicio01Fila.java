package EstruturaDeDados.Fila;

import java.util.*;

public class Exercicio01Fila {
    public static void main(String[] args) {
        int opcao = -1;
        //Implementação de uma Fila com Lista Encadeada
        Queue<String> clientesDoBanco = new LinkedList<>();
        Scanner leitura = new Scanner(System.in);

        while(opcao != 0) {
            System.out.println("""
                    *****************************
                    1 - Adicionar Cliente na Fila
                    2 - Listar todos os Clientes
                    3 - Retirar Clientes da Fila
                    0 - Sair
                    *****************************
                    Entre com a opção desejada: 
                    """);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    //Solicita ao usuário o nome do cliente para inserir na fila
                    System.out.println("Informe o nome do cliente: ");
                    String nomeCliente = leitura.next();

                    //Insere o nome do cliente no final da fila
                    clientesDoBanco.offer(nomeCliente);
                    System.out.println("Cliente adicionado!\n");
                    break;
                case 2:
                    System.out.println("\nFila Atualizada: ");

                    //Verifica se a fila está vazia
                    String filaVazia = clientesDoBanco.peek();
                    if(filaVazia == null){
                        System.out.println("A fila está vazia!\n");
                    } else {
                        //Imprime a os elementos da fila
                        for (String filaAtualizada : clientesDoBanco){
                            System.out.println(filaAtualizada);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    //Verifica se a fila está vazia
                    filaVazia = clientesDoBanco.peek();
                    if(filaVazia == null){
                        System.out.println("A fila está vazia!\n");
                    } else {
                        //Se a fila não estiver vazia retorna o primeiro elemento removido
                        String clienteChamado = clientesDoBanco.remove();
                        System.out.println("O(A) Cliente " + clienteChamado + " foi chamado(a)!");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        leitura.close();
    }
}

package EstruturaDeDados.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02Pilha {
    public static void main(String[] args) {
        //Declara uma Pilha do tipo String
        Stack<String> pilhaDeLivros = new Stack<>();
        Scanner leitura = new Scanner(System.in);
        int opcao = -1;

        while(opcao != 0) {
            System.out.println("""
                    ************************************
                    1 - Adicionar livro na pilha
                    2 - Listar todos os livros da pilha
                    3 - Retirar um livro da pilha
                    0 - Sair
                    ************************************
                    Entre com a opção desejada:
                    """);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1:
                    //Solicita ao usuário a inserção do livro no topo da pilha
                    System.out.println("Informe o nome do livro: ");
                    String nomeDoLivro = leitura.nextLine();

                    //Insere o item no topo da pilha
                    pilhaDeLivros.push(nomeDoLivro);
                    System.out.println("Livro adicionado!\n");
                    break;
                case 2:
                    System.out.println("Pilha Atualizada: ");
                    //Verifica se a pilha está vazia
                    if(pilhaDeLivros.empty()){
                        System.out.println("A pilha está vazia!");
                    } else {
                        //Imprime os elementos da pilha
                        for(String pilhaAtualizada : pilhaDeLivros){
                            System.out.println(pilhaAtualizada);
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    //Verifica se a pilha está vazia
                    if(pilhaDeLivros.empty()){
                        System.out.println("A pilha está vazia!");
                    } else {
                        //Retorna o elemento removido no topo da pilha
                        String livroRetirado = pilhaDeLivros.pop();
                        System.out.println("O livro " + livroRetirado + " foi retirado da pilha!");
                    }
                    System.out.println();
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

package EstruturasCondicionais.Switch;

import java.util.Scanner;

public class CaixaProdutos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int codigo = 0;
        int quantidade = 0;
        double preco = 0;

        System.out.println("Digite o código do produto: ");
        codigo = leitura.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = leitura.nextInt();

        switch (codigo){
            case 1:
                preco = quantidade * 10.0;
                System.out.printf("Produto: Cachorro Quente \nValor Total: R$%.2f", preco);
                break;
            case 2:
                preco = quantidade * 15.0;
                System.out.printf("Produto: X-Salada \nValor Total: R$%.2f", preco);
                break;
            case 3:
                preco = quantidade * 18.0;
                System.out.printf("Produto: X-Bacon \nValor Total: R$%.2f", preco);
                break;
            case 4:
                preco = quantidade * 12.0;
                System.out.printf("Produto: Bauru \nValor Total: R$%.2f", preco);
                break;
            case 5:
                preco = quantidade * 8.0;
                System.out.printf("Produto: Refrigerante \nValor Total: R$%.2f", preco);
                break;
            case 6:
                preco = quantidade * 13.0;
                System.out.printf("Produto: Suco de laranja \nValor Total: R$%.2f", preco);
                break;
            default:
                System.out.println("Código inválido");
        }

        leitura.close();
    }
}

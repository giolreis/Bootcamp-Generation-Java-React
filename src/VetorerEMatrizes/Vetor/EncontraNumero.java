package VetorerEMatrizes.Vetor;

import java.util.Scanner;

public class EncontraNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int [] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        boolean encontrado = false;

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if (numero == vetor[i]) {
                System.out.printf("O número %d está localizado na posição: %d", numero, i);
                encontrado = true;
                break;
            }
        }

        if(encontrado == false) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        leitura.close();
    }
}
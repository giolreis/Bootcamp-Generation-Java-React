package EstruturasRepeticao.Do_While;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 0;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = leitura.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        }while (numero != 0);

        System.out.println("A soma dos números positivos é: " + soma);

        leitura.close();
    }
}

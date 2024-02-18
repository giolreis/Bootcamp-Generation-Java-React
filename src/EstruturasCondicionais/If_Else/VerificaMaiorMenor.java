package EstruturasCondicionais.If_Else;

import java.util.Scanner;

public class VerificaMaiorMenor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroA = 0;
        int numeroB = 0;
        int numeroC = 0;

        System.out.println("Digite o número A: ");
        numeroA = leitura.nextInt();
        System.out.println("Digite o número B: ");
        numeroB = leitura.nextInt();
        System.out.println("Digite o número C: ");
        numeroC = leitura.nextInt();

        if((numeroA + numeroB) > numeroC){
            System.out.println("A Soma de A + B é maior que C");
        } else if ((numeroA + numeroB) == numeroC) {
            System.out.println("A Soma de A + B é igual a C");
        } else{
            System.out.println("A Soma de A + B é menor que C");
        }

        leitura.close();
    }
}

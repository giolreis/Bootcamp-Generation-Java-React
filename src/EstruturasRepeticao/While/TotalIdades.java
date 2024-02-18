package EstruturasRepeticao.While;

import java.util.Scanner;

public class TotalIdades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        int contadorMaior50 = 0;
        int contadorMenor21 = 0;

        while(idade != -1) {
            System.out.println("Digite uma idade ou -1 para sair: ");
            idade = leitor.nextInt();

            if(idade <= -1){
              break;
            } else if(idade < 21){
                contadorMenor21++;
            }else if(idade > 50){
                contadorMaior50++;
            }
        }

        System.out.println("Total de pessoas menores de 21 anos: " + contadorMenor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + contadorMaior50);

        leitor.close();
    }
}

package EstruturasRepeticao.For;

import java.util.Scanner;

public class MultiplosNoIntervaloNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número do intervalo:  ");
        int numero1 = leitura.nextInt();
        System.out.println("Digite o último número do intervalo: ");
        int numero2 = leitura.nextInt();

        if(numero1 >= numero2){
            System.out.println("Intervalo inválido!");
        }

        for(int i = numero1; i <= numero2; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }

        leitura.close();
    }
}

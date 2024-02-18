package VetorerEMatrizes.Matriz;

public class ExercicioMatriz {
    public static void main(String[] args) {
        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int somaPricipal = 0;
        int somaSecundaria = 0;

        System.out.println("Todos os elementos da matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Elementos da diagonal principal: ");
        for(int i = 0; i < matriz.length; i++){
                System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("Elementos da diagonal secundária: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
        System.out.println();

        System.out.println("Soma de todos os elementos da diagonal principal: ");
        for(int i = 0; i < matriz.length; i++){
            somaPricipal += matriz[i][i];

        }
        System.out.println(somaPricipal);

        System.out.println("Soma de todos os elementos da diagonal secundária: ");
        for(int i = 0; i < matriz.length; i++){
            somaSecundaria += matriz[i][matriz.length - 1 - i];
        }
        System.out.println(somaSecundaria);
    }

}

package Collections.ArrayList;

import java.util.*;

public class ExercicioListaCoresArrayList {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //declaração do ArrayList
        List<String> listaDeCores = new ArrayList<>();
        String cor;

        //Solicita as cores ao usuário e adiciona no ArrayList
        for(int i = 0; i < 5; i++) {
            System.out.println("Insira uma cor: ");
            cor = leitura.nextLine();
            listaDeCores.add(cor);
        }

        //Mostra o ArrayList conforme a ordem de adição dos elementos
        System.out.println("Listar todas as cores: ");
        for (String lista:listaDeCores) {
            System.out.println(lista);
        }
        System.out.println();

        //Ordena os elementos do ArrayList e mostra na tela
        System.out.println("Ordenar as cores: ");
        Collections.sort(listaDeCores);
        for(String listaOrdenada : listaDeCores){
            System.out.println(listaOrdenada);
        }

        leitura.close();

    }
}

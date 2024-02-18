package Collections.Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioAdicionaNumerosSet {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Set<Integer> listaDeNumeros = new HashSet<>();
        int numero = 0;


        for (int i = 0; i <= 10; i++){
            System.out.println("Digite um número de 1 a 10 não repetido: ");
            numero = leitura.nextInt();
            listaDeNumeros.add(numero);
        }

        System.out.println("Listar dados do Set: ");
        for(Integer lista : listaDeNumeros){
            System.out.println(lista);
        }
        System.out.println();


        System.out.println("Lista dados com Iterator: ");
        Iterator<Integer> iterator = listaDeNumeros.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        leitura.close();
    }
}

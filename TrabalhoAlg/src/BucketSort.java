package TrabalhoAlg.src;

import static TrabalhoAlg.src.ordenacao.MetodosSort.insertionSort;

import java.util.ArrayList;


public class BucketSort {

    public static void bucketSort(int[] vetor) {

        if (vetor.length <= 0) {
            return;
        }

        // Encontrar o maior elemento
        int maior = vetor[0];
        for (int valor : vetor) {
            if (valor > maior) {
                maior = valor;
            }
        }

        // Definir quantidade de baldes
        int quantidadeBaldes = (int) Math.sqrt(vetor.length);
        

        // Criar os baldes
        ArrayList<Integer>[] baldes = new ArrayList[quantidadeBaldes];

        for (int i = 0; i < quantidadeBaldes; i++) 
            baldes[i] = new ArrayList<>();
        

        // Distribuir os elementos nos baldes
        for (int valor : vetor) {
            int indiceBalde = (valor * quantidadeBaldes) / (maior + 1);
            baldes[indiceBalde].add(valor);
        }

        // Mostrar os baldes
            // ==== para testes comentar
        System.out.println("\n\nBaldes após distribuição:");

        for (int i = 0; i < baldes.length; i++) {
            System.out.println("Balde " + i + ": " + baldes[i]);
        }
        // ===

        // Ordenar cada balde 
        for (ArrayList<Integer> balde : baldes) {
            insertionSort(balde);
        }


        // ==== para testes comentar
        System.out.println("\nBaldes após a ordenação:");

        for (int i = 0; i < baldes.length; i++) {
            System.out.println("Balde " + i + ": " + baldes[i]);
        }
        // ===

        // Reunir os elementos no vetor original
        int indice = 0;

        for (ArrayList<Integer> balde : baldes) {
            for (int valor : balde) {
                vetor[indice++] = valor;
            }
        }
    }

    
}

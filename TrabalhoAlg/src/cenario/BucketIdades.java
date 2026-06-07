package TrabalhoAlg.src.cenario;

import static TrabalhoAlg.src.ordenacao.MetodosSort.insertionSort;

import java.util.ArrayList;

public class BucketIdades {

    public static void bucketSort(int[] vetor) {

        if (vetor.length <= 0) {
            return;
        }

        int quantidadeBaldes = 100; 

        ArrayList<Integer>[] baldes = new ArrayList[quantidadeBaldes];

        for (int i = 0; i < quantidadeBaldes; i++) {
            baldes[i] = new ArrayList<>();
        }

        // Distribuição
        for (int idade : vetor) {

            int indiceBalde = idade - 1;

            baldes[indiceBalde].add(idade);
        }

        // Ordenação interna
        for (ArrayList<Integer> balde : baldes) {
            insertionSort(balde);
        }


        // Reunir elementos
        int indice = 0;

        for (ArrayList<Integer> balde : baldes) {

            for (int idade : balde) {
                vetor[indice++] = idade;
            }
        }
    }
}
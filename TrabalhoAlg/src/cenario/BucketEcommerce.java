package TrabalhoAlg.src.cenario;

import static TrabalhoAlg.src.ordenacao.MetodosSort.insertionSort;

import java.util.ArrayList;


public class BucketEcommerce {

    public static void bucketSort(int[] vetor) {

        if (vetor.length <= 0) {
            return;
        }

        int quantidadeBaldes = 50;

        ArrayList<Integer>[] baldes = new ArrayList[quantidadeBaldes];

        for (int i = 0; i < quantidadeBaldes; i++) {
            baldes[i] = new ArrayList<>();
        }

        // Distribuição dos elementos
        for (int valor : vetor) {

                int indiceBalde = valor / 10;

                if (indiceBalde >= quantidadeBaldes) {
                    indiceBalde = quantidadeBaldes - 1;
                }

                baldes[indiceBalde].add(valor);
            }

        // Ordenação interna
        for (ArrayList<Integer> balde : baldes) {
            insertionSort(balde);
        }

        // Reunir os elementos
        int indice = 0;

        for (ArrayList<Integer> balde : baldes) {
            for (int valor : balde) {
                vetor[indice++] = valor;
            }
        }
    }
}
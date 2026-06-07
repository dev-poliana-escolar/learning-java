package TrabalhoAlg.src.cenario;

import static TrabalhoAlg.src.cenario.BucketIdades.bucketSort;
import static TrabalhoAlg.src.ordenacao.MetodosSort.quickSort;
import static TrabalhoAlg.src.vetor.GeraVetor.gerarIdades;

public class ComparacaoIdades {

    public static void main(String[] args) {

        int[] tamanhos = {100, 1000, 5000, 10000};

        int repeticoes = 50;

        //Aquecimento da JVM
        for (int i = 0; i < 100; i++) {

            int[] vetor = gerarIdades(1000);

            int[] copia = vetor.clone();

            bucketSort(vetor);
            quickSort(copia, 0, copia.length - 1);
        }


 
        System.out.println("Tamanho\tBucket(ns)\tQuick(ns)");

        for (int tamanho : tamanhos) {

            long somaBucket = 0;
            long somaQuick = 0;

            for (int r = 0; r < repeticoes; r++) {

                int[] original = gerarIdades(tamanho);

                int[] vetorBucket = original.clone();
                int[] vetorQuick = original.clone();

                long inicioBucket = System.nanoTime();
                bucketSort(vetorBucket);
                long fimBucket = System.nanoTime();

                somaBucket += fimBucket - inicioBucket;

                long inicioQuick = System.nanoTime();
                quickSort(vetorQuick, 0, vetorQuick.length - 1);
                long fimQuick = System.nanoTime();

                somaQuick += fimQuick - inicioQuick;
            }

            System.out.println(
                tamanho + "\t" +
                (somaBucket / repeticoes) + "\t" +
                (somaQuick / repeticoes)
            );
        }
    }
}
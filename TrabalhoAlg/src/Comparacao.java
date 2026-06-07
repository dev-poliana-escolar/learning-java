package TrabalhoAlg.src;
import static TrabalhoAlg.src.BucketSort.bucketSort;
import static TrabalhoAlg.src.ordenacao.MetodosSort.quickSort;
import static TrabalhoAlg.src.vetor.GeraVetor.gerarVetorSemRepeticao;

public class Comparacao {
    

    public static void main(String[] args) {

        int[] tamanhos = {100, 1000, 5000, 10000};

        int repeticoes = 50;

        // aquecimento da JVM 
        for (int i = 0; i < 100; i++) {

            int[] vetor = gerarVetorSemRepeticao(1000);

            int[] copia = vetor.clone();

            bucketSort(vetor);
            quickSort(copia, 0, copia.length - 1);
        }

        System.out.println("Tamanho\tBucket(ns)\tQuick(ns)");

        for (int tamanho : tamanhos) {

            long somaBucket = 0;
            long somaQuick = 0;

            for (int r = 0; r < repeticoes; r++) {

                int[] original = gerarVetorSemRepeticao(tamanho);

                int[] vetorBucket = original.clone();
                int[] vetorQuick = original.clone();

                // Bucket
                long inicioBucket = System.nanoTime();
                bucketSort(vetorBucket);
                long fimBucket = System.nanoTime();

                somaBucket += fimBucket - inicioBucket;

                // Quick
                long inicioQuick = System.nanoTime();
                quickSort(vetorQuick, 0, vetorQuick.length - 1);
                long fimQuick = System.nanoTime();

                somaQuick += fimQuick - inicioQuick;
            }

            long mediaBucket = somaBucket / repeticoes;
            long mediaQuick = somaQuick / repeticoes;

            System.out.println(
                tamanho + "\t" +
                mediaBucket + "\t\t" +
                mediaQuick
            );
        }
    }
}


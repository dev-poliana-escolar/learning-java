package TrabalhoAlg.src;
import static TrabalhoAlg.src.BucketSort.bucketSort;
import static TrabalhoAlg.src.vetor.GeraVetor.gerarVetorSemRepeticao;


public class Main {
   

    public static void main(String[] args) {

        int[] vetor = gerarVetorSemRepeticao(50);


        System.out.println("Antes da ordenação:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        bucketSort(vetor);

        System.out.println("\nDepois da ordenação:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}

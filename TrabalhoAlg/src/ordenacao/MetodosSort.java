package TrabalhoAlg.src.ordenacao;
import java.util.ArrayList;

public class MetodosSort {

    //para baldes
    public static void insertionSort(ArrayList<Integer> lista) {

        for (int i = 1; i < lista.size(); i++) {

            int elemento = lista.get(i); 
            int posicao = i - 1; 

            while (posicao >= 0 && lista.get(posicao) > elemento) {
                lista.set(posicao + 1, lista.get(posicao));
                posicao--;
            }

            lista.set(posicao + 1, elemento);
        }
    }

    // quick sort

    public static void quickSort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {

            int indicePivo = particionar(vetor, inicio, fim);

            quickSort(vetor, inicio, indicePivo - 1);
            quickSort(vetor, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim) {

        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {

            if (vetor[j] <= pivo) {

                i++;

                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }
}


package TrabalhoAlg.src.vetor;

import java.util.Random;

public class GeraVetor {
    
    public static int[] gerarVetorSemRepeticao(int tamanho) {

        Random random = new Random();
        int[] vetor = new int[tamanho];

        int i = 0;

        while (i < tamanho) {

            int numero = random.nextInt(tamanho * 10); // para comparacao colocar tamanho * 10

            boolean repetido = false;

            for (int pos = 0; pos < i; pos++) {
                if (vetor[pos] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                vetor[i] = numero;
                i++;
            }
        }

        return vetor;
    }

    public static int[] gerarPrecosEcommerce(int tamanho) {

        Random random = new Random();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            vetor[i] = random.nextInt(501);

        }

        return vetor;
    }

    public static int[] gerarIdades(int tamanho) {

        Random random = new Random();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            vetor[i] = random.nextInt(100) + 1;
            // idades de 1 a 100 anos
        }

        return vetor;
    }

}

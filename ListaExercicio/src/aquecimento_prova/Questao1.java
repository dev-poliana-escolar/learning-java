package aquecimento_prova;
// Crie um método recursivo que receba um vetor de inteiros e retorne a soma de todos os elementos
public class Questao1 {
    static void main() {
        int[] vetor = {1,2,3,4};

        System.out.println(somaVetor(vetor,0));
    }
    static int somaVetor(int[] vetor, int n){
        if (n>vetor.length-1)
            return 0;

        return vetor[n] + somaVetor(vetor, n+1);
    }


}

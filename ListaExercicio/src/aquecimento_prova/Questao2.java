package aquecimento_prova;
// Faça uma função recursiva que conte quantos números pares existem em um vetor.
public class Questao2 {
    static void main() {
        int[] vetor= {1,2,3,4, 8,8, 4};

        System.out.println(encontrarPar(vetor));


    }


    static int encontrarPar(int[] vetor){
        return encontrarPar(vetor, 0, 0);
    }
    protected static int encontrarPar(int[] vetor, int i, int qtdPar){
        if (i>vetor.length-1)
            return qtdPar;

        if (vetor[i]%2 == 0)
            return encontrarPar(vetor, i+1, qtdPar+1);

        return encontrarPar(vetor, i+1, qtdPar);

    }
}

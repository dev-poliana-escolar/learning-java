package listaexercicio;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Questao10 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {2, 7, 9, 4, 10, 24, 76, 1, 4 , 6, 54, 5};
        Arrays.sort(vetor);
        int fim = vetor.length - 1;

        if (sc.hasNextInt()){
            int alvo =sc.nextInt();
            System.out.println(buscaBinaria(vetor, 0 , fim, alvo));
        }

        sc.close();
    }

    static int buscaBinaria(int[] lista, int inicio, int fim, int alvo){

        int meio = (inicio+fim)/2;

        if (inicio>fim)
            return -1;

        if (lista[meio] == alvo)
            return alvo;
        else if (alvo < lista[meio])
            return buscaBinaria(lista, inicio,meio-1, alvo);

        return buscaBinaria(lista, meio+1, fim, alvo);
    }

}

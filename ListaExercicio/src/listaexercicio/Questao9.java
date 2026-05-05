package listaexercicio;

import java.util.HashMap;
import java.util.Scanner;

public class Questao9 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int n = sc.nextInt();
            HashMap <Integer, Integer> valoresFibo = new HashMap<>();
            System.out.println(calculaFibonacci(n,valoresFibo));
            System.out.println(valoresFibo);


        }
    }

    static int calculaFibonacci(int n, HashMap<Integer, Integer> mapa){
        if (n == 0)
            return 0;
        else if (n==1)
            return 1;

        if (mapa.containsKey(n)) // se contem
            return mapa.get(n); // retorne o resultado referente a chave

        int resultado = calculaFibonacci(n-1, mapa)+ calculaFibonacci(n-2, mapa); //calcula o fibo


        mapa.put(n, resultado); // insere o f(n) : chave(resultado)
        return resultado;
    }

}


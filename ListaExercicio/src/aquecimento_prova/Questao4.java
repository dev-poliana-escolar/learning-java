package aquecimento_prova;

import java.util.Scanner;

// Crie uma função recursiva que receba um número inteiro positivo e retorne a soma dos seus dígitos.
public class Questao4 {

    static void main() {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int n = sc.nextInt();

            System.out.println(somarNumeros(n));
        }
    }

    static int somarNumeros(int n){
        if (n== 0)
            return 0;

        return somarNumeros(n/10) +n%10  ;
    }
}

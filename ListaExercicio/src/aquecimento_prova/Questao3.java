package aquecimento_prova;

import java.util.Scanner;

// Implemente uma função recursiva que inverta uma string.
public class Questao3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()){
            String p = sc.nextLine();

            System.out.println(inverterPalavra(p));
        }
    }

    static String inverterPalavra(String p){
       //pego o ultimo caractere

        if (p.length() <=1)
            return p;

        return  p.substring(p.length()-1) + inverterPalavra(p.substring(0, p.length()-1));
    }
}


package listaexercicio;

//import java.util.Scanner;

public class Questao1 {
 
    //recursiva: somar até esvaziar o vetor
    public static int somaVetor(int listaNum[], int tamanho){
        if (tamanho==0){
            return 0;
        }
        return listaNum[tamanho-1] + somaVetor(listaNum, tamanho-1);
    }
    
    public static void main(String[] args) {
        int l[] ={10,2};
        System.out.println("Resultado: " + somaVetor(l, l.length));
    }
}

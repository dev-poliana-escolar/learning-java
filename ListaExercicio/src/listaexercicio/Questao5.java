package listaexercicio;

import java.util.Scanner;


public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()){
            int n1 = sc.nextInt();
            int n2 =sc.nextInt();
            
            System.out.println(multiplicacao(n1,n2)); 
        }
        
        sc.close();
        
    }
    
    public static int multiplicacao(int n1, int n2){
        if (n2==0)
            return 0;
        if (n2<0)
            return -multiplicacao(n1,-n2);
        else
            return n1 + multiplicacao(n1,n2-1); 
    }
}

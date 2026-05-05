package listaexercicio;

import java.util.Scanner;


public class Questao4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()){
            int n = sc.nextInt();  
            System.out.println("Resultado:" + (soma(n)));
           
        }
        sc.close();
    }
    
    public static int soma(int n){
        if (n == 1)
            return 1;
        
        return n + soma(n-1);
        
    }
}


package listaexercicio;

import java.util.Scanner;


public class Questao6 {
    //6. Implemente uma função recursiva para converter um número natural em base binária.
    
    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()){
            int n = sc.nextInt();
           
            
            System.out.println(converterBinario(n)); 
        }
        
        sc.close();
    }
    public static String converterBinario(int n){
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
    
    return converterBinario(n / 2) + (n % 2);
        
    }
        
    
}

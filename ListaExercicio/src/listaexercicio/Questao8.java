
package listaexercicio;

import java.util.Scanner;

public class Questao8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palavra: ");
        String p = sc.nextLine();
            
        System.out.println(verificarPalindromo(p)); 
       
        
        sc.close();
    }
    
    public static Boolean verificarPalindromo(String palavra){
        int tamanho = palavra.length();
        char inicio = palavra.charAt(0);
        char fim = palavra.charAt(tamanho-1);
        
        if (tamanho <=1)
            return true;
        else if ( inicio != fim)
            return false;
        
        return verificarPalindromo(palavra.substring(1, tamanho-1));
         
    }

   
}


package listaexercicio;

import java.util.Scanner;


public class Questao3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        if (sc.hasNextInt()){
            int base = sc.nextInt();
            int exp = sc.nextInt();
            
            System.out.println("Resultado: " + potencia(base, exp));
        }
        
        sc.close();
    }
    
    public static int potencia(int base, int exp){
        if (exp ==0){
            return 1;
        }
        
        return base * potencia(base, exp-1);
    }
    
}
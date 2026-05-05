
package listaexercicio;

import java.util.Scanner;

public class Questao7 {
    // Implemente uma função recursiva para calcular o MMC (mínimo múltiplo comum) entre dois números.
    
     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
           
            
            System.out.println(mmc(n1, n2)); 
        }
        
        sc.close();
    }
    
    public static int mmc(int n1, int n2){
        int maiorNumero = Math.max(n1, n2); 
        return mmcCal(n1, n2,maiorNumero );
    }

    public static int mmcCal(int n1, int n2, int n3){
        if (n3 % n1 == 0 && n3 % n2 == 0)
            return n3;

        return mmcCal(n1, n2, n3 + 1);
    }
    
}

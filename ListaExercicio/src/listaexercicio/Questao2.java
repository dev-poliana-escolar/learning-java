
package listaexercicio;

public class Questao2 {
    
    public static void contagemRegressiva(int n){
        if (n == 0)
            return;
        System.out.println(n);
        contagemRegressiva(n-1); 
    }
    
    public static void main(String[] args) {
        contagemRegressiva(8);
    }

}

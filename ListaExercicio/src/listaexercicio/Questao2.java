/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

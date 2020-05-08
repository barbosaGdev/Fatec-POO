/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01material04;

import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class exercicio01aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();
        int matriz[][];
        int n1;
        int n2;
        
        System.out.println("JOGO DO TABULEIRO DA SORTE");
        System.out.println("Digite o primeiro número: ");
        jogo.n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        jogo.n2 = sc.nextInt();
               
        System.out.println("Primeiro número digitado: " + jogo.getNA(jogo.n1));
        System.out.println("Segundo número digitado: " + jogo.getNA(jogo.n2));        
        System.out.println("RESULTADO >>> " + jogo.Jogo());        
        
        
    }
    
}

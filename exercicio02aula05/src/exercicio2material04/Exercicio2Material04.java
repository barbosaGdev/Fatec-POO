/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2material04;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Exercicio2Material04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculo obj = new Calculo();
        
        System.out.println("Cálculo de Volume");
        System.out.println("Digite o raio da esfera: ");
        double raio = s.nextDouble();
                
        System.out.println("Volume: " + obj.Calculo(raio));
    }
    
}

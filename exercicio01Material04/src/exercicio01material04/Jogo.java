/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01material04;

import java.util.Random;
/**
 *
 * @author gabriel
 */
public class Jogo {
    public int n1;
    public int n2;
    public int nSorte;
    public int matriz[][];
    public String mensagem;
 
    public String Jogo(){
       Random gerador = new Random();
       
       int matriz[][] = new int[10][10];
       int acertos = 0;
       int preco = 0;
       n1 = getNA(n1);
       n2 = getNB(n2);
       
       for(int i = 0; i < 10;i++){ // percorre a linha
            for(int j = 0; j < 10;j++){ // percorre a coluna
               matriz[i][j] = gerador.nextInt(101);
               
               if(matriz[i][j] == n1 || matriz[i][j] == n2 ) {
                   acertos = acertos + 1;
               }
               
               
          
           }
       }
      
       
       if (acertos > 3){
           preco = (acertos*1000);
           mensagem = "Parabéns ganhador! Seu prêmio é de: " + preco;
       } else {
           mensagem = "Não foi dessa vez! :|";
       }
       
      
       return mensagem;
    }
    
    public int getNA(int n1){
        return n1;
    }
    
    public int getNB(int n2){
        return n2;
    }
    
}
    


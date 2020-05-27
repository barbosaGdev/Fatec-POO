/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleponto;

/**
 *
 * @author gabriel
 */
public class Gerente extends Funcionario {
    String login;
    String senha;
    
    private String getLogin(){
        return login;
    }
    
    private String getSenha(){
        return senha;
    }
    
    private void setLogin(String login){
        this.login = login;
    }
    
    private void setSenha(String senha){
        this.senha = senha;
    } 
    
}

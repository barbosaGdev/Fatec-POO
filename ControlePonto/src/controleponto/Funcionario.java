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
public class Funcionario {

    int idFunc;
    String nome;
    String email;
    String documento;

    private int getIdFunc() {
        return idFunc;
    }

    private void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getDocumento() {
        return documento;
    }

    private void setDocumento(String documento) {
        this.documento = documento;
    }

}

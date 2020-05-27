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
public class Secretaria extends Funcionario {

    String telefone;
    String ramal;

    private String getTelefone() {
        return telefone;
    }

    private String getRamal() {
        return ramal;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private void setRamal(String ramal) {
        this.ramal = ramal;
    }

}

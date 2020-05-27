/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleponto;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author gabriel
 */
public class RegistroPonto {

    long idRegPonto;
    Funcionario func;
    LocalDate dataRegistro;
    LocalDateTime horaEntrada;
    LocalDateTime horaSaida;

    private long getIdRegPonto() {
        return idRegPonto;
    }

    private Funcionario getFunc() {
        return func;
    }

    private LocalDate getDataRegistro() {
        return dataRegistro;
    }

    private LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    private LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    private void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    private void setFuncionario(Funcionario func) {
        this.func = func;
    }

    private void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    private void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    private void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

}

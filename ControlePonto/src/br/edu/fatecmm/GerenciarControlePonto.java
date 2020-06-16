package br.edu.fatecmm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GerenciarControlePonto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("João");
        gerente.setEmail("joao@fatec.com");
        gerente.setDocumento("1111111111");
        gerente.setLogin("joao");
        gerente.setSenha("123456");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Maria");
        secretaria.setEmail("maria@fatec.com");
        secretaria.setDocumento("2222222222");
        secretaria.setTelefone("38383838");
        secretaria.setRamal("123");

        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Marcos");
        operador.setEmail("marcos@fatec.com");
        operador.setDocumento("3333333333");
        operador.setValorHora(10);

        RegistroPonto reggerente = new RegistroPonto();
        reggerente.setIdRegPonto(1);
        reggerente.setFunc(gerente);
        reggerente.setDataRegistro(LocalDate.now());
        reggerente.setHoraEntrada(LocalDateTime.now());
        try{
            Thread.sleep(1000);
        }catch(Exception erro){}
        reggerente.setHoraSaida(LocalDateTime.now());

        RegistroPonto regsecretaria = new RegistroPonto();
        regsecretaria.setIdRegPonto(2);
        regsecretaria.setFunc(secretaria);
        regsecretaria.setDataRegistro(LocalDate.now());
        regsecretaria.setHoraEntrada(LocalDateTime.now());
        try{
            Thread.sleep(1000);
        }catch(Exception erro){}
        regsecretaria.setHoraSaida(LocalDateTime.now());

        RegistroPonto regoperador = new RegistroPonto();
        regoperador.setIdRegPonto(3);
        regoperador.setFunc(operador);
        regoperador.setDataRegistro(LocalDate.now());
        regoperador.setHoraEntrada(LocalDateTime.now());
        try{
            Thread.sleep(1000);
        }catch(Exception erro){}
        regoperador.setHoraSaida(LocalDateTime.now());

        reggerente.apresentarRegistroPonto();
        regsecretaria.apresentarRegistroPonto();
        regoperador.apresentarRegistroPonto();
    }
}
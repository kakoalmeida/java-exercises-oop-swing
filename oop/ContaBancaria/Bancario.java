package com.company;

import java.util.TreeMap;

public class Bancario extends Pessoa{
    double emprestimo;
    String registro;
    int tmpServ;
    public Bancario(String nome, String cpf, String Profissao, String genero, String registro, int tmpServ){
        super(nome, cpf, Profissao, genero);
        this.registro = registro;
        this.tmpServ = tmpServ;
    }

    public String retReg(){
        return registro;
    }

    public void banco(){
        System.out.println(nome + " é funcionario do banco Brasil há " + tmpServ + " anos");
    }

    public boolean fazEmprestimo(double valor){
        if (valor > 7500 || valor < 1000){
            System.out.println("O valor minimo para emprestimos é de R$1000,00");
            System.out.println("Valor máximo de emprestimo é de R$7.500,00");
            System.out.println("Emprestimo negado");
        return false;
        }else
            System.out.println("Emprestimo concedio no valor de R$" + valor);
            System.out.println("Obrigado!");
            return true;
    }

    public void infoFunc(){
        System.out.println("Funcionário: " + nome + ", Cadastro n° " + registro + ", Sexo " + genero);
        System.out.println("Cargo: " + Profissao);
        System.out.println("CPF: " + cpf);
    }
}



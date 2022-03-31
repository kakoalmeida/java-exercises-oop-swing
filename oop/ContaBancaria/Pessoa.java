package com.company;

public class Pessoa {

    String nome, cpf, Profissao, genero;

    public Pessoa(String nome, String cpf, String Profissao, String genero){
        this.nome = nome;
        this.cpf = cpf;
        this.Profissao = Profissao;
        this.genero = genero;
    }

    public String Nome(){
        return nome;
    }

    public String id(){
        return cpf;
    }

    public String work(){
        return Profissao;
    }

    public String sexo(){
        return genero;
    }
}


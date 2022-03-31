package com.company;

class Pessoa {

    String nome, cpf, endereco;

    public Pessoa(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String retornaNome(){
        return nome;
    }

    public String retornaCpf(){
        return cpf;
    }

    public String retornaEnd(){
        return endereco;
    }
}

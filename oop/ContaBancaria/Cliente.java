package com.company;

public class Cliente extends Pessoa{

    String nrConta;

    public Cliente(String nome, String cpf, String nrConta, String Profissao, String genero){
        super(nome, cpf, Profissao, genero);
        this.nrConta = nrConta;
    }

    public String nConta(){
        return nrConta;
    }


    public void infoCliente(){
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Conta: " + nrConta);
        System.out.println("CPF: " + cpf);
        System.out.println("Genero " + genero);
        System.out.println("Ocupação: " + Profissao);
    }
}

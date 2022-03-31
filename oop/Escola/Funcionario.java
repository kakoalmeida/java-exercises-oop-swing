package com.company;

class Funcionario extends Pessoa{

    String codigo;
    double salario;

    public Funcionario(String nome, String cpf, String endereco, String codigo, double salario){
        super(nome, cpf, endereco);
        this.codigo = codigo;
        this.salario = salario;
    }

    public double retornaSalario(){
        salario = salario - (salario * 0.07);
        return salario;
    }

    public String retornaCod(){
        return codigo;
    }
}

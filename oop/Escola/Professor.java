package com.company;

class Professor extends Funcionario{

    String dept;

    public Professor(String nome, String cpf, String endereco, String codigo, double salario, String dept){
        super(nome, cpf, endereco, codigo, salario);
        this.dept = dept;
    }

    public String retornaDept(){
        return dept;
    }

    public void showProf(){
        System.out.println("Professor: " + nome);
        System.out.println("Registro n°: " + codigo);
        System.out.println("CPF: " + cpf);
        System.out.println("Reside em: " + endereco);
        System.out.println("Remuneração: " + salario);
        System.out.println("Departamento de ensino: " + dept);
        System.out.println("\n");
    }
}

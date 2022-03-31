package com.company;

class Coordenador extends Funcionario{

    String curso;

    public Coordenador(String nome, String cpf, String endereco, String codigo, double salario, String curso){
        super(nome, cpf, endereco, codigo, salario);
        this.curso = curso;
    }

    public String retornaCurso(){
        return curso;
    }

    public void showCoord(){
        System.out.println("Coordenador: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Endereço: " + endereco);
        System.out.println("Registro n°: " + codigo);
        System.out.println("CPF: " + cpf);
        System.out.println("Remuneração: " + salario);
    }
}

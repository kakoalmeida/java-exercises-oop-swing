package com.company;

class Aluno extends Pessoa{

    String matricula;

    public Aluno(String nome, String cpf, String endereco, String matricula){
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }

    public String retornaMat(){
        return matricula;
    }

    public void showAluno(){
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula n°: " + matricula);
        System.out.println("Reside em: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("\n");
    }

}

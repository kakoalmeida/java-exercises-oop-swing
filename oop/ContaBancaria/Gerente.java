package com.company;

public class Gerente extends Bancario{
    public Gerente(String nome, String cpf, String Profissao, String genero, String registro, int tmpServ) {
        super(nome, cpf, Profissao, genero, registro, tmpServ);
    }

    @Override
    public void banco(){
        System.out.println(nome + " é o atual gerente do banco Brasil, com mais de " + tmpServ + " anos de serviços " +
               "prestados a empresa!");
    }

    @Override
    public boolean fazEmprestimo(double valor) {
        if (valor > 15000) {
            System.out.println("Valor maximo para emprestimos é de R$15.000");
            System.out.println("Emprestimo negado");
            return false;
        }else
            System.out.println("Emprestimo concedio no valor de R$" + valor);
        System.out.println("Obrigado!");
        return true;

    }
}

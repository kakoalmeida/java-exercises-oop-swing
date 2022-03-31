package com.company;

public class ContaPrincipal {

    String nomeCliente;
    String numConta;
    double saldo;

    public ContaPrincipal(String nomeCliente, String numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String NomeCliente() {
        return nomeCliente;
    }

    public String nConta() {
        return numConta;
    }

    public double qtSaldo(){
        return saldo;
    }

    public void infoConta(){
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Conta: " + numConta);
        System.out.println("Saldo atual: " + saldo);
    }

    public boolean Sacar(double valor){
        if ((saldo - valor) > 0){
            saldo -= valor;
            System.out.println("Saldo após o saque: R$" + saldo);
            return true;
        } else
            System.out.println("Valor indisponivel na conta!");
        return false;
    }

    public double Depositar (double valor){
        saldo += valor;
        System.out.println("Valor depositado, novo saldo é de: R$" + saldo);
        return saldo;
    }
}

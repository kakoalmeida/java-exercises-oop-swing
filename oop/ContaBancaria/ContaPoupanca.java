package com.company;

public class ContaPoupanca extends ContaPrincipal{

    double rendimento;
    int depositos = 0;
    int retiradas = 0;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo){
        super(nomeCliente, numConta, saldo);
    }

    public double ganhoAno(){
        double lucro = (saldo * 0.0765);
        rendimento = lucro;
        return rendimento;
    }

    public double Depositar (double valor){
        saldo += valor;
        depositos++;
        System.out.println("Valor depositado na sua poupanca de R$" + valor);
        return saldo;
    }

    public boolean Sacar(double valor){
        if ((saldo - valor) > 0){
            saldo -= valor;
            retiradas++;
            System.out.println("Saldo após o saque: R$" + saldo);
            //infoConta();
            return true;
        } else
            System.out.println("Valor indisponivel na conta!");
        return false;
    }

    @Override
    public void infoConta(){
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Conta: " + numConta);
        String val = String.format("%.2f", (saldo + rendimento));
        System.out.println("Saldo atual: R$" + val);
        ganhoAno();
        String result = String.format("%.2f", rendimento);
        System.out.println("Sua conta está rendendo ao ano: R$" + result);
        if (depositos > 0){
            System.out.println("Depositos este mes: " + depositos);
        }else
            System.out.println("Nenhum deposito este mes");
        System.out.println("Saques: " + retiradas);
    }

}

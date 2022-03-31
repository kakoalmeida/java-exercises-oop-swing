package com.company;

public class ContaCorrente extends ContaPrincipal{
    double credito;
    int saques = 0;
    int depositos = 0;

    public ContaCorrente(String nomeCliente, String numConta, double saldo){
        super(nomeCliente, numConta, saldo);
        credito = 1000;
    }
    @Override
    public boolean Sacar(double valor) {
        if ((saldo - valor) < 0) {
            if ((valor - saldo) <= credito){
                valor -= saldo;
                credito -= valor;
                saldo = (credito - saldo) - (saldo - valor);
                saques++;
                System.out.println("Valor retirado do cheque especial R$" + valor + "");
                System.out.println("Novo limite: R$" + credito);
                System.out.println("Saldo: R$" + saldo);
            }else
                System.out.println("Valor indisponivel na conta!");
            return false;
        } else
            System.out.println("Saldo: R$" + saldo);
            saldo -= valor;
            saques++;
            System.out.println("Saldo após o saque: R$" + saldo + " | Valor retirado R$" + valor);
        return true;
    }

    public double Depositar (double valor) {
        saldo += valor;
        depositos++;
        System.out.println("Valor depositado, novo saldo é de: R$" + saldo);
        return saldo;
    }

    public void extrato(){
        System.out.println("---Seu Extrato---");
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("Crédito: R$" + credito);
        System.out.println("Taxa ao mes: R$12.65");
        System.out.println("Próxima fatura em 15 dias");
        System.out.println("Total de saques: " + saques);
        if (depositos > 0){
            System.out.println("Depositos este mes: " + depositos);
        }else
            System.out.println("Nenhum deposito este mes");
    }

    @Override
    public void infoConta() {
        super.infoConta();
        System.out.println("Crédito: R$" + credito);
    }
}

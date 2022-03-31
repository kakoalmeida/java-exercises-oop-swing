package com.company;

public class Main {

    public static void main(String[] args) {
	    ContaPrincipal conta = new ContaPrincipal("Kaue Almeida",
                "123",
                5000);
        ContaPoupanca poupanca = new ContaPoupanca("Kaue Almeida",
                "123",
                5253);
        ContaCorrente corrente = new ContaCorrente("Kaue Almeida",
                "123",
                500);

        Cliente cliente = new Cliente("Jane",
                "12345678900",
                "6024",
                "Caixa de Mercado",
                "F");

        Bancario func = new Bancario("John Doe",
                "32145678900",
                "Analista de Crédito",
                "Masculino",
                "45312-7",4);

        Gerente gerente = new Gerente("Jack Daniels",
                "12345678900",
                "Chefe executivo",
                "Masculino",
                "35167-8", 10);



        /*
        conta.Depositar(615);
        conta.Sacar(150);               // Chama os métodos de ContaPrincipal
        conta.infoConta();
        */

        /*
        poupanca.infoConta();
        poupanca.Sacar(253);
        poupanca.Depositar(1500);       // Chama os métodos de Poupanca
        poupanca.infoConta();
        */

        /*
        corrente.Sacar(300);
        corrente.extrato();             // Chama os métodos de ContaCorrente
        corrente.Depositar(500);
        corrente.extrato();
        corrente.infoConta();
        */

        //cliente.infoCliente();        // Chama Cliente

        /*
        func.infoFunc();
        func.banco();                   // Chama Bancario
        func.fazEmprestimo(2500);
        */

        /*
        gerente.infoFunc();
        gerente.banco();                // Chama Gerente
        gerente.fazEmprestimo(12000);
        */
    }


}

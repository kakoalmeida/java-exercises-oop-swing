package com.company;

//Um sistema de cadastro de funcionários possui dois subtipos: FuncionárioEfetivo
//e FuncionárioTemporário. Esse sistema guarda informações como nomes, cargo e função.
//Além disso, caso o funcionário seja FuncionárioEfetivo ele terá seu tempo de trabalho
//armazenado e, caso o funcionário seja FuncionárioTemporário ele terá um tempo de trabalho
//fixo, ou seja, por um determinado período. A qualquer momento deve ser possível imprimir
//todos dados de um determinado funcionário. Implemente as classes necessárias em Java para
//tornar possível a visualização pelo usuário.

class CadastroEmpresa {
    String nome;
    String cargo;
    String funcao;

    public CadastroEmpresa(String nome, String cargo, String funcao){
        this.nome = nome;
        this.cargo = cargo;
        this.funcao = funcao;
    }

    public String nomeFunc (){
        return this.nome;
    }

    public String CargoFunc(){
        return this.cargo;
    }

    public String trabalhoFunc(){
        return this.funcao;
    }

    public void exibirDados(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Função: " + funcao);
    }
}

class FuncionarioEfetivo extends CadastroEmpresa{
    int tmpServiço;
    int registro;

    public FuncionarioEfetivo(String nome, String cargo, String funcao, int tmpServiço){
        super(nome, cargo, funcao);
        this.tmpServiço = tmpServiço;
        registro = tmpServiço;  // armazena o tempo de serviço
    }

    public int tmpServico() {
        return tmpServiço;
    }

    @Override
    public void exibirDados(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Função: " + funcao);
        System.out.println("Trabalha na empresa há " + tmpServiço + " anos");
        System.out.println(registro);
    }

}

class FuncionarioTemporario extends CadastroEmpresa {
    int contrato;
    public FuncionarioTemporario(String nome, String cargo, String funcao, int contrato){
        super(nome, cargo, funcao);
        this.contrato = contrato;
    }

    public double getContrato(){
        return contrato;
    }

    @Override
    public void exibirDados(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Função: " + funcao);
        System.out.println("Tempo de contrato em meses, de " + contrato + " meses");
    }

}
public class Main {

    public static void main(String[] args) {
        FuncionarioEfetivo fe = new FuncionarioEfetivo("Kaue", "Lider de setor", "Gerenciar equipes de dev", 3);
        FuncionarioTemporario ft = new FuncionarioTemporario("Kaue", "Estagiario", "Gerenciar página Web", 6);
        fe.exibirDados();
        System.out.println("---------------");
        ft.exibirDados();
    }
}

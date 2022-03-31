package com.company;
//Crie a classe Imóvel, que possui um endereço e um preço.
//a) crie uma classe Novo, que herda Imóvel e possui um adicional no preço. Crie métodos de
//acesso e impressão deste valor adicional.
//b) crie uma classe Velho, que herda Imóvel e possui um desconto no preço. Crie métodos de
//acesso e impressão para este desconto.

class Imovel {

    String endereco;
    double preco;

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    public String local(){
        return endereco;
    }

    public double valor(){
        return preco;
    }

    public void exibirImovel(){
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor do imovel: " + preco);
    }
}

class NovoImovel extends Imovel {

    public NovoImovel(String endereco, double preco){
        super(endereco, preco);
    }


    public double valor(double valorSobre){

        double adicional;
        adicional = preco + (preco * valorSobre);
        preco = adicional;
        System.out.println("Adicional de " + valorSobre + "% sobre o valor original. Novo preço: R$" + preco);
        return preco;
    }

    @Override
    public void exibirImovel() {
        super.exibirImovel();
    }
}

class ImovelVelho extends Imovel{

    public ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }

    public double valor(double novPreco) {
        double desconto;
        desconto = preco - (preco * novPreco);
        preco = desconto;
        System.out.println("Desconto de " + novPreco + "%, do valor original. Novo preço: R$" + preco);
        return preco;
    }

    @Override
    public void exibirImovel() {
        super.exibirImovel();
    }
}
public class Main {

    public static void main(String[] args) {
	NovoImovel ni = new NovoImovel("Av. Roraima", 150);
    ImovelVelho iv = new ImovelVelho("Av. Roraima", 200);

    ni.exibirImovel();
    ni.valor(0.7);


    iv.exibirImovel();
    iv.valor(0.4);
    }
}

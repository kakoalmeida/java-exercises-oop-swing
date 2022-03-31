package com.company;

class Mamifero extends Animal{

    String alimento;

    public Mamifero(String nome, String cor, String alimento, int comprimento, int patas, float velocidade) {
        super(nome, cor, comprimento, patas, velocidade);
        this.alimento = alimento;
    }

    @Override
    void alteraAmbiente(String ambiente){
        String habitat = ambiente;
        this.ambiente = habitat;
    }

    @Override
    void alteraPatas (int patas){
        int qtPatas = patas;
        this.patas = qtPatas;
    }

    void alteraAlimento (String alimento){
        String comida = alimento;
        this.alimento = comida;
    }

    void dados(){
        System.out.println("------------");
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + "cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + "m/s");
        System.out.println("Alimento: " + alimento);
    }
}

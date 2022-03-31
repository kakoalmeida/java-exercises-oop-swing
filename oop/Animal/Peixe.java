package com.company;

class Peixe extends Animal{
    String caracterista;

    public Peixe(String cor ,String caracterista, String ambiente, int comprimento, float velocidade) {
       super(cor, ambiente, comprimento, velocidade);
       this.caracterista = caracterista;
    }

    @Override
    void alteraAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    @Override
    void alteraPatas (int patas){
        this.patas = 0;
    }

    @Override
    void alteraCor (String cor){
        this.cor = cor;
    }


    void alteraCaracteristica(String caracterista){
        this.caracterista = caracterista;
    }

    void dados(){
        System.out.println("------------");
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + "cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + "m/s");
        System.out.println("Caracteristicas: " + caracterista);
    }
}

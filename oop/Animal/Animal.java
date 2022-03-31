package com.company;

class Animal {

    String nome, cor, ambiente;
    int comprimento, patas;
    float velocidade;

    public Animal (String nome, String cor, String ambiente, int comprimento, int patas, float velocidade){
        this.ambiente = ambiente;
        this.nome = nome;
        this.cor = cor;
        this.comprimento = comprimento;
        this.patas = patas;
        this.velocidade = velocidade;
    }

    public Animal(String cor, String ambiente, int comprimento, float velocidade) {} // Construtor para peixe
    public Animal(String nome, String cor, int comprimento, int patas, float velocidade){} // Construtor para mamifero


    void alteraNome (String nome){
        String novoNome = nome;  // Cria a variavel novoNome que recebe nome
        this.nome = novoNome;   // Após retorna this.nome com o novo nome
    }

    void alteraComprimento (int comprimento){
        int tamanho = comprimento; // Mesma lógica do método acima
        this.comprimento = tamanho;
    }
                                    // Os metódos abaixo seguem a mesma lógica
    void alteraPatas (int patas){
        int nPatas = patas;
        this.patas = nPatas;
    }

    void alteraCor (String cor){
        String novaCor = cor;
        this.cor = novaCor;
    }

    void alteraAmbiente (String ambiente){
        String habitat = ambiente;
        this.ambiente = habitat;
    }

    void alteraVelocidade (float velocidade){
        float v = velocidade;
        this.velocidade = v;
    }

    void dados(){
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + "cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: "+ velocidade + "m/s");
    }
}

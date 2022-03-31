package com.company;

public class TesteAnimais {
    public static void main(String[] args) {
        Animal a = new Animal("Mamifero",
                "marrom",
                "Gelo",
                180,
                4,
                (float) 25.2);
        Mamifero m = new Mamifero("Cachorro",
                "Caramelo",
                "Osso",
                50,
                4,
                (float) 0.9);
        Peixe p = new Peixe("cinza",
                "ferrão",
                "Mar",
                45,
                (float) 31.3);

        a.alteraNome("Arara");
        a.alteraComprimento(72);
        a.alteraAmbiente("Amazonia");
        a.alteraCor("Azul");
        a.alteraPatas(2);
        a.alteraVelocidade((float) 14.0);
        a.dados();

        p.comprimento = 2000;
        p.alteraNome("Baleia");
        p.velocidade = (float)5.5;
        p.alteraAmbiente("Mar");
        p.alteraCaracteristica("Barbatana e cauda");
        p.cor = "Cinza e Preto";
        p.dados();

        m.alteraNome("Vaca");
        m.ambiente = "Terra";
        m.comprimento = 170;
        p.velocidade = (float)0.5;
        m.alteraPatas(4);
        m.cor = "Marrom";
        m.alteraAlimento("Pasto");
        m.dados();
    }
}
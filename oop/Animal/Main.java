package com.company;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal("Mamifero", "marrom", "Gelo", 180, 4, (float) 25.2);
        Peixe p = new Peixe("cinza",
                "ferrão",
                "Mar",
                45,
                (float) 31.3);

        Mamifero m = new Mamifero("Urso-do-Canadá",
                "Vermelho",
                "Mel",
                180,
                4,
                (float) 0.5
        );




        a.alteraNome("Camelo");
        a.alteraComprimento(150);
        a.alteraAmbiente("Deserto");
        a.alteraCor("Amarelo");
        a.alteraPatas(4);
        a.alteraVelocidade((float) 2.0);
        a.dados();

        p.comprimento = 300;
        p.alteraNome("Tubarao");
        p.velocidade = (float)1.5;
        p.alteraAmbiente("Mar");
        p.alteraCaracteristica("Barbatana e cauda");
        p.cor = "Cinzento";
        p.dados();

        m.alteraNome("Urso do Canadá");
        m.ambiente = "Terra";
        m.comprimento = 180;
        p.velocidade = (float)0.5;
        m.alteraPatas(4);
        m.cor = "Vermelho";
        m.alteraAlimento("Mel");
        m.dados();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    Aluno aluno = new Aluno("Kaue Almeida",
                "12345678900",
                "Av. Castelo Branco, n° 22",
                "654321000");

        Professor professor = new Professor("Hawking",
                "20045689176",
                "Av. Roraima",
                "98761-0",
                3000,
                "CTISM");

        Coordenador coordenador = new Coordenador("Linus Torvalds",
                "34567890123",
                "Av. Roraima",
                "123481-9",
                5300,
                "Redes de Computadores");

        professor.retornaSalario();
       coordenador.retornaSalario();
        aluno.showAluno();
        professor.showProf();
        coordenador.showCoord();
    }
}

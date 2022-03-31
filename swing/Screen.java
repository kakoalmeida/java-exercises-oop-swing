package com.company;

import java.awt.*;
import javax.swing.*;

public class Main {

    public Main(){
        ImageIcon imagem = new ImageIcon(getClass().getResource("download.jpeg"));
        JLabel labelImg = new JLabel(imagem);
        JFrame frame = new JFrame("Descrição de imagens");
        GridLayout gl = new GridLayout();
        frame.setLayout(gl);

        JPanel tux = new JPanel();
        tux.add(labelImg);

        JPanel txt = new JPanel();
        JLabel t = new JLabel("<html><p>Tux é o mascote oficial do <br> Kernel Linux. Foi criado em <br> 1996, a ideia de ser um <br> pinguim veio do próprio Linus <br>Torvalds.</p></html>");
        txt.add(t);

        frame.add(tux);
        frame.add(txt);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Main();
    }
}

package com.company;

import java.awt.*;
import javax.swing.*;

public class Janela extends JFrame {

    private static void CreateWindow() {
        JFrame frame = new JFrame("Gerenciador de abas");
        JTabbedPane abas = new JTabbedPane();

        JPanel primeiraAba = new JPanel();
        GridLayout gl = new GridLayout();
        primeiraAba.setLayout(gl);
        JLabel ta = new JLabel("Esta é a primeira aba");
        primeiraAba.add(ta);
        JButton bt1 = new JButton("OK");
        primeiraAba.add(bt1);
        JButton bb = new JButton("Cancel");
        primeiraAba.add(bb);

        JPanel segundaaAba = new JPanel();
        BorderLayout bl = new BorderLayout();
        segundaaAba.setLayout(bl);
        JLabel ta2 = new JLabel("Lado direito");
        segundaaAba.add(BorderLayout.EAST, ta2);
        JLabel l = new JLabel("Lado esquerdo");
        segundaaAba.add(BorderLayout.WEST, l);
        JButton bt2 = new JButton("OK");
        segundaaAba.add(BorderLayout.NORTH, bt2);
        JButton b2 = new JButton("STOP");
        segundaaAba.add(BorderLayout.SOUTH, b2);

        JPanel terceiraAba = new JPanel();
        FlowLayout fl = new FlowLayout();
        terceiraAba.setLayout(fl);
        JLabel ta3 = new JLabel("Esta é a terceira aba");
        terceiraAba.add(ta3);
        JButton bt3 = new JButton("OK");
        terceiraAba.add(bt3);

        abas.add("Aba 1", primeiraAba);
        abas.add("Aba 2", segundaaAba);
        abas.add("Aba 3", terceiraAba);

        frame.add(abas);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args)  {
        CreateWindow();
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener{

    private static JLabel jurosLabel;
    private static JLabel mesLabel;
    private static JLabel reajuste;
    private static JLabel finalV;
    private static JTextField jurosText;
    private static JTextField mesText;
    private static JTextField setV;
    private static JLabel valor;
    private static JButton btn;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        valor = new JLabel("Valor");
        panel.add(valor);

        setV = new JTextField(5);
        panel.add(setV);

        jurosLabel = new JLabel("Taxa de Juros");
        panel.add(jurosLabel);

        jurosText = new JTextField(5);
        panel.add(jurosText);

        mesLabel = new JLabel("Total de meses");
        panel.add(mesLabel);

        mesText = new JTextField(5);
        panel.add(mesText);

        btn = new JButton("Calcular");
        btn.addActionListener(new Main());
        panel.add(btn);

        reajuste = new JLabel("");
        reajuste.setMaximumSize(new Dimension(20, 20));
        panel.add(reajuste);

        finalV = new JLabel("");
        panel.add(finalV);

        frame.add(panel);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String juro = jurosText.getText();
        String meses = mesText.getText();
        String getV = setV.getText();

        Double nvJuro = Double.parseDouble(juro);
        int nvMes = Integer.parseInt(meses);
        double newV = Double.parseDouble(getV);

        Double calcJuro = nvMes * nvJuro;
        double fV = newV * calcJuro;
        newV += fV;

        String s = String.valueOf(newV);
        String f = String.valueOf(calcJuro);

        reajuste.setText("Coreção de juros: " + f);
        finalV.setText("Valor Reajustado: " + s);
//        System.out.println(nvJuro + " " +  nvMes + " " + calcJuro + " " + fV + " " + newV);
    }
}
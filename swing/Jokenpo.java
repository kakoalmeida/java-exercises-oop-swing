package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class questaoTres {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label1;
    private static JLabel label2;
    private static JLabel label3;
    private static JRadioButton rb1;
    private static JRadioButton rb2;
    private static JRadioButton rb3;
    private static JButton button;
    private static Random rand = new Random();

    public static void gui() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("JOGAR!!!");

        ImageIcon img1 = new ImageIcon("./images/rock.jpg");
        ImageIcon img2 = new ImageIcon("./images/paper.png");
        ImageIcon img3 = new ImageIcon("./images/scisor.png");

        label1 = new JLabel(img1);
        label2 = new JLabel(img2);
        label3 = new JLabel(img3);
        rb1 = new JRadioButton("PEDRA", false);
        rb2 = new JRadioButton("PAPEL", false);
        rb3 = new JRadioButton("TESOURA", false);

        int jogadaBot = bot();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected() && jogadaBot == 0){                                                                            //2 tesoura
                    JOptionPane.showMessageDialog(null, "Empate!");
                }
                if (rb1.isSelected() && jogadaBot == 1){
                    JOptionPane.showMessageDialog(null, "Computador ganhou!!!");
                }
                if (rb1.isSelected() && jogadaBot == 2){
                    JOptionPane.showMessageDialog(null, "Você ganhou!!!!");
                }
                if (rb2.isSelected() && jogadaBot == 0){
                    JOptionPane.showMessageDialog(null, "Você ganhou!!!");
                }
                if (rb2.isSelected() && jogadaBot == 1){
                    JOptionPane.showMessageDialog(null, "Empate!");
                }
                if (rb2.isSelected() && jogadaBot == 2){
                    JOptionPane.showMessageDialog(null, "Computador ganhou!!!");
                }
                if (rb3.isSelected() && jogadaBot == 0){
                    JOptionPane.showMessageDialog(null, "Computador ganhou!!!");
                }
                if (rb3.isSelected() && jogadaBot == 1){
                    JOptionPane.showMessageDialog(null, "Você ganhou!!!");
                }
                if (rb3.isSelected() && jogadaBot == 2){
                    JOptionPane.showMessageDialog(null, "Empate!");
                }

                if (JOptionPane.showConfirmDialog(null, "Jogar novamente?") == JOptionPane.YES_OPTION ){
                    bot();
                    rb1.setSelected(false);
                    rb2.setSelected(false);
                    rb3.setSelected(false);
                } else {
                    System.exit(0);
                }
            }
        });


        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(button);
        panel.setLayout(new GridLayout(3, 2));

        panel.setBorder(BorderFactory.createTitledBorder("Jo Ken Po"));
        frame.getContentPane().add(panel);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setTitle("Jo Ken Po");
        frame.setLocation(1100, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static int bot() {
        int number = rand.nextInt(3);
        System.out.println(number);
        return number;
    }

    public static void game(){
        gui();
    }

    public static void main(String[] args) {
        new questaoTres();
        questaoTres.game();

    }
}

package com.company;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    JFrame frame;
    JFrame frame2;
    JTabbedPane abas;
    JTextComponent component;
    MenuBar nMenu;
    JLabel alugarCarro;
    JTextField dias;
    JTextField dias2;

    String[] carros = new String[]{
            "Marea",
            "Siena",
            "Cronos",
            "Premio",
            "Grand Siena"
    };

    JComboBox<String> comboBox = new JComboBox<>(carros);
    JComboBox<String> comboBox2 = new JComboBox<>(carros);

    public static void main(String[] args) {

        new Main();
    }

    public Main(){
        frame = new JFrame();
        JPanel panel = new JPanel();
        dias = new JTextField(10);
        GridLayout gl = new GridLayout(15, 1);
        panel.setLayout(gl);
        abas = new JTabbedPane();
        component = (JTextComponent) comboBox.getEditor().getEditorComponent();
        nMenu = new MenuBar();
        Menu menu1 = new Menu("Opções");
        MenuItem item1 = new MenuItem("Cadastrar Carro");
        MenuItem item2 = new MenuItem("Calcular Despesas");
        Menu menu2 = new Menu("Gerenciar");
        MenuItem item4 = new MenuItem("Informações sobre veiculos");
        MenuItem item5 = new MenuItem("Pesquisar carro");
        Menu menu3 = new Menu("Limpar Campos");
        MenuItem item6 =new MenuItem("Limpar");
        Menu menu4 = new Menu("Sair");
        MenuItem item7 = new MenuItem("Sair");
        JLabel value = new JLabel("");
        JLabel info1 = new JLabel("");
        JLabel multa1 = new JLabel("");
        JLabel tAlugar = new JLabel("");
        JLabel ret = new JLabel("");
        JLabel cor = new JLabel("Selecione a cor");
        JRadioButton rb = new JRadioButton("Vermelho");
        JRadioButton rb1 = new JRadioButton("Azul");
        JRadioButton rb2 = new JRadioButton("Preto");
        JRadioButton rb3 = new JRadioButton("Branco");

        alugarCarro = new JLabel("Selecione um carro: ");
        panel.add(alugarCarro);
        JLabel setDia = new JLabel("Quantos dias deseja Alugar?");

        JButton btnA = new JButton("Alugar");

        JPanel panel2 = new JPanel();

        JLabel dev = new JLabel("Qual carro ira devolver? ");
        panel2.add(dev);
        comboBox2.setEditable(false);
        comboBox2.setSelectedItem(null);
        panel2.add(comboBox2);
        JLabel diasDev = new JLabel("Quantos dias ficou com o veiculo? ");
        panel2.add(diasDev);
        dias2 = new JTextField(10);
        panel2.add(dias2);
        JButton btnB = new JButton("Retornar");
        panel2.add(btnB);
        panel2.add(ret);

        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedItem().equals(carros[0])) {
                    double preco = 25.0;
                    double multa = 0.15;
                    String d = dias.getText();
                    double D = Double.parseDouble(d);
                    double aluguel = preco * D;
                    System.out.println(aluguel);
                    String f = String.valueOf(aluguel);

                    String info = "Placa AXC 234, Motor 1.6, Ano 1998";
                    String s = String.valueOf(preco);
                    String m = String.valueOf(multa);


                    value.setText("Valor do aluguel do carro (dia): " + s);
                    info1.setText("Informações do veiculo:  " + info);
                    multa1.setText("Porcentagem da multa por atraso (dia): " + m);
                    tAlugar.setText("Valor final se não atrasar: " + f);

                } else if (comboBox.getSelectedItem().equals(carros[1])) {
                    double preco = 40.0;
                    double multa = 0.15;
                    String d = dias.getText();
                    double D = Double.parseDouble(d);
                    double aluguel = preco * D;
                    System.out.println(aluguel);
                    String f = String.valueOf(aluguel);

                    String info = "Placa ABG 795, Motor 1.6, Ano 2012";
                    String s = String.valueOf(preco);
                    String m = String.valueOf(multa);


                    value.setText("Valor do aluguel do carro (dia): " + s);
                    info1.setText("Informações do veiculo:  " + info);
                    multa1.setText("Porcentagem da multa por atraso (dia): " + m);
                    tAlugar.setText("Valor final se não atrasar: " + f);

                } else if (comboBox.getSelectedItem().equals(carros[2])) {
                    double preco = 75.0;
                    double multa = 0.15;
                    String d = dias.getText();
                    double D = Double.parseDouble(d);
                    double aluguel = preco * D;
                    System.out.println(aluguel);
                    String f = String.valueOf(aluguel);

                    String info = "Placa PUB 419, Motor 1.6, Ano 2019";
                    String s = String.valueOf(preco);
                    String m = String.valueOf(multa);


                    value.setText("Valor do aluguel do carro (dia): " + s);
                    info1.setText("Informações do veiculo:  " + info);
                    multa1.setText("Porcentagem da multa por atraso (dia): " + m);
                    tAlugar.setText("Valor final se não atrasar: " + f);

                }else if(comboBox.getSelectedItem().equals(carros[3])){
                    double preco = 15.0;
                    double multa = 0.15;
                    String d = dias.getText();
                    double D = Double.parseDouble(d);
                    double aluguel = preco * D;
                    System.out.println(aluguel);
                    String f = String.valueOf(aluguel);

                    String info = "Placa UZA 966, Motor 1.0, Ano 1994";
                    String s = String.valueOf(preco);
                    String m = String.valueOf(multa);


                    value.setText("Valor do aluguel do carro (dia): " + s);
                    info1.setText("Informações do veiculo:  " + info);
                    multa1.setText("Porcentagem da multa por atraso (dia): " + m);
                    tAlugar.setText("Valor final se não atrasar: " + f);

                } else if(comboBox.getSelectedItem().equals(carros[4])){
                    double preco = 55.0;
                    double multa = 0.15;
                    String d = dias.getText();
                    double D = Double.parseDouble(d);
                    double aluguel = preco * D;
                    System.out.println(aluguel);
                    String f = String.valueOf(aluguel);

                    String info = "Placa TUX 825, Motor 1.8, Ano 2015";
                    String s = String.valueOf(preco);
                    String m = String.valueOf(multa);


                    value.setText("Valor do aluguel do carro (dia): " + s);
                    info1.setText("Informações do veiculo:  " + info);
                    multa1.setText("Porcentagem da multa por atraso (dia): " + m);
                    tAlugar.setText("Valor final se não atrasar: " + f);

                }

            }}); // Botao 1

        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dias2.getText().equals(dias.getText())){
                    ret.setText("Veiculo retornado com sucesso!");
                } else {
                    String s = dias2.getText();
                    double juro = Double.parseDouble(s);
                    double p = 0.15;
                    double sum = juro * p;
                    if(comboBox2.getSelectedItem().equals(carros[0])){
                        double preco = 25.0;
                        String b = dias.getText();
                        double c = Double.parseDouble(b);
                        double t = (c * preco) + (sum * preco);
                        String T = String.valueOf(t);
                        ret.setText("Devido ao atraso, novo valor de aluguel: " + T);

                    } else if (comboBox2.getSelectedItem().equals(carros[1])) {
                        double preco = 40.0;
                        String b = dias.getText();
                        double c = Double.parseDouble(b);
                        double t = (c * preco) + (sum * preco);
                        String T = String.valueOf(t);
                        ret.setText("Devido ao atraso, novo valor de aluguel: " + T);

                    } else if (comboBox2.getSelectedItem().equals(carros[2])){
                        double preco = 75.0;
                        String b = dias.getText();
                        double c = Double.parseDouble(b);
                        double t = (c * preco) + (sum * preco);
                        String T = String.valueOf(t);
                        ret.setText("Devido ao atraso, novo valor de aluguel: " + T);

                    } else if (comboBox2.getSelectedItem().equals(carros[3])) {
                        double preco = 15.0;
                        String b = dias.getText();
                        double c = Double.parseDouble(b);
                        double t = (c * preco) + (sum * preco);
                        String T = String.valueOf(t);
                        ret.setText("Devido ao atraso, novo valor de aluguel: " + T);

                    } else if (comboBox2.getSelectedItem().equals(carros[4])){
                        double preco = 55.0;
                        String b = dias.getText();
                        double c = Double.parseDouble(b);
                        double t = (c * preco) + (sum * preco);
                        String T = String.valueOf(t);
                        ret.setText("Devido ao atraso, novo valor de aluguel: " + T);
                    }
                }
            }
        }); //Botao 2

        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2 = new JFrame();
                JPanel panel3 = new JPanel();
                JLabel v = new JLabel("Novo veículo");
                panel3.add(v);
                JTextField t = new JTextField(10);
                panel3.add(t);
                JButton b = new JButton("Cadastrar");
                JLabel l = new JLabel("");
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String a = t.getText();
                        l.setText("Veiculo Casdastrado: " + a);
                    }
                });

                panel3.add(b);
                panel3.add(l);

                frame2.add(panel3);
                frame2.setSize(200, 150);
                frame2.setVisible(true);

            }
        });

        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fram3 = new JFrame();
                JPanel p3 = new JPanel();
                JLabel l = new JLabel("Por quantos dias deseja alugar um veiculo?");
                JTextField f = new JTextField(10);
                JLabel a = new JLabel("");
                JLabel b = new JLabel("");

                JButton btnC = new JButton("Calcular");
                btnC.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String getV = f.getText();
                        double setV = Double.parseDouble(getV);
                        double vMin = 15.0;
                        double vMax = 75.0;
                        double showMin = setV * vMin;
                        double showMax = setV * vMax;

                        String s = String.valueOf(showMin);
                        String x = String.valueOf(showMax);

                        a.setText("Valor minimo de Aluguel: " + s);
                        b.setText("Valor Maximo de Aluguel: " + x);
                    }
                });

                p3.add(l);
                p3.add(f);
                p3.add(btnC);
                p3.add(a);
                p3.add(b);
                fram3.add(p3);
                fram3.setSize(350, 150);
                fram3.setVisible(true);
            }
        });

        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f4 = new JFrame();
                JPanel p4 = new JPanel();

                String infos = "Fiat Cronos 2019, 1.6, placa PUB 491. \n" +
                        "Fiat Grand Siena 2015, 1.8, placa TUX 825. \n" +
                        "Fiat Siena 2012, 1.6, placa ABG 795. \n" +
                        "Fiat Marea 1998, 1.6, placa AXC 234. \n" +
                        "Fiat Premio 1994, 1.0, placa UZA 966.";
                JLabel lab = new JLabel("Veiculos:");
                JTextArea area = new JTextArea(infos, 5, 1);
                JButton btnD = new JButton("OK");
                btnD.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f4.dispose();

                    }
                });

                area.setEditable(false);

                p4.add(lab);
                p4.add(area);
                p4.add(btnD);
                f4.add(p4);
                f4.setVisible(true);
                f4.setSize(380, 220);


            }
        });

        item5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame f5 = new JFrame();
                JPanel p5 = new JPanel();
                JLabel p = new JLabel("");
                String search = JOptionPane.showInputDialog("Digite um modelo!");
                if (search.equals(carros[0])) {
                    p.setText("Veiculo Fiat" + carros[0] + " encontrado");
                } else if (search.equals(carros[1])){
                    p.setText("Veiculo Fiat " + carros[1] + " encontrado");
                } else if (search.equals(carros[2])){
                    p.setText("Veiculo Fiat " + carros[2] + " encontrado");
                } else if (search.equals(carros[3])){
                    p.setText("Veiculo Fiat " + carros[3] + " encontrado");
                } else if (search.equals(carros[4])){
                    p.setText("Veiculo Fiat " + carros[4] + " encontrado");
                } else {
                    p.setText("Veiculo não encontrado!");
                }

                p5.add(p);

                f5.add(p);
                f5.setSize(270,150);
                f5.setVisible(true);

            }
        });

        item7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        item6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value.setText("");
                info1.setText("");
                multa1.setText("");
                tAlugar.setText("");
                dias.setText("");
                dias2.setText("");
                ret.setText("");
                comboBox.setSelectedItem(null);
                comboBox2.setSelectedItem(null);
            }
        });


        comboBox.setEditable(false);
        comboBox.setSelectedItem(null);
        panel.add(comboBox);
        panel.add(setDia);
        panel.add(dias);
        panel.add(cor);
        panel.add(rb);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(btnA);
        panel.add(value);
        panel.add(info1);
        panel.add(multa1);
        panel.add(tAlugar);


        frame.setMenuBar(nMenu);
        nMenu.add(menu1);
        nMenu.add(menu2);
        nMenu.add(menu3);
        nMenu.add(menu4);
        menu1.add(item1);
        menu1.add(item2);
        menu2.add(item4);
        menu2.add(item5);
        menu3.add(item6);
        menu4.add(item7);


        abas.add("Alugar", panel);
        abas.add("Retornar", panel2);
        frame.add(abas);
        frame.setTitle("Locadora de Veiculos");
        frame.setVisible(true);
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}}
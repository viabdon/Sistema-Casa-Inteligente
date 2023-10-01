package com.odiadores;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    // Criando componentes do Java Swing e AWT
    private Color corDoFundo = new Color(130, 169, 124);
    private Color corComponentesFundo = new Color(124, 153, 169);
    private JFrame menuPrincipal = new JFrame("Sistema de Casa Inteligente");
    private JFrame menuSalaDeTV = new JFrame("Sala de TV");
    private JFrame menuSalaDeJantar = new JFrame("Sala de Jantar");
    private JFrame menuQuartoPrincipal = new JFrame("Quarto Principal");
    private JLabel boasVindas = new JLabel("Bem-vindo(a) ao Sistema de Casa Inteligente!");
    private JLabel arTexto = new JLabel("Ar Condicionado: ");
    private JLabel tvTexto = new JLabel("Televisão: ");
    private JLabel luzTexto1 = new JLabel("");
    private JLabel luzTexto2 = new JLabel("");
    private JLabel telTexto = new JLabel("Telefone Fixo: ");
    private JTextField input = new JTextField("(**) ****-****");
    private JButton botaoSalaDeTV = new JButton("Sala de TV");
    private JButton botaoVoltar = new JButton("<");
    private JButton botaoQuartoPrincipal = new JButton("Quarto Principal");
    private JButton botaoSalaDeJantar = new JButton("Sala de Jantar");
    private JButton alternarEstadoAr = new JButton("ON/OFF");
    private JButton aumentarTemp = new JButton("+Temp");
    private JButton diminuirTemp = new JButton("-Temp");
    private JButton alternarEstadoTV = new JButton("ON/OFF");
    private JButton aumentarVol = new JButton("+Vol");
    private JButton diminuirVol = new JButton("-Vol");
    private JButton passarCanal = new JButton("+CH");
    private JButton voltarCanal = new JButton("-CH");
    private JButton alternarEstadoLuz1 = new JButton("ON/OFF");
    private JButton alternarEstadoLuz2 = new JButton("ON/OFF");
    private JButton ligar = new JButton("Ligar");
    private String[] opcoesInclinacao = {"Diagonal", "Horizontal", "Vertical"};
    private String[] opcoesVento = {"Médio", "Fraco", "Forte"};
    private String[] opcoesBrilho = {"10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%"};
    private String[] opcoesCor = {"Branco", "Amarelo", "Azul", "Verde", "Vermelho", "Laranja"};
    private JComboBox<String> dropdownInclinacao = new JComboBox<>(opcoesInclinacao);
    private JComboBox<String> dropdownVento = new JComboBox<>(opcoesVento);
    private JComboBox<String> dropdownBrilho = new JComboBox<>(opcoesBrilho);
    private JComboBox<String> dropdownCor = new JComboBox<>(opcoesCor);
    private JComboBox<String> dropdownBrilho2 = new JComboBox<>(opcoesBrilho);
    private JComboBox<String> dropdownCor2 = new JComboBox<>(opcoesCor);
    private JPanel containerAr = new JPanel();
    private JPanel containerTV = new JPanel();
    private JPanel containerLuz1 = new JPanel();
    private JPanel containerLuz2 = new JPanel();
    private JPanel containerTel = new JPanel();

    public GUI() {
        // Configurando as Janelas
        menuPrincipal.setSize(500, 500);
        menuPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuPrincipal.setBackground(corDoFundo);
        menuPrincipal.setLayout(null);
        menuPrincipal.setVisible(true);     
        menuPrincipal.setLocation(435, 150);
        menuSalaDeTV.setSize(600, 500);
        menuSalaDeTV.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuSalaDeTV.setBackground(corDoFundo);
        menuSalaDeTV.setLayout(null);
        menuSalaDeTV.setVisible(false);     
        menuSalaDeTV.setLocation(385, 150);
        menuSalaDeJantar.setSize(600, 500);
        menuSalaDeJantar.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuSalaDeJantar.setBackground(corDoFundo);
        menuSalaDeJantar.setLayout(null);
        menuSalaDeJantar.setVisible(false);     
        menuSalaDeJantar.setLocation(385, 150);
        menuQuartoPrincipal.setSize(600, 500);
        menuQuartoPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuQuartoPrincipal.setBackground(corDoFundo);
        menuQuartoPrincipal.setLayout(null);
        menuQuartoPrincipal.setVisible(false);     
        menuQuartoPrincipal.setLocation(385, 150);

        // Configurando Labels
        boasVindas.setBounds(120, 20, 260, 20);

        // Configurando Botões e Eventos:
        // 1. Botões de dispositivos
        containerAr.setBounds(40, 50, 500, 50);
        containerAr.setBackground(corComponentesFundo);
        containerAr.add(arTexto);
        containerAr.add(alternarEstadoAr);
        containerAr.add(aumentarTemp);
        containerAr.add(diminuirTemp);
        containerAr.add(dropdownInclinacao);
        containerAr.add(dropdownVento);
        containerTV.setBounds(40, 90, 500, 50);
        containerTV.setBackground(corComponentesFundo);        
        containerTV.add(tvTexto);
        containerTV.add(alternarEstadoTV);
        containerTV.add(aumentarVol);
        containerTV.add(diminuirVol);
        containerTV.add(passarCanal);
        containerTV.add(voltarCanal);
        containerLuz1.setBounds(40, 130, 500, 50);
        containerLuz1.setBackground(corComponentesFundo);
        containerLuz1.add(luzTexto1);
        containerLuz1.add(alternarEstadoLuz1);
        containerLuz1.add(dropdownBrilho);
        containerLuz1.add(dropdownCor);
        containerLuz2.setBounds(40, 170, 500, 50);
        containerLuz2.setBackground(corComponentesFundo);
        containerLuz2.add(luzTexto2);
        containerLuz2.add(alternarEstadoLuz2);
        containerLuz2.add(dropdownBrilho2);
        containerLuz2.add(dropdownCor2);
        containerTel.setBounds(40, 210, 500, 50);
        containerTel.setBackground(corComponentesFundo);
        containerTel.add(telTexto);
        containerTel.add(input);
        containerTel.add(ligar);
        
        // 2. Botões do Menu e Painéis (com exceção do botaoVoltar)
        botaoVoltar.setBackground(corComponentesFundo);
        botaoVoltar.setBounds(10, 10, 45, 20);
        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (menuSalaDeTV.isVisible()) {
                    menuPrincipal.setVisible(true);
                    menuSalaDeTV.setVisible(false);
                }
                if (menuQuartoPrincipal.isVisible()) {
                    menuPrincipal.setVisible(true);
                    menuQuartoPrincipal.setVisible(false);
                }
                if (menuSalaDeJantar.isVisible()) {
                    menuPrincipal.setVisible(true);
                    menuSalaDeJantar.setVisible(false);
                }
            }
        });
        
        botaoSalaDeTV.setBounds(165, 80, 150, 20);
        botaoSalaDeTV.setBackground(corComponentesFundo);
        botaoSalaDeTV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuPrincipal.setVisible(false);
                menuSalaDeTV.setVisible(true);
                menuSalaDeTV.add(botaoVoltar);
                menuSalaDeTV.add(containerAr);
                menuSalaDeTV.add(containerTV);
                luzTexto1.setText("Luz RGB da Parede: ");
                luzTexto2.setText("Luz RGB do Teto: ");
                menuSalaDeTV.add(containerLuz1);
                menuSalaDeTV.add(containerLuz2);
                menuSalaDeTV.add(containerTel);
            }
        });

        botaoSalaDeJantar.setBounds(165, 120, 150, 20);
        botaoSalaDeJantar.setBackground(corComponentesFundo);
        botaoSalaDeJantar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuPrincipal.setVisible(false);
                menuSalaDeJantar.setVisible(true);
                menuSalaDeJantar.add(botaoVoltar);
                menuSalaDeJantar.add(containerLuz2);
                menuSalaDeJantar.add(containerAr);
            }
        });

        botaoQuartoPrincipal.setBounds(165, 160, 150, 20);
        botaoQuartoPrincipal.setBackground(corComponentesFundo);
        botaoQuartoPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuPrincipal.setVisible(false);
                menuQuartoPrincipal.setVisible(true);
                menuQuartoPrincipal.add(botaoVoltar);
                menuQuartoPrincipal.add(containerLuz2);
                menuQuartoPrincipal.add(containerLuz1);
                luzTexto1.setText("Luminária RGB: ");
                menuQuartoPrincipal.add(containerAr);
            }
        });
        //
        
        // Adicionando Botões às Janelas
        menuPrincipal.add(boasVindas);
        menuPrincipal.add(botaoSalaDeTV);
        menuPrincipal.add(botaoSalaDeJantar);
        menuPrincipal.add(botaoQuartoPrincipal);   
    }
}


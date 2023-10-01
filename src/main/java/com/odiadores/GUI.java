package com.odiadores;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Color corDoFundo = new Color(130, 169, 124);
    Color corBotaoFundo = new Color(124, 153, 169);
    JFrame menuPrincipal = new JFrame("Sistema de Casa Inteligente");
    JFrame menuSalaDeTV = new JFrame("Sala de TV");
    JFrame menuSalaDeJantar = new JFrame("Sala de Jantar");
    JFrame menuQuartoPrincipal = new JFrame("Quarto Principal");
    JLabel boasVindas = new JLabel("Bem-vindo(a) ao Sistema de Casa Inteligente!");
    JButton botaoSalaDeTV = new JButton("Sala de TV");
    JButton botaoVoltar = new JButton("<");
    JButton botaoQuartoPrincipal = new JButton("Quarto Principal");
    JButton botaoSalaDeJantar = new JButton("Sala de Jantar");

    public GUI() {
        menuPrincipal.setSize(500, 500);
        menuPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuPrincipal.setBackground(corDoFundo);
        menuPrincipal.setLayout(null);
        menuPrincipal.setVisible(true);     
        menuPrincipal.setLocation(435, 150);
        menuSalaDeTV.setSize(500, 500);
        menuSalaDeTV.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuSalaDeTV.setBackground(corDoFundo);
        menuSalaDeTV.setLayout(null);
        menuSalaDeTV.setVisible(false);     
        menuSalaDeTV.setLocation(435, 150);
        menuSalaDeJantar.setSize(500, 500);
        menuSalaDeJantar.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuSalaDeJantar.setBackground(corDoFundo);
        menuSalaDeJantar.setLayout(null);
        menuSalaDeJantar.setVisible(false);     
        menuSalaDeJantar.setLocation(435, 150);
        menuQuartoPrincipal.setSize(500, 500);
        menuQuartoPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuQuartoPrincipal.setBackground(corDoFundo);
        menuQuartoPrincipal.setLayout(null);
        menuQuartoPrincipal.setVisible(false);     
        menuQuartoPrincipal.setLocation(435, 150);

        boasVindas.setBounds(120, 20, 260, 20);

        botaoVoltar.setBackground(corBotaoFundo);
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
        botaoSalaDeTV.setBackground(corBotaoFundo);
        botaoSalaDeTV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuPrincipal.setVisible(false);
                menuSalaDeTV.setVisible(true);
                menuSalaDeTV.add(botaoVoltar);
            }
        });

        botaoSalaDeJantar.setBounds(165, 120, 150, 20);
        botaoSalaDeJantar.setBackground(corBotaoFundo);
        botaoSalaDeJantar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuPrincipal.setVisible(false);
                menuSalaDeJantar.setVisible(true);
                menuSalaDeJantar.add(botaoVoltar);
            }
        });

        botaoQuartoPrincipal.setBounds(165, 160, 150, 20);
        botaoQuartoPrincipal.setBackground(corBotaoFundo);
        botaoQuartoPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuPrincipal.setVisible(false);
                menuQuartoPrincipal.setVisible(true);
                menuQuartoPrincipal.add(botaoVoltar);
            }
        });
        
        menuPrincipal.add(boasVindas);
        menuPrincipal.add(botaoSalaDeTV);
        menuPrincipal.add(botaoSalaDeJantar);
        menuPrincipal.add(botaoQuartoPrincipal);     
    }
}


package com.odiadores;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.json.simple.parser.ParseException;

public class App extends GUI {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        // Criação de Objetos
        final DecodificadorTelefone telefoneFixo = new DecodificadorTelefone("Telefone da Sala de TV");
        telefoneFixo.setDefault();
        final ArCondicionado arSalaDeTV = new ArCondicionado("Ar Condicionado da Sala de TV");
        final Iluminacao ledRGB = new Iluminacao("Led da Parede da Sala de TV");
        final Iluminacao lampadaCentral = new Iluminacao("Lâmpada Central da Sala de TV");
        final Televisao tvSala = new Televisao("Televisão da Sala de TV");
        final Comodo salaDeTV = new Comodo("Sala de TV");
        salaDeTV.adicionarArCondicionado(arSalaDeTV);
        salaDeTV.adicionarTelevisao(tvSala);
        salaDeTV.adicionarIluminacao(ledRGB);
        salaDeTV.adicionarIluminacao(lampadaCentral);
        salaDeTV.adicionarFixo(telefoneFixo);
        final ArCondicionado arSalaDeJantar = new ArCondicionado("Ar Condicionado da Sala de Jantar");
        final Iluminacao lampadasPrincipais = new Iluminacao("Lâmpadas da Sala de Jantar");
        final Comodo salaDeJantar = new Comodo("Sala de Jantar");
        salaDeJantar.adicionarArCondicionado(arSalaDeJantar);
        salaDeJantar.adicionarIluminacao(lampadasPrincipais);
        final ArCondicionado arQuartoPrincipal = new ArCondicionado("Ar Condicionado do Quarto Principal");
        final Iluminacao lampadaQuartoPrincipal = new Iluminacao("Lâmpada do Quarto Principal");
        final Iluminacao luminariaQuartoPrincipal = new Iluminacao("Luminária do Quarto Principal");
        final Televisao tvQuartoPrincipal = new Televisao("Televisão do Quarto Principal");
        final Comodo quartoPrincipal = new Comodo("Quarto Principal");
        quartoPrincipal.adicionarArCondicionado(arQuartoPrincipal);
        quartoPrincipal.adicionarIluminacao(luminariaQuartoPrincipal);
        quartoPrincipal.adicionarIluminacao(lampadaQuartoPrincipal);
        quartoPrincipal.adicionarTelevisao(tvQuartoPrincipal);

        //Implementação das funcionalidades.
        //Ar Condicionado:
        alternarEstadoAr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(alternarEstadoAr) == getMenuSalaDeTV()) {
                    if (arSalaDeTV.isLigado()) {
                        arSalaDeTV.setLigado(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoAr), "Ar Condicionado Desligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        arSalaDeTV.setLigado(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoAr), "Ar Condicionado Ligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                if (SwingUtilities.getWindowAncestor(alternarEstadoAr) == getMenuSalaDeJantar()) {
                    if (arSalaDeJantar.isLigado()) {
                        arSalaDeJantar.setLigado(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoAr), "Ar Condicionado Desligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        arSalaDeJantar.setLigado(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoAr), "Ar Condicionado Ligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                if (SwingUtilities.getWindowAncestor(alternarEstadoAr) == getMenuQuartoPrincipal()) {
                    if (arQuartoPrincipal.isLigado()) {
                        arQuartoPrincipal.setLigado(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoAr), "Ar Condicionado Desligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        arQuartoPrincipal.setLigado(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoAr), "Ar Condicionado Ligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        aumentarTemp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(aumentarTemp) == getMenuSalaDeTV() && arSalaDeTV.isLigado() && arSalaDeTV.getTemperatura() < 30) {
                    arSalaDeTV.aumentarTemp();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(aumentarTemp), "Temperatura aumentada com sucesso. Temperatura atual: " + arSalaDeTV.getTemperatura(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(aumentarTemp) == getMenuSalaDeJantar() && arSalaDeJantar.isLigado() && arSalaDeJantar.getTemperatura() < 30) {
                    arSalaDeJantar.aumentarTemp();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(aumentarTemp), "Temperatura aumentada com sucesso. Temperatura atual: " + arSalaDeJantar.getTemperatura(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(aumentarTemp) == getMenuQuartoPrincipal() && arQuartoPrincipal.isLigado() && arQuartoPrincipal.getTemperatura() < 30) {
                    arQuartoPrincipal.aumentarTemp();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(aumentarTemp), "Temperatura aumentada com sucesso. Temperatura atual: " + arQuartoPrincipal.getTemperatura(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(aumentarTemp), "O ar condicionado está desligado ou a sua temperatura está no máximo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        diminuirTemp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(diminuirTemp) == getMenuSalaDeTV() && arSalaDeTV.isLigado() && arSalaDeTV.getTemperatura() > 14) {
                    arSalaDeTV.diminuirTemp();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirTemp), "Temperatura diminuída com sucesso. Temperatura atual: " + arSalaDeTV.getTemperatura(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(diminuirTemp) == getMenuSalaDeJantar() && arSalaDeJantar.isLigado() && arSalaDeJantar.getTemperatura() > 14) {
                    arSalaDeJantar.diminuirTemp();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirTemp), "Temperatura diminuída com sucesso. Temperatura atual: " + arSalaDeJantar.getTemperatura(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(diminuirTemp) == getMenuQuartoPrincipal() && arQuartoPrincipal.isLigado() && arQuartoPrincipal.getTemperatura() > 14) {
                    arQuartoPrincipal.diminuirTemp();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirTemp), "Temperatura diminuída com sucesso. Temperatura atual: " + arQuartoPrincipal.getTemperatura(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirTemp), "O ar condicionado está desligado ou a sua temperatura está no mínimo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        dropdownInclinacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(dropdownInclinacao) == getMenuSalaDeTV() && arSalaDeTV.isLigado()) {
                    arSalaDeTV.setInclinacaoPalheta(dropdownInclinacao.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownInclinacao), "Inclinação alterada. Inclinação atual da palheta: " + arSalaDeTV.getInclinacaoPalheta(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownInclinacao) == getMenuSalaDeJantar() && arSalaDeJantar.isLigado()) {
                    arSalaDeJantar.setInclinacaoPalheta(dropdownInclinacao.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownInclinacao), "Inclinação alterada. Inclinação atual da palheta: " + arSalaDeJantar.getInclinacaoPalheta(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownInclinacao) == getMenuQuartoPrincipal() && arQuartoPrincipal.isLigado()) {
                    arQuartoPrincipal.setInclinacaoPalheta(dropdownInclinacao.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownInclinacao), "Inclinação alterada. Inclinação atual da palheta: " + arQuartoPrincipal.getInclinacaoPalheta(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownInclinacao), "O Ar Condicionado está desligado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        dropdownVento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(dropdownVento) == getMenuSalaDeTV() && arSalaDeTV.isLigado()) {
                    arSalaDeTV.setPotenciaVento(dropdownVento.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownVento), "Potência do Vento alterada. Potência do Vento atual: " + arSalaDeTV.getPotenciaVento(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownVento) == getMenuSalaDeJantar() && arSalaDeJantar.isLigado()) {
                    arSalaDeJantar.setPotenciaVento(dropdownVento.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownVento), "Potência do Vento alterada. Potência do Vento atual: " + arSalaDeJantar.getPotenciaVento(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownVento) == getMenuQuartoPrincipal() && arQuartoPrincipal.isLigado()) {
                    arQuartoPrincipal.setPotenciaVento(dropdownVento.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownVento), "Potência do Vento alterada. Potência do Vento atual: " + arQuartoPrincipal.getPotenciaVento(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownInclinacao), "O Ar Condicionado está desligado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Televisão:
        
        alternarEstadoTV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(alternarEstadoTV) == getMenuSalaDeTV()) {
                    if (tvSala.isLigada()) {
                        tvSala.setLigada(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoTV), "Televisão Desligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        tvSala.setLigada(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoTV), "Televisão Ligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                if (SwingUtilities.getWindowAncestor(alternarEstadoTV) == getMenuQuartoPrincipal()) {
                    if (tvQuartoPrincipal.isLigada()) {
                        tvQuartoPrincipal.setLigada(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoTV), "Televisão Desligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        tvQuartoPrincipal.setLigada(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoTV), "Televisão Ligado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        aumentarVol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(aumentarVol) == getMenuSalaDeTV() && tvSala.isLigada() && tvSala.getVolume() < 100) {
                    tvSala.aumentarVol();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(aumentarVol), "Volume aumentado com sucesso. Volume atual: " + tvSala.getVolume(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(aumentarVol) == getMenuQuartoPrincipal() && tvQuartoPrincipal.isLigada() && tvQuartoPrincipal.getVolume() < 100) {
                    tvQuartoPrincipal.aumentarVol();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(aumentarVol), "Volume aumentado com sucesso. Volume atual: " + tvQuartoPrincipal.getVolume(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(aumentarVol), "A Televisão está desligada ou seu volume está no máximo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        diminuirVol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(diminuirVol) == getMenuSalaDeTV() && tvSala.isLigada() && tvSala.getVolume() > 0) {
                    tvSala.diminuirVol();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirVol), "Volume diminuído com sucesso. Volume atual: " + tvSala.getVolume(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(diminuirVol) == getMenuQuartoPrincipal() && tvQuartoPrincipal.isLigada() && tvQuartoPrincipal.getVolume() > 0) {
                    tvQuartoPrincipal.diminuirVol();
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirVol), "Volume diminuído com sucesso. Volume atual: " + tvQuartoPrincipal.getVolume(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirVol), "A Televisão está desligada ou seu volume está no mínimo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        inputCanal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(inputCanal) == getMenuSalaDeTV() && tvSala.isLigada()) {
                    tvSala.setCanal(inputCanal.getText());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirVol), "Canal trocado com sucesso. Canal atual: " + tvSala.getCanal(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(inputCanal) == getMenuQuartoPrincipal() && tvQuartoPrincipal.isLigada()) {
                    tvQuartoPrincipal.setCanal(inputCanal.getText());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirVol), "Canal trocado com sucesso. Canal atual: " + tvSala.getCanal(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(diminuirVol), "A televisão está desligada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        dropdownDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(dropdownDisplay) == getMenuSalaDeTV() && tvSala.isLigada()) {
                    tvSala.setDisplay(dropdownDisplay.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownDisplay), "Display Alterado. Exibindo: " + tvSala.getDisplay(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownDisplay) == getMenuQuartoPrincipal() && tvQuartoPrincipal.isLigada()) {
                   tvQuartoPrincipal.setDisplay(dropdownDisplay.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownDisplay), "Display Alterado. Exibindo: " + tvQuartoPrincipal.getDisplay(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho), "A Televisão está desligada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Iluminação

         alternarEstadoLuz1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(alternarEstadoLuz1) == getMenuSalaDeTV()) {
                    if (ledRGB.isLigada()) {
                        ledRGB.setLigada(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz1), "Luz Desligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        ledRGB.setLigada(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz1), "Luz Ligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                if (SwingUtilities.getWindowAncestor(alternarEstadoLuz1) == getMenuQuartoPrincipal()) {
                    if (luminariaQuartoPrincipal.isLigada()) {
                        luminariaQuartoPrincipal.setLigada(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz1), "Luz Desligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        luminariaQuartoPrincipal.setLigada(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz1), "Luz Ligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        alternarEstadoLuz2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(alternarEstadoLuz2) == getMenuSalaDeTV()) {
                    if (lampadaCentral.isLigada()) {
                        lampadaCentral.setLigada(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz2), "Luz Desligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        lampadaCentral.setLigada(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz2), "Luz Ligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                if (SwingUtilities.getWindowAncestor(alternarEstadoLuz2) == getMenuSalaDeJantar()) {
                    if (lampadasPrincipais.isLigada()) {
                        lampadasPrincipais.setLigada(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz2), "Luz Desligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        lampadasPrincipais.setLigada(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz2), "Luz Ligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                if (SwingUtilities.getWindowAncestor(alternarEstadoLuz2) == getMenuQuartoPrincipal()) {
                    if (lampadaQuartoPrincipal.isLigada()) {
                        lampadaQuartoPrincipal.setLigada(false);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz2), "Luz Desligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        lampadaQuartoPrincipal.setLigada(true);
                        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(alternarEstadoLuz2), "Luz Ligada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        dropdownBrilho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(dropdownBrilho) == getMenuSalaDeTV() && ledRGB.isLigada()) {
                    ledRGB.setBrilho(dropdownBrilho.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho), "Brilho alterado. Brilho atual: " + ledRGB.getBrilho(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownBrilho) == getMenuQuartoPrincipal() && luminariaQuartoPrincipal.isLigada()) {
                    luminariaQuartoPrincipal.setBrilho(dropdownBrilho.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho), "Brilho alterado. Brilho atual: " + luminariaQuartoPrincipal.getBrilho(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho), "A luz está desligada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        dropdownBrilho2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(dropdownBrilho2) == getMenuSalaDeTV() && lampadaCentral.isLigada()) {
                    lampadaCentral.setBrilho(dropdownBrilho2.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho2), "Brilho alterado. Brilho atual: " + lampadaCentral.getBrilho(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownBrilho2) == getMenuQuartoPrincipal() && lampadaQuartoPrincipal.isLigada()) {
                    lampadaQuartoPrincipal.setBrilho(dropdownBrilho2.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho2), "Brilho alterado. Brilho atual: " + lampadaQuartoPrincipal.getBrilho(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownBrilho2) == getMenuSalaDeJantar() && lampadasPrincipais.isLigada()) {
                    lampadasPrincipais.setBrilho(dropdownBrilho2.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho2), "Brilho alterado. Brilho atual: " + lampadasPrincipais.getBrilho(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownBrilho2), "A luz está desligada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


        dropdownCor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(dropdownCor) == getMenuSalaDeTV() && ledRGB.isLigada()) {
                    ledRGB.setBrilho(dropdownCor.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownCor), "Cor alterado. Cor atual: " + ledRGB.getCor(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownCor) == getMenuQuartoPrincipal() && luminariaQuartoPrincipal.isLigada()) {
                   luminariaQuartoPrincipal.setCor(dropdownCor.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownCor), "Cor alterado. Cor atual: " + luminariaQuartoPrincipal.getCor(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownCor), "A luz está desligada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        dropdownCor2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (SwingUtilities.getWindowAncestor(dropdownCor2) == getMenuSalaDeTV() && lampadaCentral.isLigada()) {
                    lampadaCentral.setBrilho(dropdownCor2.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownCor2), "Cor alterado. Cor atual: " + lampadaCentral.getCor(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownCor2) == getMenuQuartoPrincipal() && luminariaQuartoPrincipal.isLigada()) {
                    lampadaQuartoPrincipal.setCor(dropdownCor2.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownCor2), "Cor alterado. Cor atual: " + lampadaQuartoPrincipal.getCor(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else if (SwingUtilities.getWindowAncestor(dropdownCor2) == getMenuSalaDeJantar() && lampadasPrincipais.isLigada()) {
                    lampadasPrincipais.setCor(dropdownCor2.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownCor2), "Cor alterado. Cor atual: " + lampadasPrincipais.getCor(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(dropdownCor2), "A luz está desligada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Telefone

         ligar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (telefoneFixo.ligar(inputNumero.getText()) == null) {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(ligar), "Não foi encontrado um contato com este número.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(ligar), "Iniciando chamada com " + telefoneFixo.ligar(inputNumero.getText()), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
         });


        //Iniciando a GUI.
        new GUI();
    }
}

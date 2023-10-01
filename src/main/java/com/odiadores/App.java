package com.odiadores;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        DecodificadorTelefone telefoneFixo = new DecodificadorTelefone("Telefone da Sala de TV");
        telefoneFixo.setDefault();
        ArCondicionado arSalaDeTV = new ArCondicionado("Ar Condicionado da Sala de TV");
        Iluminacao ledRGB = new Iluminacao("Verde", "Led da Parede da Sala de TV");
        Iluminacao lampadaCentral = new Iluminacao("Branco", "Lâmpada Central da Sala de TV");
        Televisao tvSala = new Televisao("Televisão da Sala de TV");
        Comodo salaDeTV = new Comodo("Sala de TV");
        salaDeTV.adicionarArCondicionado(arSalaDeTV);
        salaDeTV.adicionarTelevisao(tvSala);
        salaDeTV.adicionarIluminacao(ledRGB);
        salaDeTV.adicionarIluminacao(lampadaCentral);
        salaDeTV.adicionarFixo(telefoneFixo);
        ArCondicionado arSalaDeJantar = new ArCondicionado("Ar Condicionado da Sala de Jantar");
        Iluminacao lampadasPrincipais = new Iluminacao("Amarelo", "Lâmpadas da Sala de Jantar");
        Comodo salaDeJantar = new Comodo("Sala de Jantar");
        salaDeJantar.adicionarArCondicionado(arSalaDeJantar);
        salaDeJantar.adicionarIluminacao(lampadasPrincipais);
        ArCondicionado arQuartoPrincipal = new ArCondicionado("Ar Condicionado do Quarto Principal");
        Iluminacao lampadaQuartoPrincipal = new Iluminacao("Branco", "Lâmpada do Quarto Principal");
        Iluminacao luminariaQuartoPrincipal = new Iluminacao("Amarelo", "Luminária do Quarto Principal");
        Televisao tvQuartoPrincipal = new Televisao("Televisão do Quarto Principal");
        Comodo quartoPrincipal = new Comodo("Quarto Principal");
        quartoPrincipal.adicionarArCondicionado(arQuartoPrincipal);
        quartoPrincipal.adicionarIluminacao(luminariaQuartoPrincipal);
        quartoPrincipal.adicionarIluminacao(lampadaQuartoPrincipal);
        quartoPrincipal.adicionarTelevisao(tvQuartoPrincipal);

        new GUI();
    }
}

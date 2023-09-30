package com.odiadores;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scText = new Scanner(System.in);
    public static ArrayList<Comodo> listaComodos = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        DecodificadorTelefone telefone1 = new DecodificadorTelefone("Telefone da Sala");
        telefone1.setDefault();
        ArCondicionado arCondicionado = new ArCondicionado("Ar Condicionado da Sala");
        Iluminacao ledRGB = new Iluminacao("Verde", "Led da Parede da Sala");
        Iluminacao lampadaCentral = new Iluminacao("Branco", "Lâmpada do Teto da Sala");
        Televisao tvSala = new Televisao("Televisão da Sala");
        Comodo salaDeTV = new Comodo("Sala de TV");
        salaDeTV.adicionarArCondicionado(arCondicionado);
        salaDeTV.adicionarTelevisao(tvSala);
        salaDeTV.adicionarIluminacao(ledRGB);
        salaDeTV.adicionarIluminacao(lampadaCentral);
        salaDeTV.adicionarFixo(telefone1);
        listaComodos.add(salaDeTV);
    }

    public void listarComodos() {
        System.out.println("Lista de cômodos: \n");
        for (Comodo comodo : listaComodos) {
            System.out.println(comodo.getNome() + "\n");
        }
    }

}

package com.odiadores;

import java.util.ArrayList;

public class Telefone {

    String nome;

    public Telefone(String nome) {
        this.nome = nome;
    }

    private ArrayList<Contato> listaContatos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void adicionarContato(Contato cont) {
        listaContatos.add(cont);
    }

    public void listarContatos() {
        for (Contato cont : listaContatos) {
            System.out.println(cont.imprimirDados());
        }
    }

    public String ligar(String numero) {
        for (Contato cont : listaContatos) {
            if (cont.getTelefone().equals(numero)) {
                return cont.getNome();
            }
        }
        return null;
    }
}

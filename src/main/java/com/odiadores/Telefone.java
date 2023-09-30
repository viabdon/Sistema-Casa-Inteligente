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

    public boolean ligar(String numero) {
        for (Contato cont : listaContatos) {
            if (cont.getTelefone().equals(numero)) {
                System.out.println("Iniciando chamada.");
                return true;
            }
        }
        System.out.println("Não foi encontrado um contato com esse número.");
        return false;
    }
}

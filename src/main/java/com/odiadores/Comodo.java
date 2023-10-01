package com.odiadores;

import java.util.ArrayList;

public class Comodo {
    private String nome;
    private ArrayList<Object> listaDispositivos = new ArrayList<>();

    public Comodo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarArCondicionado(ArCondicionado ar) {
        this.listaDispositivos.add(ar);
    }

    public void adicionarIluminacao(Iluminacao luz) {
        this.listaDispositivos.add(luz);
    }

    public void adicionarTelevisao(Televisao tv) {
        this.listaDispositivos.add(tv);
    }

    public void adicionarFixo(Telefone tel) {
        this.listaDispositivos.add(tel);
    }
}

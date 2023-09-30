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

    public String listarDispositivos() {
        String saida = "Neste cômodo existem estes disositivos:";
        for (int i = 0; i < listaDispositivos.size(); i++) {
            if (listaDispositivos.get(i) instanceof ArCondicionado) {
                ArCondicionado ar = (ArCondicionado) listaDispositivos.get(i);
                System.out.println("\n" + ar.getNome() + "\n");
            }
            if (listaDispositivos.get(i) instanceof Iluminacao) {
                Iluminacao iluminacao = (Iluminacao) listaDispositivos.get(i);
                System.out.println("\n" + iluminacao.getNome() + "\n");
            }
            if (listaDispositivos.get(i) instanceof Televisao) {
                Televisao tv = (Televisao) listaDispositivos.get(i);
                System.out.println("\n" + tv.getNome() + "\n");
            }
            if (listaDispositivos.get(i) instanceof Telefone) {
                Telefone tel = (Telefone) listaDispositivos.get(i);
                System.out.println("\n" + tel.getNome() + "\n");
            }
            if (i == listaDispositivos.size() - 1) {
                return saida;
            }
        }
        System.out.println("Não existem dispositivos inteligentes nesse cômodo.");
        return null;
    }
}

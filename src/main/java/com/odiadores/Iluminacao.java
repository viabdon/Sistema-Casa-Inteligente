package com.odiadores;

public class Iluminacao {
    private String nome;
    private boolean isLigada;
    private String cor;
    private String brilho;

    public Iluminacao(String nome) {
        this.nome = nome;
        this.isLigada = false;
        this.cor = "Branco";
        this.brilho = "10%";
    }

    public boolean isLigada() {
        return isLigada;
    }

    public void setLigada(boolean isLigada) {
        this.isLigada = isLigada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getBrilho() {
        return brilho;
    }

    public void setBrilho(String brilho) {
        this.brilho = brilho;
    }

    public String getNome() {
        return nome;
    }
}

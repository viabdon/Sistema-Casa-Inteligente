package com.odiadores;

public class Iluminacao {
    private boolean isLigada;
    private String cor;
    private int brilho;

    public Iluminacao(String cor) {
        this.isLigada = false;
        this.cor = cor;
        this.brilho = 50;
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

    public int getBrilho() {
        return brilho;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }
}

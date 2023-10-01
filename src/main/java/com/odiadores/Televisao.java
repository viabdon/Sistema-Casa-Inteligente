package com.odiadores;

public class Televisao {
    private boolean isLigada;
    private String display;
    private String canal;
    private int volume;
    private String nome;

    public Televisao(String nome) {
        this.nome = nome;
        this.isLigada = false;
        this.display = "Antena";
        this.canal = "14";
        this.volume = 25;
    }

    public boolean isLigada() {
        return isLigada;
    }

    public void setLigada(boolean isLigada) {
        this.isLigada = isLigada;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void aumentarVol() {
        this.setVolume(this.getVolume() + 1);
    }

    public void diminuirVol() {
        this.setVolume(this.getVolume() - 1);
    }
}

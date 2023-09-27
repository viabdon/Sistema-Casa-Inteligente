package com.odiadores;

public class Televisao {
    private boolean isLigada;
    private String display;
    private float canal;
    private int volume;

    public Televisao() {
        this.isLigada = false;
        this.display = "Antena";
        this.canal = 8.7f;
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

    public float getCanal() {
        return canal;
    }

    public void setCanal(float canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void imprimirDados() {
        System.out.println("Ligada? " + isLigada());
        System.out.println("Display: " + getDisplay());
        System.out.println("Canal: " + getCanal());
        System.out.println("Volume: " + getVolume());
    }
}

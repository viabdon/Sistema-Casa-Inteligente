package com.odiadores;

public class ArCondicionado {
    private boolean isLigado;
    private int temperatura;
    private int inclinacaoPalheta;
    private String potenciaVento;
    private String nome;

    public ArCondicionado(String nome) {
        this.nome = nome;
        this.isLigado = false;
        this.temperatura = 24;
        this.inclinacaoPalheta = 45;
        this.potenciaVento = "média";
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getInclinacaoPalheta() {
        return inclinacaoPalheta;
    }

    public void setInclinacaoPalheta(int inclinacaoPalheta) {
        this.inclinacaoPalheta = inclinacaoPalheta;
    }

    public String getPotenciaVento() {
        return potenciaVento;
    }

    public void setPotenciaVento(String potenciaVento) {
        this.potenciaVento = potenciaVento;
    }

    public void aumentarTemp() {
        this.setTemperatura(this.getTemperatura() + 1);
    }

    public void diminuirTemp() {
        this.setTemperatura(this.getTemperatura() - 1);
    }

    public String getNome() {
        return nome;
    }
}
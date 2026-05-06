package com.practica.genericas;

public class Hora {
    private int hora1;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora1 = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora1;
    }

    public void setHora1(int hora) {
        this.hora1 = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora1, minuto);
    }
}

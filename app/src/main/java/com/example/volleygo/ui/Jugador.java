package com.example.volleygo.ui;

public class Jugador {
    private String nombre;
    private int numeroCamiseta;
    private boolean esLibero = false;

    private boolean esCapitan = false;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean isEsLibero() {
        return esLibero;
    }

    public void setEsLibero(boolean esLibero) {
        this.esLibero = esLibero;
    }

    public boolean isEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }
}

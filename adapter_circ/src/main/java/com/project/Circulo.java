package com.project;

public class Circulo {
    private int raio;

    public Circulo(Quadrado quadrado) {
        this.raio = quadrado.getLado() / 2;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

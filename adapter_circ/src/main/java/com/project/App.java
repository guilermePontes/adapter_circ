package com.project;


public class App 
{
    public static void main( String[] args )
    {
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(quadrado);
        System.out.println(circulo.calculaArea());
    }
}

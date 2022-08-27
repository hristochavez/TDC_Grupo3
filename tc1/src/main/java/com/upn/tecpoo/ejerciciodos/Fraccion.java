package com.upn.tecpoo.ejerciciodos;

public class Fraccion {

    double numerador;
    double denominador;

    void Sumar() {
        double suma;
        suma = numerador + denominador;
        System.out.println("la suma es: " + suma);
    }

    void Restar() {
        double resta;
        resta = numerador - denominador;
        System.out.println("la resta es: " + resta);
    }

    void Dividir() {
        double division;
        division = numerador / denominador;
        System.out.println("la división es: " + division);
    }

    void Multiplicar() {
        double multiplicacion;
        multiplicacion = numerador * denominador;
        System.out.println("la multiplicación es: " + multiplicacion);
    }

    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion();
        fraccion1.numerador = 20;
        fraccion1.denominador = 10;

        fraccion1.Sumar();
        fraccion1.Restar();
        fraccion1.Dividir();
        fraccion1.Multiplicar();
    }

}
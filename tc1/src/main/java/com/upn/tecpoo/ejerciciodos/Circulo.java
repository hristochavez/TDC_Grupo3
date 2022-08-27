package com.upn.tecpoo.ejerciciodos;

public class Circulo {

    double radio;
    double diametro;

    void CalcularArea() {

        double area;
        area = radio * radio * 3.14;
        System.out.println("El area de un circulo con radio " + radio + " " + "es" + " " + area);
    }

    void CalcularPerimetro() {

        double perimetro;
        perimetro = diametro * 3.14;
        System.out.println("El perimetro de un circulo con diametro " + diametro + " " + "es" + " " + perimetro);

    }

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        circulo1.radio = 12;

        Circulo circulo2 = new Circulo();
        circulo2.diametro = 4;

        circulo1.CalcularArea();
        circulo2.CalcularPerimetro();

    }
}
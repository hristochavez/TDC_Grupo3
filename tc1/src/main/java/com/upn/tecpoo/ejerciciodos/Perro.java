package com.upn.tecpoo.ejerciciodos;

public class Perro {
    String raza;
    float peso;
    String color;

    void ObtenerAdop() {
        System.out.println("El perrito es de color:" + color + ",pesa:" + peso + ",su raza es:" + raza);
    }

    void obtenerPer() {
        System.out.println("adoptado");
    }

    public static void main(String[] args) {

        System.out.println("Se ADOPTA PERRITOS");
        Perro perr1 = new Perro();
        perr1.color = "negro";
        perr1.peso = 50;
        perr1.raza = "buldong";
        perr1.ObtenerAdop();
        perr1.obtenerPer();
    }
}

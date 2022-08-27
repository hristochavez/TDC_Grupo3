package com.upn.tecpoo.ejerciciodos;

public class Carro {
    String marca;
    float año;
    String modelo;

    void ObtenerCompra() {
        System.out.println("La  marca del carro es:" + marca + ",modelo es:" + modelo + ",del año:" + año);
    }

    void ObtenerCarro() {
        System.out.println("CARRO VENDIDO");
    }

    public static void main(String[] args) {

        System.out.println("BIENVENIDO A SU BUSQUEDA");
        Carro car1 = new Carro();
        car1.año = 2022;
        car1.marca = "Toyota";
        car1.modelo = "RAV4";
        car1.ObtenerCompra();
        car1.ObtenerCarro();
    }
}

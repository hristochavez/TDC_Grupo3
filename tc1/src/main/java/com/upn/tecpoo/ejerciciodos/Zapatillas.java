package com.upn.tecpoo.ejerciciodos;

public class Zapatillas {
    String marca;
    float talla;
    String color;
    String modelo;

    void ObtenerMarca() {
        System.out.println("Marca:" + marca + ", talla:" + talla + ",color:" + color);
    }

    void obtenerTal() {
        System.out.println("La talla es:" + talla);
    }

    public static void main(String[] args) {

        System.out.println("Bienvenido");
        Zapatillas zapt1 = new Zapatillas();
        zapt1.marca = "nike";
        zapt1.color = "rosadas";
        zapt1.modelo = "stra";
        zapt1.talla = 24;
        zapt1.ObtenerMarca();
        zapt1.obtenerTal();
    }
}

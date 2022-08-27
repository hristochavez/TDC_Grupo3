package com.upn.tecpoo.ejerciciodos;

public class Televisor {

  String marca;
  float tamaño;
  String color;

  void on() {
    System.out.println("Televisor encendido!");
  }

  void ObtenerMarca() {
    System.out.println(
        "El televisor es: " + marca + ", tamaño es de: " + tamaño + ", color: " + color);
  }

  void of() {
    System.out.println("Televisor apagado!");
  }

  public static void main(String[] args) {

    Televisor tel1 = new Televisor();
    tel1.on();
    tel1.marca = "Samsung";
    tel1.tamaño = 50;
    tel1.color = "plomo";
    tel1.ObtenerMarca();
    tel1.of();

  }
}

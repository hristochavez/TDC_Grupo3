package com.upn.tecpoo.ejerciciodos;

public class Monitor {

  // atributos
  String codigo;
  String marca;
  String modelo;
  String color;
  int resolucion;

  // metodos
  void on() {
    System.out.println("Monitor encendido!");
  }

  void showInfo() {
    System.out.println(
        "Tú codigo de monitor es: " + codigo + ", marca: " + marca + ", modelo: " + modelo + ", color: " + color
            + ", resolucion: " + resolucion + "px.");
  }

  void of() {
    System.out.println("Monitor apagado!");
  }

  public static void main(String[] args) {

    Monitor monitor1 = new Monitor();
    monitor1.on();
    monitor1.codigo = "M-0001";
    monitor1.marca = "LG";
    monitor1.modelo = "Oled Max";
    monitor1.color = "negro";
    monitor1.resolucion = 1040;
    monitor1.showInfo();
    monitor1.of();
  }
}

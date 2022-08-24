package com.upn.tecpoo.ejerciciodos;

import java.util.Scanner;

public class Celular {

  // atributos
  long imei;
  String marca;
  String modelo;
  double pulgadas;
  int ram;
  String procesador;

  // metodos
  void on() {
    System.out.println("Encendiendo...");
  }

  void showInfo() {
    System.out.println("Tu marca de telefono es: " + marca + ", modelo: " + modelo + ", pulgadas: " + pulgadas
        + "' , ram: " + ram + "gb, procesador: " + procesador + " y el imei es: " + imei);
  }

  void call(int number) {
    if (String.valueOf(number).length() == 9)
      System.out.println("Llamando a " + number);
    else
      System.out.println("Numero incorrecto");
  }

  void off() {
    System.out.println("Apagando...");
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Celular celu1 = new Celular();

    celu1.imei = 3596857896L;
    celu1.marca = "xiaomi";
    celu1.modelo = "redmi note 8 pro";
    celu1.pulgadas = 5.5;
    celu1.ram = 6;
    celu1.procesador = "mediatek";

    celu1.on();
    celu1.showInfo();
    // se solicita el celular
    System.out.println("Ingresa el celular: ");
    celu1.call(sc.nextInt());
    celu1.off();
  }
}

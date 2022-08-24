package com.upn.tecpoo.ejerciciodos;

import java.util.Scanner;

public class Motocicleta {

  // atributos
  String placa;
  String marca;
  String color;
  String modelo;

  // metodos
  void startUp() {
    System.out.println("Arranco la moto con placa: " + placa + ", marca: " + marca + ", modelo: " + modelo
        + " y color: " + color
        + ". Hace: Rum, Rum, Rum");
  }

  void brake() {
    System.out.println("Frenaste!!!");
  }

  void change(int numero) {
    if (numero > 5)
      System.out.println("Error, no hay ese cambio");
    else
      System.out.println("Ingresas al cambio: " + numero);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Motocicleta moto1 = new Motocicleta();

    moto1.placa = "6931-XA";
    moto1.marca = "ronco";
    moto1.modelo = "voltra 200";
    moto1.color = "negro";

    moto1.startUp();
    moto1.brake();
    // se solicita el cambio
    System.out.println("Ingrese su cambio:");
    moto1.change(sc.nextInt());
    sc.close();
  }
}

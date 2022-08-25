package com.upn.tecpoo.ejerciciodos;

public class Ave {

  // atributos
  String raza;
  String color;
  double tamaño;

  // metodos
  void fly() {
    System.out.println(
        "El ave de raza: " + raza + ", de color: " + color + " y tamaño: " + tamaño + "cm. ha comenzado a volar...");
  }

  void toLand() {
    System.out.println("El " + raza + " ha aterrizado!");
  }

  void squawk(int cant) {
    for (int i = 0; i < cant; i++)
      System.out.println("grrrrrr...");
  }

  public static void main(String[] args) {

    Ave ave1 = new Ave();
    ave1.raza = "aguila";
    ave1.color = "blanco con marron";
    ave1.tamaño = 150;
    ave1.fly();
    ave1.squawk(4);
    ave1.toLand();
  }
}

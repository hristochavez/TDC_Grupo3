package com.upn.tecpoo.ejerciciodos;

public class Curso {

  int codigo;
  String tipo;
  int creditos;
  int cantAlumnos;

  void HabilitarAulaPresencial() {

    if (cantAlumnos > 20 && tipo == "taller") {
      System.out.println("Este curso debe ser presencial");
    } else {
      System.out.println("virtual/remoto");
    }

  }

  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.cantAlumnos = 22;
    curso1.tipo = "Teoría";

    curso1.HabilitarAulaPresencial();
  }
}

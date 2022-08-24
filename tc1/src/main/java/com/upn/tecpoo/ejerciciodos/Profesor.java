package com.upn.tecpoo.ejerciciodos;

import java.util.Scanner;

public class Profesor {

  // atributos
  String codigo;
  String nombre;
  String curso;

  // metodos
  void present() {
    System.out.println(
        "Hola, mi codigo de profesor es: " + codigo + ", soy el profesor: " + nombre + " y dicto el curso de "
            + curso);
  }

  void teach(String clase) {
    System.out.println("Hoy les enseñare la clase de : " + clase);
  }

  void goodbye() {
    System.out.println("Hasta la siguiente clase, alumnos :)");
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Profesor prof1 = new Profesor();

    prof1.codigo = "N35698595";
    prof1.nombre = "Jose";
    prof1.curso = "java";

    prof1.present();
    // se solicita la clase:
    System.out.println("Ingrese el nombre de la clase:");
    prof1.teach(sc.nextLine());
    prof1.goodbye();
  }
}

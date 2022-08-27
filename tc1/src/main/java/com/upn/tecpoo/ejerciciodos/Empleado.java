package com.upn.tecpoo.ejerciciodos;

public class Empleado {

  int codigo;
  String nombre;
  double bono;
  double sueldo;
  int mesesTrabajados;
  int calificacion;

  void MostrarSueldo() {

    double sueldoNuevo;
    sueldoNuevo = sueldo + bono;
    System.out.println("El sueldo del trabajador: " + nombre + " " + "es" + " " + sueldoNuevo);
  }

  void LograrAscenso() {

    if (mesesTrabajados > 36 && calificacion >= 16) {
      System.out.println("Estás listo para ser ascendido");
    } else {
      System.out.println("Sigue esforzandote");
    }
  }

  public static void main(String[] args) {

    Empleado empleado1 = new Empleado();
    empleado1.nombre = "Luis Gonzales";
    empleado1.sueldo = 3000;
    empleado1.bono = 500;

    Empleado empleado2 = new Empleado();
    empleado2.mesesTrabajados = 40;
    empleado2.calificacion = 17;

    empleado1.MostrarSueldo();
    empleado2.LograrAscenso();

  }

}

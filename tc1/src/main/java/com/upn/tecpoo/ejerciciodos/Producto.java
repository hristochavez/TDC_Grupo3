package com.upn.tecpoo.ejerciciodos;

class Producto {

  int codigo;
  String nombre;
  String tipo;
  double precio;
  int cantidad;

  void Comprar() {

    double compra;
    compra = cantidad * precio;
    System.out.println("El monto de la compra es: " + compra);
  }

  void OtorgarDscto() {

    double descuento;

    if (tipo == "A") {
      descuento = 0.2 * precio;
    } else {
      descuento = 0.1 * precio;
    }
    System.out.println("El descuento de la compra es: " + descuento);

  }

}

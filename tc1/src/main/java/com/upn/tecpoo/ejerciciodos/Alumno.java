package com.upn.tecpoo.ejerciciodos;

public class Alumno {
    int codigo;
    float dni;
    int ciclo;
    String nombres;

    void on() {
        System.out.println("Entrando a clases");
    }

    void ObtenerCod() {
        System.out.println("el codigo del alumno es:" + codigo + " Nombre:" + nombres + ",el numero de dni es:" + dni);
    }

    void of() {
        System.out.println("clase cerrada");
    }

    public static void main(String[] args) {

        System.out.println("hola alumno");
        Alumno alumn = new Alumno();
        alumn.on();
        alumn.codigo = 23254;
        alumn.nombres = "jocy villegas";
        alumn.dni = 712589545;
        alumn.ciclo = 5;
        alumn.ObtenerCod();
        alumn.of();

    }
}

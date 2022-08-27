package com.upn.tecpoo.ejerciciodos;

public class Vendedor {
    
    String nombre;
    int cantVentas;
    int tiempoServicio;
    
    void obtenerBono()
    {
        if (cantVentas > 10) {
            System.out.println("Si tiene bono");
        } else {
            System.out.println("No tiene bono");
        }
    }
    
    void obtenerEstabilidad()
    {
        if (tiempoServicio > 3) {
            System.out.println("Si tiene estabilidad");
        } else {
            System.out.println("No tiene estabilidad");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("*****Resultados*****");
        Vendedor objvendedor = new Vendedor();
        objvendedor.nombre = "Rafael";
        objvendedor.cantVentas = 15;
        objvendedor.tiempoServicio = 2;
        objvendedor.obtenerBono();
        objvendedor.obtenerEstabilidad();
    }
}

package com.upn.tecpoo.ejerciciodos;

public class Refrigeradora {
    
    String marca;
    double tamaño;
    
    void hielera()
    {
        if (tamaño > 1) {
            System.out.println("Si tiene Hielera");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("*****Resultados*****");
        Refrigeradora objrefri = new Refrigeradora();
        objrefri.marca = "LG";
        objrefri.tamaño = 1.5;
        objrefri.hielera();
    }
    
}

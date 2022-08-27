package com.upn.tecpoo.ejerciciodos;

public class Calculadora {
    
    String marca;
    String tipo;
    
    void sumar(int x, int y)
    {
        int suma;
        suma = x + y;
        System.out.println("El resultado de la suma es " +suma);
    }
    
    void restar(int x, int y)
    {
        int resta;
        resta = x - y;
        System.out.println("El resultado de la resta es " +resta);
    }

    public static void main(String[] args)
    {
        System.out.println("*****Resultados*****");
        Calculadora objcalculadora = new Calculadora();
        objcalculadora.marca = "LG";
        objcalculadora.tipo = "Cientifica";
        objcalculadora.sumar(8, 5);
        objcalculadora.restar(8, 5);
    }
}

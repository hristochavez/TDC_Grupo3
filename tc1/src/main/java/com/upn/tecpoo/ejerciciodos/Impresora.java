package com.upn.tecpoo.ejerciciodos;

public class Impresora {
    
    String marca;
    String tipo;
    
    void imprimir()
    {
        System.out.println("Impresion exitosa");     
    }
    
    void fotocopiar()
    {
        System.out.println("Fotocopiado exitoso");
    }

    public static void main(String[] args)
    {
        System.out.println("*****Resultados*****");
        Impresora objimpresora = new Impresora();
        objimpresora.marca = "EPSON";
        objimpresora.tipo = "Funcional";
        objimpresora.imprimir();
        objimpresora.fotocopiar();    
    }
}
    

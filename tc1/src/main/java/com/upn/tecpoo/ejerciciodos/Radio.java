package com.upn.tecpoo.ejerciciodos;

public class Radio {
    
    String marca;
    int precio;
    
    void ponerMusica()
    {
        System.out.println("Volumen alto");     
    }
    
    void funcionBluetooth()
    {
        if (precio > 200) {
            System.out.println("Radio si cuenta con bluetooth");
        } else {
            System.out.println("Radio no cuenta con bluetooth");
        }
    }

    public static void main (String[] args)
    {
        System.out.println("*****Resultados*****");
        Radio objradio = new Radio();
        objradio.marca = "Samgung";
        objradio.precio = 150;
        objradio.ponerMusica();
        objradio.funcionBluetooth();
    }
}

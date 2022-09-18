package com.grupo3.sistemamarcacion.campania;

public class Campania
{
    private static int contador;
    private int id;
    private String nombre;

    public Campania(String nombre)
    {
        this.id = contador++;
        this.nombre = nombre;
    }

    public int obtenerId() { return this.id; }

    public String obtenerNombre() { return this.nombre; }
}

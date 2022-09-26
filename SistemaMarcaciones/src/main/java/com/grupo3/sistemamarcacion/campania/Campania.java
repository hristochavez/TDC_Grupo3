package com.grupo3.sistemamarcacion.campania;

public class Campania
{
    private int id;
    private String nombre;

    public Campania(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public int obtenerId() { return this.id; }

    public String obtenerNombre() { return this.nombre; }
}

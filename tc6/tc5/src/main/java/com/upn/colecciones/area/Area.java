package com.upn.colecciones.area;

public class Area
{
    private static int contador;
    private int id;
    private String nombre;
    private TipoArea tipoArea;

    public Area(String nombre, TipoArea tipoArea)
    {
        this.id = Area.contador++;
        this.nombre = nombre;
        this.tipoArea = tipoArea;
    }

    public String obtenerNombre() { return this.nombre; }
}

package com.grupo3.sistemamarcacion.area;

import com.grupo3.sistemamarcacion.campania.Campania;
import com.grupo3.sistemamarcacion.tipoarea.TipoArea;

public class Area
{
    private int id;
    private String nombre;
    private TipoArea tipo;
    private Campania campania;

    public Area(int id, String nombre, TipoArea tipoArea, Campania campania)
    {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipoArea;
        this.campania = campania;
    }

    public int obtenerId() { return this.id; }

    public String obtenerNombre() { return this.nombre; }

    public String obtenerArea() { return this.tipo.toString(); }

    public String obtenerCampania() { return this.campania.toString(); }
}

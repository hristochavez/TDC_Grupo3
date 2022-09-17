package com.upn.colecciones.campania;

import java.util.HashSet;
import java.util.Set;

import com.upn.colecciones.area.Area;

public class Campania
{
    private static int contador;
    private int id;
    private String nombre;
    private Set<Area> areas;

    public Campania(String nombre)
    {
        this.id = contador++;
        this.nombre = nombre;
        this.areas = new HashSet<>();
    }

    public void agregarArea(Area area) { areas.add(area); }

    public String obtenerNombre() { return this.nombre; }
}

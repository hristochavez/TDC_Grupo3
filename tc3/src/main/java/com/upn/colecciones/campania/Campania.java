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

    private String nombreCampania()
    {
        return this.nombre;
    }

    public void agregarArea(Area area)
    {
        this.areas.add(area);
    }

    private int cantAreas()
    {
        return this.areas.size();
    }

    public void informacionCampania()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("===============================================\n");
        sb.append("La campaña "+ this.nombreCampania());
        sb.append(" tiene " + this.cantAreas() + " áreas.");
        sb.append("\nCon un total de " + cantAsesores() + " asesores.");
        sb.append("\n===============================================");
        System.out.println(sb);
    }

    private int cantAsesores()
    {
        int cantAsesores = 0;
        for (Area area : areas)
        {
            cantAsesores = cantAsesores + area.cantAsesores();
        }
        return cantAsesores;
    }

}

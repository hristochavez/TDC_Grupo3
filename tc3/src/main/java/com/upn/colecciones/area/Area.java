package com.upn.colecciones.area;

import com.upn.colecciones.empleado.Asesor;
import com.upn.colecciones.empleado.Supervisor;
import java.util.HashSet;
import java.util.Set;

public class Area
{
    private static int contador;
    private int id;
    private String nombre;
    private Set<Asesor> asesores;
    private Supervisor supervisor;
    private TipoArea tipo;

    public Area(String nombre, TipoArea tipo)
    {
        this.id = Area.contador++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.asesores = new HashSet<>();
    }
}

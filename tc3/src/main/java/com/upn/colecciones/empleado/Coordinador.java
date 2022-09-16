package com.upn.colecciones.empleado;

import com.upn.colecciones.campania.Campania;

public class Coordinador extends Empleado
{
    private Campania campania;

    public Coordinador(String id, String nombre, String apePat, String apeMat, 
        Campania campania)
    {
        super(id, nombre, apePat, apeMat);
        this.campania = campania;
    }
}

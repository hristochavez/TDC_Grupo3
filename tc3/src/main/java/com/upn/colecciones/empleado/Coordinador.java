package com.upn.colecciones.empleado;

import com.upn.colecciones.campania.Campania;
import com.upn.colecciones.rol.Rol;

public class Coordinador extends Empleado
{
    private Campania campania;

    public Coordinador(String id, String nombre, String apePat, String apeMat, Campania campania, Rol rol)
    {
        super(id, nombre, apePat, apeMat, rol);
        this.campania = campania;
    }
}

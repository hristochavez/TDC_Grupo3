package com.upn.colecciones.empleado;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.rol.Rol;

public class Asesor extends Empleado
{
    private Area area;

    public Asesor(String id, String nombre, String apePat, String apeMat, 
        Area area, Rol rol)
    {
        super(id, nombre, apePat, apeMat);
        this.area = area;
    }
}

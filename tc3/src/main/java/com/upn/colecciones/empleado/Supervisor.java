package com.upn.colecciones.empleado;

import com.upn.colecciones.rol.Rol;

public class Supervisor extends Empleado
{
    public Supervisor(String id, String nombre, String apePat, String apeMat, Rol rol)
    {
        super(id, nombre, apePat, apeMat, rol);
    }
}


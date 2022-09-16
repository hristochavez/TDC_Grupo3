package com.upn.colecciones.empleado;

import com.upn.colecciones.rol.Rol;
import com.upn.colecciones.rol.SuperAdmin;

public class RRHH extends Empleado
{
    private SuperAdmin rol;

    public RRHH(String id, String nombre, String apePat, String apeMat, 
        SuperAdmin rol)
    {
        super(id, nombre, apePat, apeMat);
        this.rol = rol;
    }
}
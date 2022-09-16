package com.upn.colecciones.empleado;

import com.upn.colecciones.rol.Admin;

public class Supervisor extends Empleado
{
    private Admin rol;

    public Supervisor(String id, String nombre, String apePat, String apeMat, 
        Admin rol)
    {
        super(id, nombre, apePat, apeMat);
        this.rol = rol;
    }

    public void actualizarContrasenia(Empleado empleado)
    {
        this.rol.actualizarContrasenia(empleado);
    }
}

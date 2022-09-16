package com.upn.colecciones.rol;

import com.upn.colecciones.empleado.Empleado;

public class Supervisor extends Rol
{
    public Supervisor(String descripcion)
    {
        super(descripcion);
    }

    public static void actualizarContrasenia(Empleado empleado)
    {
        
    }

    @Override
    public String obtenerNombre() {
        return "Supervisor";
    }
}

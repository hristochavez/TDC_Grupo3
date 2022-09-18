package com.upn.colecciones.rol;

import com.upn.colecciones.empleado.Empleado;

public abstract class Rol
{
    protected String nombre;
    protected String descripcion; 

    public String obtenerNombre() { return this.nombre; }

    public String obtenerDescription() { return this.descripcion; }

    public void actualizarContrasenia(Empleado empleado, String contrasenia)
    {
        empleado.establecerContrasenia(contrasenia);
    }
}

package com.grupo3.sistemamarcacion.rol;

public class Admin extends Rol
{
    public Admin()
    {
        this.nombre = "Supervisor";
        this.descripcion = "Rol que solo puede cambiar "
            + "contraseñas de empleados";
    }
}

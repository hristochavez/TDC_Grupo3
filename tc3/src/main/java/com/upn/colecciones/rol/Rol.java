package com.upn.colecciones.rol;

public abstract class Rol
{
    protected String descripcion;

    public Rol(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public abstract String obtenerNombre();

    public String obtenerDescription()
    {
        return this.descripcion;
    }
}

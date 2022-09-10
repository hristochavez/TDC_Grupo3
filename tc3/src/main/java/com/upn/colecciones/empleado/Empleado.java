package com.upn.colecciones.empleado;

public abstract class Empleado
{
    protected String id;
    protected String contrasenia;
    protected String nombre;
    protected String apePat;
    protected String apeMat;

    public Empleado(String id, String nombre, String apePat, String apeMat)
    {
        this.id = id;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
    }
}

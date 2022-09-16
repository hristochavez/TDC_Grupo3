package com.upn.colecciones.empleado;

import java.time.LocalDateTime;
import com.upn.colecciones.marcacion.Marcacion;
import com.upn.colecciones.marcacion.TipoMarcacion;
import com.upn.colecciones.rol.Rol;

public abstract class Empleado
{
    protected String id;
    protected String contrasenia;
    protected String nombre;
    protected String apePat;
    protected String apeMat;
    protected Rol rol;

    public Empleado(String id, String nombre, String apePat, String apeMat, Rol rol)
    {
        this.id = id;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.rol = rol;
    }

    public void marcar(TipoMarcacion tipoMarcacion)
    {
        new Marcacion(this.id, LocalDateTime.now(), tipoMarcacion);
    }
}

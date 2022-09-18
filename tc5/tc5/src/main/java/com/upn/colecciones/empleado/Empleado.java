package com.upn.colecciones.empleado;

import java.time.LocalDateTime;

import com.upn.colecciones.horario.Horario;
import com.upn.colecciones.marcacion.Marcacion;
import com.upn.colecciones.marcacion.TipoMarcacion;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public abstract class Empleado
{
    protected String id;
    protected String contrasenia;
    protected String nombre;
    protected String apePat;
    protected String apeMat;
    protected TipoDocumento tipoDocumento;
    protected Horario horario;

    public Empleado(String id, String nombre, String apePat, String apeMat,
        TipoDocumento tipoDocumento, Horario horario)
    {
        this.id = id;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.tipoDocumento = tipoDocumento;
        this.horario = horario;
    }

    public void marcar(TipoMarcacion tipoMarcacion)
    {
        new Marcacion(this.id, LocalDateTime.now(), tipoMarcacion);
    }

    public String obtenerUsuario() { return this.id; }

    public String obtenerNombre() { return this.nombre; }

    public String obtenerApePat() { return this.apePat; }

    public String obtenerApeMat() { return this.apeMat; }

    public void establecerNombre(String nombre) { this.nombre = nombre; }
}

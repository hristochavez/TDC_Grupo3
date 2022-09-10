package com.upn.colecciones.empleado;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import com.upn.colecciones.marcacion.Marcacion;
import com.upn.colecciones.marcacion.TipoMarcacion;

public abstract class Empleado
{
    protected String id;
    protected String contrasenia;
    protected String nombre;
    protected String apePat;
    protected String apeMat;
    protected Set<Marcacion> marcaciones;

    public Empleado(String id, String nombre, String apePat, String apeMat)
    {
        this.id = id;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        marcaciones = new HashSet<>();
    }

    public void marcarEntJor()
    {
        Marcacion m = new Marcacion(this.id, LocalDateTime.now(), 
            TipoMarcacion.MARCACIONENTRADAJORNADA);

        this.agregarMarcaciones(m);
        
    }

    private void agregarMarcaciones(Marcacion m)
    {
        marcaciones.add(m);
    }
}

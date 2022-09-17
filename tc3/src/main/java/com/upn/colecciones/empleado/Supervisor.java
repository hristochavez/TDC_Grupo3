package com.upn.colecciones.empleado;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.horario.Horario;
import com.upn.colecciones.rol.Admin;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class Supervisor extends Empleado
{
    private Admin rol;
    private Area area;

    public Supervisor(String id, String nombre, String apePat, String apeMat, 
        TipoDocumento tipoDocumento, Horario horario, Admin rol, Area area)
    {
        super(id, nombre, apePat, apeMat, tipoDocumento, horario);
        this.rol = rol;
        this.area = area;
    }

    public String obtenerRol() { return this.rol.obtenerNombre(); }

    public void actualizarContrasenia(Empleado empleado)
    {
        this.rol.actualizarContrasenia(empleado);
    }

    public String obtenerArea() { return this.area.obtenerNombre(); }
}

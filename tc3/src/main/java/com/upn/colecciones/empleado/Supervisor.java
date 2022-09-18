package com.upn.colecciones.empleado;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.rol.Admin;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class Supervisor extends Empleado
{
    private Admin rol;
    private Area area;

    public Supervisor(String id, String nombre, String apePat, String apeMat, 
        TipoDocumento tipoDocumento, Admin rol, Area area)
    {
        super(id, nombre, apePat, apeMat, tipoDocumento);
        this.rol = rol;
        this.area = area;
    }

    public String obtenerRol() { return this.rol.obtenerNombre(); }

    public void actualizarContrasenia(Empleado empleado, String Contrasenia)
    {
        this.rol.actualizarContrasenia(empleado, Contrasenia);
    }

    public String obtenerAreaSupervisada() { return this.area.obtenerNombre(); }
}

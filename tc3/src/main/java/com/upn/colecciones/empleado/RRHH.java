package com.upn.colecciones.empleado;

import com.upn.colecciones.rol.SuperAdmin;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class RRHH extends Empleado
{
    private SuperAdmin rol;

    public RRHH(String id, String nombre, String apePat, String apeMat, 
    TipoDocumento tipoDocumento, SuperAdmin rol)
    {
        super(id, nombre, apePat, apeMat, tipoDocumento);
        this.rol = rol;
    }

    public String obtenerRol() { return this.rol.obtenerNombre(); }

    public void actualizarNombre(Empleado empleado, String nombre)
    { 
        this.rol.actualizarNombre(empleado, nombre);
    }
}

package com.upn.colecciones.rol;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.empleado.Empleado;
import com.upn.colecciones.empleado.RRHH;
import com.upn.colecciones.empleado.Supervisor;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class SuperAdmin extends Rol
{
    public SuperAdmin()
    {
        this.nombre = "RRHH";
        this.descripcion = "Rol que permite crear, borrar y "
            + "actualizar empleados";
    }

    public void crearEmpleado(String id, String nombre, String apePat, 
        String apeMat, TipoDocumento tipoDocumento, Rol rol, 
        Area area)
    {
        if (rol.obtenerNombre().equals("Supervisor")){
            new Supervisor(id, nombre, apePat, apeMat, tipoDocumento, 
                new Admin(), area);
        } else {
            new RRHH(id, nombre, apePat, apeMat, tipoDocumento, 
                new SuperAdmin());
        }
    }

    public void actualizarNombre(Empleado empleado, String nombre)
    {
        empleado.establecerNombre(nombre);
    }
}
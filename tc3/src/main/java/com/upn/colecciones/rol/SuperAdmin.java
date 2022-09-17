package com.upn.colecciones.rol;

import com.upn.colecciones.actualizadorcontrasenia.ActualizadorContrasenia;
import com.upn.colecciones.area.Area;
import com.upn.colecciones.empleado.Empleado;
import com.upn.colecciones.empleado.RRHH;
import com.upn.colecciones.empleado.Supervisor;
import com.upn.colecciones.horario.Horario;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class SuperAdmin extends Rol implements ActualizadorContrasenia
{
    private final static String NOMBRE = "RRHH";
    private final static String DESCRIPCION = "Rol que permite crear, borrar" +
     "y actualizar empleados.";

    @Override
    public String obtenerNombre() { return SuperAdmin.NOMBRE; }

    @Override
    public String obtenerDescription() { return SuperAdmin.DESCRIPCION; }
    
    public void actualizarContrasenia(Empleado empleado)
    {
        //Hace algo
    }

    public void crearEmpleado(String id, String nombre, String apePat, 
        String apeMat, TipoDocumento tipoDocumento, Horario horario, Rol rol, 
        Area area)
    {
        if (rol.obtenerNombre().equals("Supervisor")){
            new Supervisor(id, nombre, apePat, apeMat, tipoDocumento, horario, 
                new Admin(), area);
        } else {
            new RRHH(id, nombre, apePat, apeMat, tipoDocumento, horario, 
                new SuperAdmin());
        }
    }

    public void actualizarNombre(Empleado empleado, String nombre)
    {
        empleado.establecerNombre(nombre);
    }
}
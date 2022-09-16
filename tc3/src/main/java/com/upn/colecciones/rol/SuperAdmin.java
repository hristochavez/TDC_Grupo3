package com.upn.colecciones.rol;

import com.upn.colecciones.actualizadorcontrasenia.ActualizadorContrasenia;
import com.upn.colecciones.empleado.Empleado;
import com.upn.colecciones.empleado.RRHH;
import com.upn.colecciones.empleado.Supervisor;

public class SuperAdmin extends Rol implements ActualizadorContrasenia
{
    private final static String NOMBRE = "RRHH";
    private final static String DESCRIPCION = "Rol que permite crear, borrar" +
     "y actualizar empleados.";

    @Override
    public String obtenerRol() { return SuperAdmin.NOMBRE; }

    @Override
    public String obtenerDescription() { return SuperAdmin.DESCRIPCION; }
    
    public void actualizarContrasenia(Empleado empleado)
    {
        //Hace algo
    }

    public void crearEmpleado(String id, String nombre, String apePat, 
        String apeMat, Rol rol)
    {
        if (rol.obtenerRol().equals("Supervisor")){
            new Supervisor(id, nombre, apePat, apeMat, new Admin());
        } else {
            new RRHH(id, nombre, apePat, apeMat, new SuperAdmin());
        }
    }
}
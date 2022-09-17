package com.upn.colecciones.rol;

import com.upn.colecciones.actualizadorcontrasenia.ActualizadorContrasenia;
import com.upn.colecciones.empleado.Empleado;

public class Admin extends Rol implements ActualizadorContrasenia
{

    private final static String NOMBRE = "Supervisor";
    private final static String DESCRIPCION = "Rol que solo puede cambiar" + 
        "contraseñas de empleados";

    @Override
    public String obtenerNombre() { return Admin.NOMBRE; }

    @Override
    public String obtenerDescription() { return Admin.DESCRIPCION; }
    
    public void actualizarContrasenia(Empleado empleado)
    {
        //Hace algo
    }
}

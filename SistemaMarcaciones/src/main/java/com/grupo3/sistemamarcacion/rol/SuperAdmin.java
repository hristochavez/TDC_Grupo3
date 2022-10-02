package com.grupo3.sistemamarcacion.rol;

import com.grupo3.sistemamarcacion.area.Area;
import com.grupo3.sistemamarcacion.empleado.Empleado;
import com.grupo3.sistemamarcacion.empleado.RRHH;
import com.grupo3.sistemamarcacion.empleado.Supervisor;
import com.grupo3.sistemamarcacion.empleado.TipoEmpleado;
import com.grupo3.sistemamarcacion.tipodocumento.TipoDocumento;

public class SuperAdmin extends Rol {

    public SuperAdmin() {
        this.nombre = "RRHH";
        this.descripcion = "Rol que permite crear, borrar y "
                + "actualizar empleados";
    }

    public void crearEmpleado(String id, String nombre, String apePat,
            String apeMat, TipoDocumento tipoDocumento, Rol rol,
            Area area, TipoEmpleado tipoEmpleado) {
        if (rol.obtenerNombre().equals("Supervisor")) {
            new Supervisor(id, nombre, apePat, apeMat, tipoDocumento,
                    new Admin(), area, tipoEmpleado);
        } else {
            new RRHH(id, nombre, apePat, apeMat, tipoDocumento,
                    new SuperAdmin(), tipoEmpleado);
        }
    }

    public void actualizarNombre(Empleado empleado, String nombre) {
        empleado.establecerNombre(nombre);
    }
}

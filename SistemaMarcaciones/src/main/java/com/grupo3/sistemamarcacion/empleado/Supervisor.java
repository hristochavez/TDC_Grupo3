package com.grupo3.sistemamarcacion.empleado;

import com.grupo3.sistemamarcacion.area.Area;
import com.grupo3.sistemamarcacion.rol.Admin;
import com.grupo3.sistemamarcacion.tipodocumento.TipoDocumento;

public class Supervisor extends Empleado {

    private Admin rol;
    private Area area;

    public Supervisor(String id, String nombre, String apePat, String apeMat,
            TipoDocumento tipoDocumento, Admin rol, Area area, TipoEmpleado tipoEmpleado) {
        super(id, nombre, apePat, apeMat, tipoDocumento, tipoEmpleado
        );
        this.rol = rol;
        this.area = area;
    }

    public String obtenerRol() {
        return this.rol.obtenerNombre();
    }

    public void actualizarContrasenia(Empleado empleado, String Contrasenia) {
        this.rol.actualizarContrasenia(empleado, Contrasenia);
    }

    public String obtenerAreaSupervisada() {
        return this.area.obtenerNombre();
    }
}

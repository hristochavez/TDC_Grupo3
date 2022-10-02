package com.grupo3.sistemamarcacion.empleado;

import com.grupo3.sistemamarcacion.area.Area;
import com.grupo3.sistemamarcacion.tipodocumento.TipoDocumento;

public class Asesor extends Empleado {

    private Area area;

    public Asesor(String id, String nombre, String apePat, String apeMat,
            Area area, TipoDocumento tipoDocumento, TipoEmpleado tipoEmpleado) {
        super(id, nombre, apePat, apeMat, tipoDocumento, tipoEmpleado);
        this.area = area;
    }

    public String obtenerArea() {
        return this.area.obtenerNombre();
    }
}

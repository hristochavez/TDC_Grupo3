package com.upn.colecciones.empleado;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.horario.Horario;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class Asesor extends Empleado
{
    private Area area;

    public Asesor(String id, String nombre, String apePat, String apeMat, 
        Area area, TipoDocumento tipoDocumento, Horario horario)
    {
        super(id, nombre, apePat, apeMat, tipoDocumento, horario);
        this.area = area;
    }

    public String obtenerArea()
    {
        return this.area.obtenerNombre();
    }
}

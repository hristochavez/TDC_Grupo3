package com.upn.colecciones.empleado;

import com.upn.colecciones.area.Area;
import com.upn.colecciones.rol.Rol;

public class Asesor extends Empleado
{

    private Area area;

    public Asesor(String id, String nombre, String apePat, String apeMat, Area area, Rol rol)
    {
        super(id, nombre, apePat, apeMat, rol);
        this.area = area;
    }

    public String obtenerId()
    {
        return this.id;
    }

    public String infoAsesor()
    {
        String resumen;
        resumen = this.nombre +  " " + this.apePat + " " + this.apeMat;
        resumen = resumen.concat("\nDNI: " + this.id);
        return resumen;
    }

    public String infoAsesor(String id)
    {
        String resumen;
        resumen = this.nombre +  " " + this.apePat + " " + this.apeMat;
        resumen = resumen.concat("\nDNI: " + this.id);
        return resumen;
    }

}

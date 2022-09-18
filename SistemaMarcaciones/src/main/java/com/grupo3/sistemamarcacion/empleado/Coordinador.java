package com.grupo3.sistemamarcacion.empleado;

import com.grupo3.sistemamarcacion.campania.Campania;
import com.grupo3.sistemamarcacion.tipodocumento.TipoDocumento;

public class Coordinador extends Empleado
{
    private Campania campania;

    public Coordinador(String id, String nombre, String apePat, String apeMat, 
        Campania campania, TipoDocumento tipoDocumento)
    {
        super(id, nombre, apePat, apeMat, tipoDocumento);
        this.campania = campania;
    }

    public String obtenerCampania()
    {
        return this.campania.obtenerNombre();
    }
}

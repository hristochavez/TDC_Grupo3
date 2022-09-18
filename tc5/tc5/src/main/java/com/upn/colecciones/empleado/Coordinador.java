package com.upn.colecciones.empleado;

import com.upn.colecciones.campania.Campania;
import com.upn.colecciones.horario.Horario;
import com.upn.colecciones.tipodocumento.TipoDocumento;

public class Coordinador extends Empleado
{
    private Campania campania;

    public Coordinador(String id, String nombre, String apePat, String apeMat, 
        Campania campania, TipoDocumento tipoDocumento, Horario horario)
    {
        super(id, nombre, apePat, apeMat, tipoDocumento, horario);
        this.campania = campania;
    }

    public String obtenerCampania()
    {
        return this.campania.obtenerNombre();
    }
}

package com.grupo3.sistemamarcacion.marcacion;

import java.time.LocalDateTime;

import com.grupo3.sistemamarcacion.tipomarcacion.TipoMarcacion;

public class Marcacion {
    private String idEmpleado;
    private LocalDateTime fechaHora;
    private TipoMarcacion tipo;

    public Marcacion(String idEmpleado, LocalDateTime fechaHora, 
        TipoMarcacion tipo) {
        this.idEmpleado = idEmpleado;
        this.fechaHora = fechaHora;
        this.tipo = tipo;
    }
}

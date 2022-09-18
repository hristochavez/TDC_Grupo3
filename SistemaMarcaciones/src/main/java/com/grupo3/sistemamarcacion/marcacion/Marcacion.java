package com.grupo3.sistemamarcacion.marcacion;

import java.time.LocalDateTime;

import com.grupo3.sistemamarcacion.tipomarcacion.TipoMarcacion;

public class Marcacion {
    private int id;
    private static int contador;
    private String idEmpleado;
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;
    private int segundo;
    private TipoMarcacion tipo;

    public Marcacion(String id, LocalDateTime fechaHora, TipoMarcacion tipo)
    {
        this.id = Marcacion.contador++;
        this.dia = fechaHora.getDayOfMonth();
        this.mes = fechaHora.getMonthValue();
        this.anio = fechaHora.getYear();
        this.hora = fechaHora.getHour();
        this.minuto = fechaHora.getMinute();
        this.segundo = fechaHora.getSecond();
        this.idEmpleado = id;
        this.tipo = tipo;
    }
}

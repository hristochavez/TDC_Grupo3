package com.upn.colecciones.horario;

import java.time.LocalDateTime;

public class Horario
{
    private static int contador;
    private int id;
    private LocalDateTime entrada;
    private LocalDateTime salida;
    private int cantDiasLaborables;

    public Horario(LocalDateTime entrada, LocalDateTime salida, 
        int cantDiasLaborables)
    {
        this.id = Horario.contador++;
        this.entrada = entrada;
        this.salida = salida;
        this.cantDiasLaborables = cantDiasLaborables;
    }

    public double obtenerHorasSemanales()
    {
        return (this.salida.getHour() - this.entrada.getHour()) 
            * this.cantDiasLaborables;
    }
}

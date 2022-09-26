package com.grupo3.sistemamarcacion.tipomarcacion;

public enum TipoMarcacion
{
    MARCACIONENTRADAJORNADA("Marcación: Entrada jornada"),
    MARCACIONFINJORNADA("Marcación: Fin jornada"),
    MARCACIONENTRADABANIO("Marcación: Entrada baño"),
    MARCACIONFINBANIO("Marcación: Fin baño"),
    MARCACIONENTRADATOPICO("Marcación: Entrada tópico"),
    MARCACIONFINTOPICO("Marcación: Fin tópico"),
    MARCACIONENTRADALACTANCIA("Marcación: Entrada lactancia"),
    MARCACIONFINLACTANCIA("Marcación: Fin jornada");

    private String nombre;

    private TipoMarcacion(String nombre)
    {
        this.nombre = nombre;
    }
}

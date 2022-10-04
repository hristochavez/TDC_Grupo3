package com.grupo3.sistemamarcacion.tipomarcacion;

public enum TipoMarcacion
{
    MARCACIONENTRADAJORNADA(1, "Entrada jornada"),
    MARCACIONFINJORNADA(2, "Fin jornada"),
    MARCACIONENTRADABANIO(3, "Entrada baño"),
    MARCACIONFINBANIO(4, "Fin baño"),
    MARCACIONENTRADATOPICO(5, "Entrada tópico"),
    MARCACIONFINTOPICO(6, "Fin tópico"),
    MARCACIONENTRADALACTANCIA(7, "Entrada lactancia"),
    MARCACIONFINLACTANCIA(8, "Fin lactancia");

    private int id;
    private String nombre;

    private TipoMarcacion(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public int obtenerId() {
        return this.id;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public static TipoMarcacion obtenerTipoMarcacion(int id) {
        TipoMarcacion tm = null;
        for (TipoMarcacion tipMar : TipoMarcacion.values()) {
            if (tipMar.obtenerId() == id) {
                tm = tipMar;
            }
        }
        return tm;
    }

    public static TipoMarcacion obtenerTipoMarcacion(String nombre) {
        TipoMarcacion tm = null;
        for (TipoMarcacion tipMar : TipoMarcacion.values()) {
            if (tipMar.obtenerNombre().equals(nombre)) {
                tm = tipMar;
            }
        }
        return tm;
    }
}

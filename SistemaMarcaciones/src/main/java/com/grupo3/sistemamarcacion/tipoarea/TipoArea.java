package com.grupo3.sistemamarcacion.tipoarea;

public enum TipoArea {
    OPERACIONES(1, "OPERACIONES"),
    APOYO(2, "APOYO"),
    COMERCIAL(3, "COMERCIAL");

    private int id;
    private String nombre;

    private TipoArea(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public int obtenerId(){
        return this.id;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public static TipoArea obtenerTipoArea(int id){
        TipoArea ta = null;
        if (id == 1){
            ta = TipoArea.APOYO;
        } else if (id == 2) {
            ta = TipoArea.COMERCIAL;
        } else {
            ta = TipoArea.OPERACIONES;
        }
        return ta;
    }
}

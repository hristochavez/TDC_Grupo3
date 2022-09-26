package com.grupo3.sistemamarcacion.tipodocumento;

public enum TipoDocumento
{
    DNI(1,"DNI"),
    CARNEEXTRANJERIA(2, "CARNÉ EXTRANJERIA");

    private int id;
    private String nombre;

    private TipoDocumento(int id, String nombre)
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

    public static TipoDocumento obtenerTipoDocumento(int id){
        TipoDocumento tp = null;
        if (TipoDocumento.DNI.obtenerId() == id){
            tp = TipoDocumento.DNI;
        } else {
            tp = TipoDocumento.CARNEEXTRANJERIA;
        }
        return tp;
    }
}

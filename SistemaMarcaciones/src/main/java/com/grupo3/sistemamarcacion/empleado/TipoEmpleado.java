package com.grupo3.sistemamarcacion.empleado;

public enum TipoEmpleado
{
    ASESOR(1, "ASESOR"),
    COORDINADOR(2, "COORDINADOR"),
    SUPERVISOR(3, "SUPERVISOR"),
    RRHH(4, "RRHH");

    private int id;
    private String nombre;
    
    private TipoEmpleado(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public int obtenerId(){ return this.id; }

    public String obtenerNombre() { return this.nombre; }

    public static TipoEmpleado obtenerTipoEmpleado(int id){
        TipoEmpleado te = null;
        for (TipoEmpleado t : TipoEmpleado.values()) {
            if (t.obtenerId() == id){
                te = t;
                break;
            }
        }
        return te;
    }
}

package com.grupo3.sistemamarcacion.tipoempleado;

public enum TipoEmpleado {
    ASESOR(1, "ASESOR"),
    COORDINADOR(2, "COORDINADOR"),
    SUPERVISOR(3, "SUPERVISOR"),
    RRHH(4, "RRHH");

    private int id;
    private String nombre;

    private TipoEmpleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int obtenerId() {
        return this.id;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public static TipoEmpleado obtenerTipoEmpleado(int id) {
        TipoEmpleado tp = null;
        if (TipoEmpleado.ASESOR.obtenerId() == id) {
            tp = TipoEmpleado.ASESOR;
        } else if (TipoEmpleado.COORDINADOR.obtenerId() == id) {
            tp = TipoEmpleado.COORDINADOR;
        } else if (TipoEmpleado.SUPERVISOR.obtenerId() == id) {
            tp = TipoEmpleado.SUPERVISOR;
        } else {
            tp = TipoEmpleado.RRHH;
        }
        return tp;
    }
}

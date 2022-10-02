package com.grupo3.sistemamarcacion.empleado;

import java.time.LocalDateTime;
import com.grupo3.sistemamarcacion.marcacion.Marcacion;
import com.grupo3.sistemamarcacion.tipodocumento.TipoDocumento;
import com.grupo3.sistemamarcacion.tipomarcacion.TipoMarcacion;

public class Empleado {

    protected String id;
    protected String contrasenia;
    protected String nombre;
    protected String apePat;
    protected String apeMat;
    protected TipoDocumento tipoDocumento;
    protected TipoEmpleado tipoEmpleado;

    public Empleado(String id, String nombre, String apePat, String apeMat,
            TipoDocumento tipoDocumento, TipoEmpleado tipoEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.tipoDocumento = tipoDocumento;
        this.tipoEmpleado = tipoEmpleado;

    }

    public String obtenerTipoDocumento() {
        return this.tipoDocumento.obtenerNombre();
    }
    
    public String obtenerTipoEmpleado() {
        return this.tipoEmpleado.obtenerNombre();
    }

    public Empleado() {

    }

    public Empleado(String id, String contrasenia) {
        this.id = id;
        this.contrasenia = contrasenia;
    }

    public void marcar(TipoMarcacion tipoMarcacion) {
        new Marcacion(this.id, LocalDateTime.now(), tipoMarcacion);
    }

    public String obtenerUsuario() {
        return this.id;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerApePat() {
        return this.apePat;
    }

    public String obtenerApeMat() {
        return this.apeMat;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}

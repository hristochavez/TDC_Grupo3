package com.grupo3.sistemamarcacion.controladores;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Marcar {
    private String idEmpleado;
    private String fechaHora;
    private int idTipoMarcacion;
    private boolean exitoso;

    public Marcar(String idEmpleado, LocalDateTime fechaHora, 
        int idTipoMarcacion) {
        this.idEmpleado = idEmpleado;
        this.fechaHora = Marcar.formatearFechaHora(fechaHora);
        this.idTipoMarcacion = idTipoMarcacion;
    }

    public static String formatearFechaHora(LocalDateTime ldt) {                        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        return ldt.format(dtf);                                                 
    }

    private static String obtenerSP(){
        return "{CALL MARCAR(?, ?, ?)}";
    }

    public boolean ejecutar() {

        ConexionDBMySQL conexion = new ConexionDBMySQL();

        try {
            CallableStatement callStoPro;
            callStoPro = conexion.obtenerConexion()
                .prepareCall(Marcar.obtenerSP());

            callStoPro.setString(1, this.fechaHora);
            callStoPro.setString(2, this.idEmpleado);
            callStoPro.setInt(3, this.idTipoMarcacion);
            
            if (callStoPro.executeUpdate() == 1) {
                this.exitoso = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return this.exitoso;
    }
}

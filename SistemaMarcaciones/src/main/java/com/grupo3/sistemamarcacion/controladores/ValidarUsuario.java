package com.grupo3.sistemamarcacion.controladores;

import java.sql.CallableStatement;
import java.sql.SQLException;
public class ValidarUsuario
{
    private String id;
    private String contrasenia;
    private boolean existe;
    private String idEmpleado;
    private int idTipoEmpleado;

    public ValidarUsuario(String id, String contrasenia)
    {
        this.id = id;
        this.contrasenia = contrasenia;
    }

    private static String obternerSP()
    {
        return "{CALL CONFIRMAR_EXISTENCIA(?, ?, ?, ?)}";
    }
    
    public boolean iniciar()
    {
        ConexionDBMySQL conexion = new ConexionDBMySQL();

        try {
            CallableStatement callStoPro;
            callStoPro = conexion.obtenerConexion()
                .prepareCall(ValidarUsuario.obternerSP());

            callStoPro.setString(1, this.id);
            callStoPro.setString(2, this.contrasenia);
            callStoPro.registerOutParameter(3, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(4, java.sql.Types.INTEGER);
            callStoPro.execute();

            if (callStoPro.getString(3) != null)
            {
                this.existe = true;
                this.idEmpleado = callStoPro.getString(3);
                this.idTipoEmpleado = callStoPro.getInt(4);
            }

        } catch(SQLException e) {
            System.out.println(e);
        }

        conexion.cerrarConexion();
        return this.existe;
    }

    public String obtenerIdEmpleado()
    {
        return this.idEmpleado;
    }

    public int obtenerIdTipoEmpleado()
    {
        return this.idTipoEmpleado;
    }
}

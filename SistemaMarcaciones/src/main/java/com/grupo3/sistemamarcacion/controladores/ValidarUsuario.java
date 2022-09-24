package com.grupo3.sistemamarcacion.controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidarUsuario
{
    private String id;
    private String contrasenia;
    private boolean existe;
    private static String consulta;

    public ValidarUsuario(String id, String contrasenia)
    {
        this.id = id;
        this.contrasenia = contrasenia;
        ValidarUsuario.consulta = ValidarUsuario.construirConsulta();
    }

    private static String construirConsulta()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT");
        sb.append(" ID,");
        sb.append(" CONTRASENIA");
        sb.append(" FROM");
        sb.append(" EMPLEADOS");
        sb.append(" WHERE");
        sb.append(" ID = ? AND");
        sb.append(" CONTRASENIA = ?");

        return sb.toString();
    }
    
    public boolean iniciar()
    {
        ConexionDBMySQL conexion = new ConexionDBMySQL();
        this.existe = false;

        try {
            PreparedStatement preStat;
            preStat = conexion.obtenerConexion()
                .prepareStatement(ValidarUsuario.consulta);
            preStat.setString(1, this.id);
            preStat.setString(2, this.contrasenia);

            ResultSet resSet;
            resSet = preStat.executeQuery();
            this.existe = resSet.next();
        } catch(SQLException e) {
            System.out.println(e);
        }

        conexion.cerrarConexion();
        return this.existe;
    }
}

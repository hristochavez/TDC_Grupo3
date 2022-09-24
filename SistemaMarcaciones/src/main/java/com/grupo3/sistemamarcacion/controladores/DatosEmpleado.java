package com.grupo3.sistemamarcacion.controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.grupo3.sistemamarcacion.empleado.Empleado;

public class DatosEmpleado
{
    private String id;
    private Empleado empleado;
    private static String consulta;

    public DatosEmpleado(String id)
    {
        this.id = id;
        DatosEmpleado.consulta = DatosEmpleado.construirConsulta();
    }

    public Empleado obtenerEmpleado()
    {
        ConexionDBMySQL conexion = new ConexionDBMySQL();

        try {
            PreparedStatement preStat;
            preStat = conexion.obtenerConexion()
                .prepareStatement(DatosEmpleado.consulta);
            preStat.setString(1, this.id);

            ResultSet resSet;
            resSet = preStat.executeQuery();

            while(resSet.next())
            {
                empleado = new Empleado(resSet.getString(1), 
                    resSet.getString(2), resSet.getString(3), 
                    resSet.getString(4));
            }

        } catch(SQLException e) {
            System.out.println("Ocurrió un error: " + e);
        }

        conexion.cerrarConexion();
        return empleado;
    }

    private static String construirConsulta()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT");
        sb.append(" ID,");
        sb.append(" NOMBRE,");
        sb.append(" APEPAT,");
        sb.append(" APEMAT");
        sb.append(" FROM EMPLEADOS");
        sb.append(" WHERE ID = ?");

        return sb.toString();
    }
}

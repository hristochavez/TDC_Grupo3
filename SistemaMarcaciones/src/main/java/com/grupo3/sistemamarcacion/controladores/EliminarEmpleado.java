package com.grupo3.sistemamarcacion.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarEmpleado {

    private String id;

    public EliminarEmpleado(String id) {
        this.id = id;
    }

    public boolean eliminar() {
        try {
            Connection con = new ConexionDBMySQL().obtenerConexion();
            PreparedStatement sql = con.prepareStatement("delete from EMPLEADOS "
                    + " where ID =?;");
            sql.setString(1, this.id);
            int res = sql.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}

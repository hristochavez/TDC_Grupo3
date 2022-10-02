package com.grupo3.sistemamarcacion.controladores;

import com.grupo3.sistemamarcacion.empleado.Empleado;
import com.grupo3.sistemamarcacion.empleado.TipoEmpleado;
import com.grupo3.sistemamarcacion.tipodocumento.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BuscarEmpleado {

    private String id;

    public BuscarEmpleado(String id) {
        this.id = id;
    }

    public ArrayList<Empleado> buscar() {
        try {
            ArrayList<Empleado> lista = new ArrayList();
            Connection con = new ConexionDBMySQL().obtenerConexion();
            PreparedStatement sql = con.prepareStatement("select * "
                    + " from EMPLEADOS "
                    + " where ID = ?; ");
            sql.setString(1, this.id);
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                int idTipoDocumento = res.getInt("TIPODOCUMENTO");
                TipoDocumento td = TipoDocumento.obtenerTipoDocumento(idTipoDocumento);

                int idTipoEmpleado = res.getInt("TIPOEMPLEADO");
                TipoEmpleado te = TipoEmpleado.obtenerTipoEmpleado(idTipoEmpleado);

                Empleado p = new Empleado(
                        res.getString("ID"),
                        res.getString("NOMBRE"),
                        res.getString("APEPAT"),
                        res.getString("APEMAT"),
                        td,
                        te);

                lista.add(p);
            }
            return lista;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;

        }
    }
}

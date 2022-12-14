package com.grupo3.sistemamarcacion.controladores;

import java.sql.CallableStatement;
import java.sql.SQLException;
import com.grupo3.sistemamarcacion.area.Area;
import com.grupo3.sistemamarcacion.campania.Campania;
import com.grupo3.sistemamarcacion.empleado.Asesor;
import com.grupo3.sistemamarcacion.empleado.*;
import com.grupo3.sistemamarcacion.tipoarea.TipoArea;
import com.grupo3.sistemamarcacion.empleado.TipoEmpleado;
import com.grupo3.sistemamarcacion.tipodocumento.TipoDocumento;

public class InicioSesion {

    private String id;
    private int tipoEmpleado;
    private String sp;
    private Empleado empleado;

    public InicioSesion(String id, int tipoEmpleado) {
        this.id = id;
        this.tipoEmpleado = tipoEmpleado;
    }

    public Empleado obtenerEmpleado() {
        switch (this.tipoEmpleado) {
            case 1:
                this.sp = "{CALL OBTENER_ASESOR(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
                this.empleado = this.obtenerAsesor();
                break;
            case 2:
                this.sp = "{CALL OBTENER_COORDINADOR(?, ?, ?, ?, ?, ? , ?, ?)}";
                this.empleado = this.obtenerCoordinador();
                break;
            case 3:
                this.sp = "{CALL OBTENER_SUPERVISOR(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
                this.empleado = this.obtenerSupervisor();
                break;
            case 4:
                this.sp = "{CALL OBTENER_RRHH(?, ?, ?, ?, ?, ?)}";
                this.empleado = this.obtenerRRHH();
                break;
            default:
                break;
        }
        return this.empleado;
    }

    private Asesor obtenerAsesor() {
        ConexionDBMySQL conexion = new ConexionDBMySQL();
        Asesor asesor = null;
        try {
            CallableStatement callStoPro;
            callStoPro = conexion.obtenerConexion().prepareCall(this.sp);

            callStoPro.setString(1, this.id);
            callStoPro.registerOutParameter(2, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(3, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(3, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(4, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(5, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(6, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(7, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(8, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(9, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(10, java.sql.Types.VARCHAR);
            callStoPro.execute();

            //Atributos de clase Empleado
            String id = callStoPro.getString(2);
            String nombre = callStoPro.getString(3);
            String apePat = callStoPro.getString(4);
            String apeMat = callStoPro.getString(5);
            int idTipoDocumento = callStoPro.getInt(6);
            TipoDocumento tipoDocumento = TipoDocumento.obtenerTipoDocumento(idTipoDocumento);

            //Atributos de clase Compania
            int idCampania = callStoPro.getInt(9);
            String nombreCampania = callStoPro.getString(10);
            Campania campania = new Campania(idCampania, nombreCampania);

            //Atributos de clase Area
            int idArea = callStoPro.getInt(7);
            String nombreArea = callStoPro.getString(8);
            int idTipoArea = callStoPro.getInt(9);
            TipoArea tipoArea = TipoArea.obtenerTipoArea(idTipoArea);
            TipoEmpleado tipoEmpleadox = TipoEmpleado.obtenerTipoEmpleado(idTipoArea);
        
            Area area = new Area(idArea, nombreArea, tipoArea, campania);

            //Se instancia un Asesor
            asesor = new Asesor(id, nombre, apePat, apeMat, area, tipoDocumento,tipoEmpleadox);

        } catch (SQLException e) {
            System.out.println(e);
        }

        conexion.cerrarConexion();
        return asesor;
    }

    private Coordinador obtenerCoordinador() {
        ConexionDBMySQL conexion = new ConexionDBMySQL();
        Coordinador coordinador = null;
        try {
            CallableStatement callStoPro;
            callStoPro = conexion.obtenerConexion().prepareCall(this.sp);

            callStoPro.setString(1, this.id);
            callStoPro.registerOutParameter(2, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(3, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(4, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(5, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(6, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(7, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(8, java.sql.Types.VARCHAR);
            callStoPro.execute();
            
            //Atributos de clase Empleado
            String id = callStoPro.getString(2);
            System.out.println(id);
            String nombre = callStoPro.getString(3);
            String apePat = callStoPro.getString(4);
            String apeMat = callStoPro.getString(5);
            int idTipoDocumento = callStoPro.getInt(6);
            TipoDocumento tipoDocumento = 
                TipoDocumento.obtenerTipoDocumento(idTipoDocumento);

            //Atributos de clase Compania
            int idCampania = callStoPro.getInt(7);
            String nombreCampania = callStoPro.getString(8);
            Campania campania = new Campania(idCampania, nombreCampania);
            
            //Se instancia un coordinador
            coordinador = new Coordinador(id, nombre, apePat, apeMat, campania, 
                tipoDocumento, null);

        } catch(SQLException e) {
            System.out.println(e);
        }
        
        conexion.cerrarConexion();
        return coordinador;
    }

    private Supervisor obtenerSupervisor() {
        ConexionDBMySQL conexion = new ConexionDBMySQL();
        Supervisor supervisor = null;
        try {
            CallableStatement callStoPro;
            callStoPro = conexion.obtenerConexion().prepareCall(this.sp);

            callStoPro.setString(1, this.id);
            callStoPro.registerOutParameter(2, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(3, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(3, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(4, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(5, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(6, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(7, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(8, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(9, java.sql.Types.INTEGER);
            callStoPro.registerOutParameter(10, java.sql.Types.VARCHAR);
            callStoPro.execute();
            
            //Atributos de clase Empleado
            String id = callStoPro.getString(2);
            String nombre = callStoPro.getString(3);
            String apePat = callStoPro.getString(4);
            String apeMat = callStoPro.getString(5);
            int idTipoDocumento = callStoPro.getInt(6);
            TipoDocumento tipoDocumento = 
                TipoDocumento.obtenerTipoDocumento(idTipoDocumento);

            //Atributos de clase Compania
            int idCampania = callStoPro.getInt(9);
            String nombreCampania = callStoPro.getString(10);
            Campania campania = new Campania(idCampania, nombreCampania);

            //Atributos de clase Area
            int idArea = callStoPro.getInt(7);
            String nombreArea = callStoPro.getString(8);
            int idTipoArea = callStoPro.getInt(9);
            TipoArea tipoArea = TipoArea.obtenerTipoArea(idTipoArea);
            Area area = new Area(idArea, nombreArea, tipoArea, campania);

            //Se instancia un Supervisor
            supervisor = new Supervisor(id, nombre, apePat, apeMat, 
                tipoDocumento, null, area, null);

        } catch(SQLException e) {
            System.out.println(e);
        }
        
        conexion.cerrarConexion();
        return supervisor;
    }

    private RRHH obtenerRRHH() {
        ConexionDBMySQL conexion = new ConexionDBMySQL();
        RRHH rrhh = null;
        try {
            CallableStatement callStoPro;
            callStoPro = conexion.obtenerConexion().prepareCall(this.sp);

            callStoPro.setString(1, this.id);
            callStoPro.registerOutParameter(2, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(3, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(4, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(5, java.sql.Types.VARCHAR);
            callStoPro.registerOutParameter(6, java.sql.Types.INTEGER);
            callStoPro.execute();
            
            //Atributos de clase Empleado
            String id = callStoPro.getString(2);
            String nombre = callStoPro.getString(3);
            String apePat = callStoPro.getString(4);
            String apeMat = callStoPro.getString(5);
            int idTipoDocumento = callStoPro.getInt(6);
            TipoDocumento tipoDocumento = 
                TipoDocumento.obtenerTipoDocumento(idTipoDocumento);

            //Se instancia un RRHH
            rrhh = new RRHH(id, nombre, apePat, apeMat, 
                tipoDocumento, null, null);

        } catch(SQLException e) {
            System.out.println(e);
        }
        
        conexion.cerrarConexion();
        return rrhh;
    }
}

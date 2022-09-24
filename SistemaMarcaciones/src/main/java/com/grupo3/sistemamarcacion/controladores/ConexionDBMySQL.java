package com.grupo3.sistemamarcacion.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDBMySQL
{
    private Connection conexion;
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "mysqlRosmery2020$";
    private static final String DBNAME = "SISTMARCACION";
    private static final String HOST = "localhost";
    private static final String PUERTO = "3306";

    private static String crearURL()
    {
        return "jdbc:mysql://" + ConexionDBMySQL.HOST 
            + ":" + ConexionDBMySQL.PUERTO + "/" + ConexionDBMySQL.DBNAME;
    }

    public Connection obtenerConexion()
    {
        this.conexion = null;

        try {
            this.conexion = DriverManager.getConnection(ConexionDBMySQL.crearURL(), 
                ConexionDBMySQL.USUARIO, ConexionDBMySQL.CONTRASENIA);
        } catch (SQLException sqlException) {
            System.out.println("La conexión falló.");
        }
        
        return this.conexion;
    }

    public void cerrarConexion() { this.conexion = null; }
}
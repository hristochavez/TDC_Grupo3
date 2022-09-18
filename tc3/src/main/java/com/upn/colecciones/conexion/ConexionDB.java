package com.upn.colecciones.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB
{
    private static Connection conexion;
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "mysqlRosmery2020$";
    private static final String DBNAME = "sistmarcacion";
    private static final String HOST = "localhost";
    private static final String PUERTO = "3306";
    private static final String URL = "jdbc:mysql://" + ConexionDB.HOST 
        + ":" + ConexionDB.PUERTO + "/" + ConexionDB.DBNAME;

    private static void empezarConexionDB()
    {
        try
        {
            ConexionDB.conexion = DriverManager.getConnection(ConexionDB.URL, 
                ConexionDB.USUARIO, ConexionDB.CONTRASENIA);
        } catch (SQLException sqlException) {
            System.out.println("La conexión falló.");
        }
    }

    public static Connection obtenerConexion() { 
        ConexionDB.empezarConexionDB();
        return ConexionDB.conexion;
    }

    public void cerrarConexion() { ConexionDB.conexion = null; }
}
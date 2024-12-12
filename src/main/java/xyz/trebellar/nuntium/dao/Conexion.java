package xyz.trebellar.nuntium.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //private static final String URL = "jdbc:sqlserver://pon-crb.duckdns.org:1433";
    private static final String USUARIO = "sa";
    private static final String CONTRASINAL = "pass2Sopo";
    private static final String BASEDATOS = "nuntium";
    private static final String URL = "jdbc:sqlserver://pon-crb.duckdns.org:1433;database=" + BASEDATOS + ";user=" + USUARIO + ";password=" + CONTRASINAL + ";trustServerCertificate=true;";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL);
    }

}

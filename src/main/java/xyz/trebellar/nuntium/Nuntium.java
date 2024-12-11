
package xyz.trebellar.nuntium;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import xyz.trebellar.nuntium.dao.Conexion;


public class Nuntium {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {
            Connection conectar = Conexion.getConexion();
            System.out.println("Conexion OK ");
        } catch (SQLException ex) {
            Logger.getLogger(Nuntium.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error en la conexión con mssql \n" + ex.getMessage());
        }
        
        
    }
}

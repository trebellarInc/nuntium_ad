
package xyz.trebellar.nuntium;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import xyz.trebellar.nuntium.dao.Conexion;
import xyz.trebellar.nuntium.dao.PersonaDao;
import xyz.trebellar.nuntium.dao.PersonaDaoImp;
import xyz.trebellar.nuntium.modelo.Persona;

/**
 * Desde imac
 * @author nacho
 */
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
        
        PersonaDao pdao = new PersonaDao();
       
        
        Persona persona = new Persona("Nacho", "Limetre");
        
        
        pdao.insertar(persona);
        
        
        
    }
}

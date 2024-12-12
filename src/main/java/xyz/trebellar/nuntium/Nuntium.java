package xyz.trebellar.nuntium;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import xyz.trebellar.nuntium.dao.Conexion;
import xyz.trebellar.nuntium.dao.PersonaDao;
import xyz.trebellar.nuntium.dao.PersonaDaoImp;
import xyz.trebellar.nuntium.modelo.Persona;

/**
 * Desde imac
 *
 * @author nacho
 */
public class Nuntium {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {
            Connection conectar = Conexion.obtenerConexion();
            System.out.println("Conexion OK ");
        } catch (SQLException ex) {
            Logger.getLogger(Nuntium.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error en la conexión con mssql \n" + ex.getMessage());
        }
        
        PersonaDao pdao = new PersonaDao();
        
        List<Persona> listaPersonas = pdao.obtenerTodos();        
        for (Persona per : listaPersonas) {
            System.out.println(per.toString());
        }
        System.out.println("---------");
        
        Persona persona = new Persona("Iker", "Colomita", "Sevilla");
        persona.setId(9);

        //pdao.insertar(persona);
        pdao.modificar(persona);
        
        System.out.println(pdao.obtener(9).toString());
        
    }
}

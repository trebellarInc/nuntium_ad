package xyz.trebellar.nuntium.dao;

import java.util.List;
import xyz.trebellar.nuntium.modelo.Persona;

/**
 *
 * @author nacho
 */
public class PersonaDao implements PersonaDaoImp {

    @Override
    public void insertar(Persona generico) {

        System.out.println("Inserto desde PersonaDao");
       System.out.println(generico.toString());

    
       
       
    }

    @Override
    public Persona obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Persona generico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Persona> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

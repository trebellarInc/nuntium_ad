package xyz.trebellar.nuntium.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import xyz.trebellar.nuntium.modelo.Persona;

/**
 *
 * @author nacho
 */
public class PersonaDao implements PersonaDaoImp {

    @Override
    public void insertar(Persona persona) {

        System.out.println("Inserto desde PersonaDao");
        System.out.println(persona.toString());

        String sql = "INSERT INTO personas (nombre, apellido1, apellido2) VALUES (?, ?, ?)";

        try {
            Connection conex = Conexion.obtenerConexion();

            PreparedStatement stmt = conex.prepareStatement(sql);

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido1());
            stmt.setString(3, persona.getApellido2());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error en el inserto de la persona -> " + ex.getMessage());
        }

    }

    @Override
    public Persona obtener(int id) {
        Persona p = new Persona();

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT * FROM personas WHERE id = ?";

        try {
            Connection conex = Conexion.obtenerConexion();
            PreparedStatement stmt = conex.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido1(rs.getString("apellido1"));
                p.setApellido2(rs.getString("apellido2"));
            } else {
                p = null;
            }

        } catch (SQLException ex) {
            System.out.println("Error al leer la persona con id " + id + "-> " + ex.getMessage());
        }

        return p;
    }

    @Override
    public boolean eliminar(int id) {
        boolean fueBorrado = false;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "DELETE FROM personas WHERE id = ?";

        try {
            Connection conex = Conexion.obtenerConexion();
            PreparedStatement stmt = conex.prepareStatement(sql);
            stmt.setInt(1, id);

            if (stmt.executeUpdate() == 1) {
                fueBorrado = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error en el borrado de la persona -> " + ex.getMessage());
        }

        return fueBorrado;
    }

    @Override
    public boolean modificar(Persona generico) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean fueModificado = false;

        String sql = "UPDATE personas SET nombre = ?, apellido1 = ?, apellido2 = ? WHERE id = ?";

        try {
            Connection conex = Conexion.obtenerConexion();
            PreparedStatement stmt = conex.prepareStatement(sql);
            stmt.setString(1, generico.getNombre());
            stmt.setString(2, generico.getApellido1());
            stmt.setString(3, generico.getApellido2());
            stmt.setInt(4, generico.getId());

            if (stmt.executeUpdate() == 1) {
                fueModificado = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error en el modificado de la persona -> " + ex.getMessage());
        }

        return fueModificado;
    }

    @Override
    public List<Persona> obtenerTodos() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<Persona> personas = new ArrayList<>();
        String sql = "SELECT * FROM personas";

        try {
            Connection conex = Conexion.obtenerConexion();
            // PreparedStatement stmt = conex.prepareStatement(sql);
            Statement stmt = conex.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId(rs.getInt("id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido1(rs.getString("apellido1"));
                persona.setApellido2(rs.getString("apellido2"));
                personas.add(persona);
            }

        } catch (SQLException ex) {
            System.out.println("Error en el inserto de la persona -> " + ex.getMessage());
        }
        return personas;
    }

}

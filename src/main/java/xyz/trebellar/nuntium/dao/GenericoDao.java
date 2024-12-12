package xyz.trebellar.nuntium.dao;

import java.sql.SQLException;
import java.util.List;

// Insertar Eliminar Modificar Obtener
// Esto es la interface GenericoDao Generica
// Esto es la interface GenericoDao Especifica
public interface GenericoDao<T> {

    void insertar(T generico) throws SQLException;

    T obtener(int id) throws SQLException;

    boolean eliminar(int id) throws SQLException;

    boolean modificar(T generico) throws SQLException;

    List<T> obtenerTodos() throws SQLException;
}

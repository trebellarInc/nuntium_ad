package xyz.trebellar.nuntium.dao;

import java.util.List;

// Insertar Eliminar Modificar Obtener

// Esto es la interface GenericoDao Generica
// Esto es la interface GenericoDao Especifica
public interface GenericoDao<T> {

    void insertar(T generico);

    T obtener(int id);

    boolean eliminar(int id);

    boolean modificar(T generico);

    List<T> obtenerTodos();
}

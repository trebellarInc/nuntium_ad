package xyz.trebellar.nuntium.dao;

import java.util.List;

// Esto es la interface DAO Generica
// Esto es la interface DAO Especifica

public interface DAO<T> {
    void insertar(T generico);

    T leer(int id);

    boolean borrar(int id);

    boolean modificar(T generico);

    List<T> leerTodos();
}

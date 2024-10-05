package org.senai.dao;

import java.util.List;

public interface PessoaDAOInterface<T> {
    void insert(T pessoa);       // Método para inserir uma pessoa
    void update(T pessoa);       // Método para atualizar uma pessoa
    void delete(int id);         // Método para deletar uma pessoa pelo ID
    T getById(int id);           // Método para obter uma pessoa pelo ID
    List<T> getAll();            // Método para obter todas as pessoas
}

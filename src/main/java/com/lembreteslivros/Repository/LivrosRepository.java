package com.lembreteslivros.Repository;

import com.lembreteslivros.Model.ListaLivros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//Aqui eu defino as requisiçoes que serao feitas para o banco de dados e utilizados no package Controller

public interface LivrosRepository extends JpaRepository<ListaLivros, Integer> {
    @Query("select L from ListaLivros L order by L.id")
    List<ListaLivros> buscarTodos();
}

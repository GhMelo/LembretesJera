package com.lembreteslivros.Repository;

import com.lembreteslivros.Model.ListaLivros;
import com.lembreteslivros.Model.Repeticoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepeticoesRepository extends JpaRepository<Repeticoes, Integer> {

    @Query("select R from Repeticoes R order by R.id")
    List<Repeticoes> buscarTodos();

}

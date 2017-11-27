package com.lembreteslivros.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

//como estou criando um projeto springboot, acho mais facil usar uma sequencia de id's para gerenciar a lista de lembretes de livros que farei
//nessa parte, estancio o sequenciador de id's para o banco de dados, e a entidade que vai contar o nome e a data do livro

public class ListaLivros {
    @GeneratedValue(generator = "seq_livros")
    @SequenceGenerator(name = "seq_livros", sequenceName = "seq_livros")
    @Id

    private int id;
    private String nomeLivro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;



}

package com.lembreteslivros.Model;

import javax.persistence.*;

@Entity

//como estou criando um projeto springboot, acho mais facil usar uma sequencia de id's para gerenciar a lista de lembretes de livros que farei
//nessa parte, estancio o sequenciador de id's para o banco de dados, e a entidade que vai contar o nome e a data do livro

public class ListaLivros {
    @GeneratedValue(generator = "seq_livros")
    @SequenceGenerator(name = "seq_livros", sequenceName = "seq_livros")
    @Id


    private Integer id;


    @JoinColumn
    @ManyToOne
    private Repeticoes repeticoes;
    public Repeticoes getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Repeticoes repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Integer getTotalpaginas() {

        return totalpaginas;
    }

    public void setTotalpaginas(Integer totalpaginas) {
        this.totalpaginas = totalpaginas;
    }

    private Integer totalpaginas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String nome;
    private String data;
    public ListaLivros() {

    }

    public ListaLivros(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }



}

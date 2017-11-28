package com.lembreteslivros.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Repeticoes{
        @Id
        @SequenceGenerator(name ="seq_repeticoes", sequenceName = "seq_repeticoes")
        @GeneratedValue(generator = "seq_repeticoes")
        private Integer id;
        private String dias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
}

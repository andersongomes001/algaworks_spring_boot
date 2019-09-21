package com.anderson.gc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "convidados")
public class Convidados implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer totalDeConvidados;

    public Convidados() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTotalDeConvidados() {
        return totalDeConvidados;
    }

    public void setTotalDeConvidados(Integer totalDeConvidados) {
        this.totalDeConvidados = totalDeConvidados;
    }
}

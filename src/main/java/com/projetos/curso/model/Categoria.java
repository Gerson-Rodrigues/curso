package com.projetos.curso.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categoria", nullable = false)
    private String categoria;
    
}

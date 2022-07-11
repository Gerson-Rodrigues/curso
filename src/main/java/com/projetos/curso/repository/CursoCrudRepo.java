package com.projetos.curso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projetos.curso.model.Cursos;

@Repository
public interface CursoCrudRepo extends CrudRepository<Cursos, Integer>{
    
}

package com.projetos.curso.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetos.curso.model.Cursos;
import com.projetos.curso.repository.CursoJpaRepo;

@Service
public class CursoService {

    @Autowired
    CursoJpaRepo jpaRepo;

    @Transactional
    public void criar(Cursos cursos) {
        validaDt(cursos);
        jpaRepo.save(cursos);
    }

    private void validaDt(Cursos cursos) {
        if (cursos.getInicio().isAfter(cursos.getTermino())) {
            throw new RuntimeException();
        }
    }
    
}

package com.projetos.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projetos.curso.model.Cursos;
import com.projetos.curso.services.CursoService;

import io.swagger.annotations.ApiOperation;

public class CursosController {
    
    @Autowired
    private CursoService cService;

    //private static final String ENDPOINT = "/api/cursos";

    @ApiOperation("Criação de cursos")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> criar(@RequestBody Cursos cursos) {
        try {
            cService.criar(cursos);
            return ResponseEntity.status(HttpStatus.CREATED)
            .body("Cadastrado co sucesso!!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Não foi possivel cadastrar Curso!!");
        }
    }
}

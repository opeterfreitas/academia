package com.opeterfreitas.academia.controller;

import com.opeterfreitas.academia.entity.Aluno;
import com.opeterfreitas.academia.entity.AvaliacaoFisica;
import com.opeterfreitas.academia.entity.form.AlunoForm;
import com.opeterfreitas.academia.service.impl.AlunoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoServiceImpl alunoService;

    public AlunoController(AlunoServiceImpl alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> getAll(){

        return alunoService.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm alunoForm){
        return alunoService.create(alunoForm);

    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return alunoService.getAllAvaliacaoFisicaId(id);
    }

}
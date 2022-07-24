package com.opeterfreitas.academia.controller;

import com.opeterfreitas.academia.entity.Matricula;
import com.opeterfreitas.academia.entity.form.MatriculaForm;
import com.opeterfreitas.academia.service.impl.MatriculaServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private MatriculaServiceImpl matriculaService;

    public MatriculaController(MatriculaServiceImpl matriculaService) {
        this.matriculaService = matriculaService;
    }

    @PostMapping
    public Matricula create(@RequestBody @Valid MatriculaForm matriculaForm){
        return matriculaService.create(matriculaForm);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return matriculaService.getAll();
    }

}
package com.opeterfreitas.academia.controller;

import com.opeterfreitas.academia.entity.AvaliacaoFisica;
import com.opeterfreitas.academia.entity.form.AvaliacaoFisicaForm;
import com.opeterfreitas.academia.service.impl.AvaliacaoFisicaImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    private AvaliacaoFisicaImpl avaliacaoFisicaImpl;

    public AvaliacaoFisicaController(AvaliacaoFisicaImpl avaliacaoFisicaImpl) {
        this.avaliacaoFisicaImpl = avaliacaoFisicaImpl;
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody @Valid AvaliacaoFisicaForm avaliacaoFisicaForm) {
        return avaliacaoFisicaImpl.create(avaliacaoFisicaForm);

    }
}
package com.opeterfreitas.academia.service.impl;

import com.opeterfreitas.academia.entity.Matricula;
import com.opeterfreitas.academia.entity.form.MatriculaForm;
import com.opeterfreitas.academia.repository.MatriculaRepository;
import com.opeterfreitas.academia.service.IMatriculaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    private MatriculaRepository matriculaRepository;

    public MatriculaServiceImpl(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}

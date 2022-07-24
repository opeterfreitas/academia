package com.opeterfreitas.academia.service.impl;

import com.opeterfreitas.academia.entity.Aluno;
import com.opeterfreitas.academia.entity.AvaliacaoFisica;
import com.opeterfreitas.academia.entity.form.AvaliacaoFisicaForm;
import com.opeterfreitas.academia.entity.form.AvaliacaoFisicaUpdateForm;
import com.opeterfreitas.academia.repository.AlunoRepository;
import com.opeterfreitas.academia.repository.AvaliacaoFisicaRepository;
import com.opeterfreitas.academia.service.IAvaliacaoFisicaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaImpl implements IAvaliacaoFisicaService {

    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
    private AlunoRepository alunoRepository;

    public AvaliacaoFisicaImpl(AvaliacaoFisicaRepository avaliacaoFisicaRepository, AlunoRepository alunoRepository) {
        this.avaliacaoFisicaRepository = avaliacaoFisicaRepository;
        this.alunoRepository = alunoRepository;
    }

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm avaliacaoFisicaForm) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(avaliacaoFisicaForm.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(avaliacaoFisicaForm.getPeso());
        avaliacaoFisica.setAltura(avaliacaoFisicaForm.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

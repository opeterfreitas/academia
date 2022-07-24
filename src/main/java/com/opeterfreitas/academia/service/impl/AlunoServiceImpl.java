package com.opeterfreitas.academia.service.impl;

import com.opeterfreitas.academia.entity.Aluno;
import com.opeterfreitas.academia.entity.AvaliacaoFisica;
import com.opeterfreitas.academia.entity.form.AlunoForm;
import com.opeterfreitas.academia.entity.form.AlunoUpdateForm;
import com.opeterfreitas.academia.repository.AlunoRepository;
import com.opeterfreitas.academia.service.IAlunoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {


    private AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Aluno create(AlunoForm alunoForm) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoForm.getNome());
        aluno.setCpf(alunoForm.getCpf());
        aluno.setBairro(alunoForm.getBairro());
        aluno.setDataDeNascimento(alunoForm.getDataDeNascimento());
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacoes();
    }

}

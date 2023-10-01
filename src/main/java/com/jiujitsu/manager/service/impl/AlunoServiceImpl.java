package com.jiujitsu.manager.service.impl;

import com.jiujitsu.manager.model.Aluno;
import com.jiujitsu.manager.repository.AlunoRepository;
import com.jiujitsu.manager.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Iterable<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno buscarPorId(String id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.get();
    }

    @Override
    public void inserir(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @Override
    public void atualizar(String id, Aluno aluno) {
        Optional<Aluno> alunoBD = alunoRepository.findById(id);
        if(alunoBD.isPresent()) alunoRepository.save(aluno);
    }

    @Override
    public void deletarPorId(String id) {
        alunoRepository.deleteById(id);

    }
}

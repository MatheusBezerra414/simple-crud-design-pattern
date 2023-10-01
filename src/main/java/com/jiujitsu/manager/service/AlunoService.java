package com.jiujitsu.manager.service;

import com.jiujitsu.manager.model.Aluno;

public interface AlunoService {
    Iterable<Aluno> buscarTodos();
    Aluno buscarPorId(String id);
    void inserir(Aluno aluno);
    void atualizar(String id, Aluno aluno);
    void deletarPorId(String id);
}

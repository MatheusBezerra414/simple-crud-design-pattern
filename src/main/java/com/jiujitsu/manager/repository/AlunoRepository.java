package com.jiujitsu.manager.repository;

import com.jiujitsu.manager.model.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno,String> {
}

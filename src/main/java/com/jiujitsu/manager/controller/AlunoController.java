package com.jiujitsu.manager.controller;

import com.jiujitsu.manager.model.Aluno;
import com.jiujitsu.manager.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;

    @GetMapping
    public ResponseEntity<Iterable<Aluno>> buscarTodos(){
        return ResponseEntity.ok(alunoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarPorID(@PathVariable String id){
        return ResponseEntity.ok(alunoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Aluno> inserir(@RequestBody Aluno aluno){
        alunoService.inserir(aluno);
        return ResponseEntity.ok(aluno);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable String id, @RequestBody Aluno aluno){
        alunoService.atualizar(id, aluno);
        return ResponseEntity.ok(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Aluno> delete(@PathVariable String id){
        alunoService.deletarPorId(id);
        return ResponseEntity.ok().build();
    }
}

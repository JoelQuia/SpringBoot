package com.example.demo.restservices;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@RestController
@RequestMapping("/api/v1")
public class Alunos {

    @Autowired
    Validator validator;

    @GetMapping("/alunos/listar")
    public List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Joel", 18, "494.929.268-93"));
        alunos.add(new Aluno("Khia", 19, "494.929.268-93"));
        alunos.add(new Aluno("Bagriel", 15, "494.929.268-93"));
        return alunos;
    }

    @PostMapping("/alunos/inserir")
    public Aluno inserirAluno (@RequestBody Aluno aluno) {
        Set<ConstraintViolation<Aluno>> validate = validator.validate(aluno);
        System.out.println("Aluno inserido: " + aluno);
        return aluno;
    }

}

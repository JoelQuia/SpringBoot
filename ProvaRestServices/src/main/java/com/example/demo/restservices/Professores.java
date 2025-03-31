package com.example.demo.restservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Professor;

import jakarta.validation.Valid;

@RequestMapping("/api/v1")
@RestController
public class Professores {

    @GetMapping("/professores/listar")
    public List<Professor> getProfessores() {
        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor("Mauricio", 47, "238.182.593-10"));
        professores.add(new Professor("Clayton", 35, "849.829.174-28"));
        professores.add(new Professor("Ana Paula", 29, "495.383.282-93"));
        return professores;
    }

    @PostMapping("/alunos/inserir")
    public Professor inserirAluno(@RequestBody @Valid Professor professor) {
        System.out.println("Professor inserido: " + professor);
        return professor;
    }

}

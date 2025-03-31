package com.example.demo.restservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;

import jakarta.validation.Valid;

@RequestMapping("/api/v1")
@RestController
public class Alunos {

    @GetMapping("/alunos/listar")
    public List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Joel", 18, "494.929.268-93"));
        alunos.add(new Aluno("Khia", 19, "302.198.485-34"));
        alunos.add(new Aluno("Bagriel", 15, "645.232.874-12"));
        return alunos;
    }

    @PostMapping("/alunos/inserir")
    public Aluno inserirAluno(@RequestBody @Valid Aluno aluno) {
        System.out.println("Aluno inserido: " + aluno);
        return aluno;
    }

}

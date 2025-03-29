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

import com.example.demo.model.Professor;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@RequestMapping("/api/v1")
@RestController
public class Professores {

    
 



    @Autowired
    Validator validator;

    @GetMapping("/alunos/listar")
    public List<Professor> getProfessores() {
        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor("Joel", 18, "494.929.268-93"));
        professores.add(new Professor("Khia", 19, "494.929.268-93"));
        professores.add(new Professor("Bagriel", 15, "494.929.268-93"));
        return professores;
    }

    @PostMapping("/alunos/inserir")
    public Professor inserirAluno (@RequestBody Professor professor) {
        Set<ConstraintViolation<Professor>> validate = validator.validate(professor);
        System.out.println("Aluno inserido: " + professor);
        return professor;
    }

}




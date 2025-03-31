package com.example.demo.restservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.Pessoa;
import com.example.demo.model.Aluno;
import com.example.demo.model.Professor;

import jakarta.validation.Valid;

@RequestMapping("/api/v1")
@RestController
public class Pessoas {

    @GetMapping("/pessoas/listar")
    public List<Pessoa> getPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Professor("Mauricio", 47, "238.182.593-10"));
        pessoas.add(new Professor("Clayton", 35, "849.829.174-28"));
        pessoas.add(new Professor("Ana Paula", 29, "495.383.282-93"));
        pessoas.add(new Aluno("Joel", 18, "494.929.268-93"));
        pessoas.add(new Aluno("Khia", 19, "302.198.485-34"));
        pessoas.add(new Aluno("Bagriel", 15, "645.232.874-12"));
        return pessoas;
    }

    @PostMapping("/pessoas/inserir")
    public Pessoa inserirPessoa(@RequestBody @Valid Pessoa pessoa) {
        System.out.println("Pessoa inserida: " + pessoa);
        return pessoa;
    }

    @PutMapping("/pessoas/atualizar")
    public Pessoa atualizarPessoa(@RequestBody @Valid Pessoa pessoa) {
        System.out.println("Pessoa atualizada: " + pessoa);
        return pessoa;
    }
}

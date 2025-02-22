package br.com.khia.catracas_spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/v1/aluno")

public class AlunoController {

    @RequestMapping("/get")
    public String getAluno(@RequestParam String Nome){
        return " Olá Aluno"  + Nome;
    }

    @GetMapping("/get/{id}")
    public String getMethodName(@PathVariable(value="id")String param) {
        return "id pra pegar o usuario foi "  + param;
    }


}

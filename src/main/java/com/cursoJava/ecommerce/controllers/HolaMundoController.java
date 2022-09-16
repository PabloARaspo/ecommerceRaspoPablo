package com.eivsoftware.CursoJavaClase09.controllers;

import com.eivsoftware.CursoJavaClase09.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    private static final String template = "Hello, %s";

    @GetMapping("/hola")
    public String greeting() {
        System.out.println("Mandando fruta!");
        return "Hola Mundo!";
    }

    @GetMapping("/animal")
    public Animal animal() {
        return new Animal("Pedro", 10, true);
    }
}

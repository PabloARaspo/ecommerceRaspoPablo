package com.eivsoftware.CursoJavaClase09.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Animal {
    private final String nombre;
    private final Integer edad;
    private final Boolean esPadre;

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Boolean getEsPadre() {
        return esPadre;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", esPadre=" + esPadre +
                '}';
    }

    public Animal(String nombre, Integer edad, Boolean esPadre) {
        this.nombre = nombre;
        this.edad = edad;
        this.esPadre = esPadre;
    }
}

package com.biblioteca.model;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }
    public Libro buscarLibro(String titulo) {

    for (Libro libro : libros) {

        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
            return libro;
        }
    }

    return null;
}
}
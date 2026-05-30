package com.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.biblioteca.model.Biblioteca;
import com.biblioteca.model.Libro;
import com.biblioteca.singleton.BibliotecaSingleton;

public class BibliotecaTest {

    @Test
    void prestarLibro() {
        Libro libro = new Libro("Harry Potter");

        libro.prestar();

        assertTrue(libro.isPrestado());
    }

    @Test
    void devolverLibro() {
        Libro libro = new Libro("Harry Potter");

        libro.prestar();
        libro.devolver();

        assertFalse(libro.isPrestado());
    }

    @Test
    void agregarLibroABiblioteca() {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("Harry Potter");

        biblioteca.agregarLibro(libro);

        assertEquals(1, biblioteca.getLibros().size());
    }

    @Test
    void buscarLibroPorTitulo() {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("Harry Potter");

        biblioteca.agregarLibro(libro);

        Libro encontrado = biblioteca.buscarLibro("Harry Potter");

        assertNotNull(encontrado);
    }

    @Test
    void singletonDevuelveSiempreLaMismaInstancia() {
        Biblioteca b1 = BibliotecaSingleton.getInstancia();
        Biblioteca b2 = BibliotecaSingleton.getInstancia();

        assertSame(b1, b2);
    }
}
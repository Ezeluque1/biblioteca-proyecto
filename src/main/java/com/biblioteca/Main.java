package com.biblioteca;

import com.biblioteca.model.Biblioteca;
import com.biblioteca.model.Libro;
import com.biblioteca.singleton.BibliotecaSingleton;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblio = BibliotecaSingleton.getInstancia();

        biblio.agregarLibro(new Libro("Harry Potter"));
        biblio.agregarLibro(new Libro("El Señor de los Anillos"));

        System.out.println("Lista de libros:");

        for (Libro l : biblio.getLibros()) {
            System.out.println(l.getTitulo());
        }

        System.out.println();

        Libro encontrado = biblio.buscarLibro("Harry Potter");

        if (encontrado != null) {
            System.out.println("Libro encontrado: " + encontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}
package com.biblioteca;
import  com.biblioteca.model.Biblioteca;
import com.biblioteca.model.Libro;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca();

        biblio.agregarLibro(new Libro("Harry Potter"));
        biblio.agregarLibro(new Libro("El Señor de los Anillos"));

        for (Libro l : biblio.getLibros()) {
            System.out.println(l.getTitulo());
        }
    }
}
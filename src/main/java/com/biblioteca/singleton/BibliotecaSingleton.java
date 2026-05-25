package com.biblioteca.singleton;

import com.biblioteca.model.Biblioteca;

public class BibliotecaSingleton {

    private static Biblioteca instancia;

    private BibliotecaSingleton() {
    }

    public static Biblioteca getInstancia() {

        if (instancia == null) {
            instancia = new Biblioteca();
        }

        return instancia;
    }
}
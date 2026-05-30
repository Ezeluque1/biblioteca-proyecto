package com.biblioteca.model;

public class Libro {

    private String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}   
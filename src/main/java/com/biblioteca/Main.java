package com.biblioteca;
import com.biblioteca.controller.BibliotecaControlador;
import com.biblioteca.model.Biblioteca;
import com.biblioteca.singleton.BibliotecaSingleton;
import com.biblioteca.view.BibliotecaVista;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = BibliotecaSingleton.getInstancia();

        BibliotecaVista vista = new BibliotecaVista();

        BibliotecaControlador controlador = new BibliotecaControlador(biblioteca, vista);

        controlador.iniciar();  

    }
}
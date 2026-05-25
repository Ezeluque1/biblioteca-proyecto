package com.biblioteca.controller;
import java.util.List;

import com.biblioteca.model.Biblioteca;
import com.biblioteca.model.Libro;
import com.biblioteca.strategy.BusquedaPorTitulo;
import com.biblioteca.strategy.EstrategiaBusqueda;
import com.biblioteca.view.BibliotecaVista;

public class BibliotecaControlador {
    private Biblioteca modelo;
    private BibliotecaVista vista;

    public BibliotecaControlador(Biblioteca modelo, BibliotecaVista vista) {
        this.modelo = modelo;
        this.vista  = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                     agregarLibro();
                     break;
                case 2:
                    verLibros();
                    break;
                case 3:
                    buscarPorTitulo();
                    break;
                case 0:
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }

    private void agregarLibro() {
        String[] datos = vista.pedirDatosLibro();
        Libro libro = new Libro(datos[0]);
        modelo.agregarLibro(libro);
        vista.mostrarMensaje("Libro agregado correctamente.");
    }

    private void verLibros() {
        vista.mostrarLibros(modelo.getLibros());
    }

    private void buscarPorTitulo() {
        String titulo = vista.pedirTitulo();
        EstrategiaBusqueda estrategia = new BusquedaPorTitulo();
        List<Libro> resultados = modelo.buscar(estrategia, titulo);
        vista.mostrarLibros(resultados);
    }

}
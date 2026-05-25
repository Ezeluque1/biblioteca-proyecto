package com.biblioteca.strategy;

import com.biblioteca.model.Libro;
import java.util.List;

public interface EstrategiaBusqueda {
    List<Libro> buscar(List<Libro> libros, String criterio);
}
package com.biblioteca.strategy;

import com.biblioteca.model.Libro;
import java.util.List;
import java.util.stream.Collectors;

public class BusquedaPorTitulo implements EstrategiaBusqueda {

    @Override
    public List<Libro> buscar(List<Libro> libros, String criterio) {
        return libros.stream()
                .filter(l -> l.getTitulo()
                              .toLowerCase()
                              .contains(criterio.toLowerCase()))
                .collect(Collectors.toList());
    }
}
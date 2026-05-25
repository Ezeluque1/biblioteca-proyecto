package com.biblioteca.view;
import com.biblioteca.model.Libro;
import java.util.List;
import java.util.Scanner;

public class BibliotecaVista {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== BIBLIOTECA ===");
        System.out.println("1. Agregar libro");
        System.out.println("2. Ver todos los libros");
        System.out.println("3. Buscar por título");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String[] pedirDatosLibro() {
        System.out.print("Título: ");  String titulo = scanner.nextLine();
        return new String[]{titulo};
    }

    public void mostrarLibros(List<Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        libros.forEach(l ->
            System.out.printf("- %s%n", l.getTitulo())
        );
    }

    public void mostrarLibro(Libro libro) {
        if (libro == null) System.out.println("Libro no encontrado.");
        else System.out.printf("Encontrado: %s%n", libro.getTitulo());
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public String pedirTitulo() {
        System.out.print("Título a buscar: ");
        return scanner.nextLine();
    }
}
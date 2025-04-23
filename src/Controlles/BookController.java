package Controlles;

import Models.Book;

public class BookController {
    // Método para ordenar libros por nombre en orden descendente
    public void sortByName(Book[] libros) {
    // Implementación pendiente
    int n = libros.length;
    boolean condicion;
    for (int i = 0; i < n - 1; i++) {
        condicion = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (libros[j].getName().equals(libros[j + 1].getName())) {
                // Intercambiar arr[j] y arr[j + 1]
                String temp = libros[j].getName();
                libros[j].setName(libros[j+1].getName());
                libros[j + 1].setName(temp);
                condicion = true;
            }
        }
        if (!condicion) break;
        }
    }

// Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
    public Book searchByName(Book[] libros, String name) {
    // Implementación pendiente
    
    return null;
    }
}

package Actividades.Actividad8;

import java.util.ArrayList;

/**
 * ● Actividad: Crea las clases en JAVA para hacer un sistema de préstamos
 * de una biblioteca. En este caso usarás ArrayList.
 * ● Las clases son:
 * ➔ Biblioteca: Tiene de atributo el nombre y la lista de libros y tiene los
 * métodos de agregarLibro, buscarLibro y eliminar libro
 * ➔ Usuario: Tiene de atributos nombre, código y la lista de libros
 * prestados y tiene los métodos de prestarLibro y devolverLibro
 * ➔ Libro: Tiene de atributos nombre, autor, categoría y total para
 * prestar y tiene los métodos de prestar y devolver
 * ➔ Autor: Tiene el nombre y una lista de premios
 * ● Haz la clase con main que haga una prueba de funcionamiento de esta
 * biblioteca. Por ejemplo, que se intente prestar el mismo libro.
 * ● Añade la función de buscar los libros de un autor o por categoría
 */
public class Actividad8 {
    static void main() {
        Author autor1 = new Author("Ricardo Palma");
        autor1.addPremio("Reconocimiento por Tradiciones Peruanas");

        Author autor2 = new Author("Isabel Allende");
        autor2.addPremio("Premio Nacional de Literatura");

        Libro libro1 = new Libro("Tradiciones Peruanas", autor1, "Historia", 2);
        Libro libro2 = new Libro("El amor en los tiempos del cólera", autor2, "Novela", 1);
        Libro libro3 = new Libro("La casa de los espíritus", autor2, "Novela", 3);
        Libro libro4 = new Libro("Paula", autor2, "Biografía", 2);


        Biblioteca biblioteca = new Biblioteca("Cura Valera");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        Usuario usuario1 = new Usuario(1, "Aurora");
        Usuario usuario2 = new Usuario(2, "Pedro");

        System.out.println("=== Préstamos ===");
        libro1.prestar(usuario1);
        libro1.prestar(usuario2);
        libro1.prestar(usuario1); // Aurora intenta pedir otra vez el libro 1

        System.out.println();

        System.out.println("=== Devoluciones ===");
        libro1.devolver(usuario1);

        // Buscar por autor
        System.out.println("\n=== Libros de Ricardo Palma ===");
        ArrayList<Libro> librosAutor = biblioteca.buscarPorAutor("Ricardo Palma");
        for (Libro l : librosAutor) {
            l.show();
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Buscar por categoría
        System.out.println("\n=== Libros de categoría Novela ===");
        ArrayList<Libro> librosCategoria = biblioteca.buscarPorCategoria("Novela");
        for (Libro l : librosCategoria) {
            l.show();
        }
    }
}

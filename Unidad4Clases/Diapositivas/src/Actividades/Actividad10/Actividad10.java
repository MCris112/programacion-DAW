package Actividades.Actividad10;

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
public class Actividad10 {
    static void main() {
        Author ricardoPalma = new Author("Ricardo Palma");
        ricardoPalma.addPremio("Peru escritor");
        Libro libro = new Libro("Don Quijote", ricardoPalma, "Aventura", 100);

        Biblioteca biblioteca = new Biblioteca("Cura Valera");

        biblioteca.agregarLibro(libro);


    }
}

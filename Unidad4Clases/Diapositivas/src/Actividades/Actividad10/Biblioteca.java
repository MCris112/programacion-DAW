package Actividades.Actividad10;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro( String nombre) {
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }

        return null;
    }

    public Libro buscarLibro( Libro libro) {
        int index =  libros.indexOf(libro);

        if (index == -1) {
            return null;
        }

        return libros.get(index);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

}

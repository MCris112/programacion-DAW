package Actividades.Actividad8;

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

    public ArrayList<Libro> buscarPorAutor(String autorNombre) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAuthor().getNombre().equalsIgnoreCase(autorNombre)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public ArrayList<Libro> buscarPorCategoria(String categoria) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
}

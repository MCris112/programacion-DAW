package Actividades.Actividad10;

public class Libro {
    private String nombre;

    private Author author;

    private String categoria;

    private int totales;

    public Libro() {
    }

    public Libro(String nombre, Author author, String categoria, int totales) {
        this.nombre = nombre;
        this.author = author;
        this.categoria = categoria;
        this.totales = totales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void prestar()
    {
        this.totales--;
    }

    public void devolver()
    {
        this.totales++;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTotales() {
        return totales;
    }

    public void setTotales(int totales) {
        this.totales = totales;
    }
}

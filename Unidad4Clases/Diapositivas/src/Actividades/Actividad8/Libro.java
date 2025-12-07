package Actividades.Actividad8;

import Utilities.Table;

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

    public void prestar( Usuario usuario)
    {
        // Verificar si el usuario tiene el libro
        if ( usuario.getPrestados().contains(this) )
        {
            // En caso de que tenga prestarlo
            System.out.println("====== ESte libro ya está prestado ======");
            return;
        }

        System.out.println( usuario.getNombre()+ " a pedido el libro: "+ this.nombre);
        // Si no lo tiene prestar
        usuario.prestarLibro( this );
        this.totales--;
    }

    public void devolver( Usuario usuario )
    {
        System.out.println( usuario.getNombre() + " ha devuelto el libro: "+ this.nombre);
        usuario.devolverLibro( this );
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

    public void show()
    {
        Table table = Table.instance()
                .addRow("Libro")
                .addRow("Nombre", this.nombre)
                .addRow("Categoría", this.categoria)
                .addRow("Ejemplares disponibles", String.valueOf(this.totales))
                .addRow("Autor", this.author.getNombre());

        // Mostrar premios del autor si existen
        if (this.author.getPremios() != null && !this.author.getPremios().isEmpty()) {
            table.addRow("Premios");
            for (String premio : this.author.getPremios()) {
                table.addRow(" - ", premio);
            }
        }

        table.print();
    }

}

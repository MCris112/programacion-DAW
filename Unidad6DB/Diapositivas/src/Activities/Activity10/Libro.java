package Activities.Activity10;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Libro extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String isbn;

    @Column
    private String titulo;

    @Column
    private String descripcion;

    @Column
    private int año_publicacion;

    @Column
    private String tipo;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String descripcion, int año_publicacion, String tipo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.año_publicacion = año_publicacion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(int año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

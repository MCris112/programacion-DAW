package Actividades.Actividad4;

public class Seccion {
    private String titulo, extension;
    private Revista revista = null;

    public Seccion() {
    }

    public Seccion(String titulo, String extension) {
        this.titulo = titulo;
        this.extension = extension;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        String add = "";

        if ( this.revista != null )
             add = this.revista.toString();

        return "Seccion{" +
                "titulo='" + titulo + '\'' +
                ", extension='" + extension + '\'' +
                "} " +add;
    }
}

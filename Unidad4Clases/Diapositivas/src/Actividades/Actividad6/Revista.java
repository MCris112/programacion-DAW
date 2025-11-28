package Actividades.Actividad6;

public class Revista {
    private int numRegistro;
    private String titulo, tipo, periodicidad;

    public Revista() {
    }

    public Revista(int numRegistro, String titulo, String tipo, String periodicidad) {
        this.numRegistro = numRegistro;
        this.titulo = titulo;
        this.tipo = tipo;
        this.periodicidad = periodicidad;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numRegistro=" + numRegistro +
                ", titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}

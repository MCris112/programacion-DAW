package Actividades.Actividad8;

import java.util.ArrayList;

public class Usuario {

    private int codigo;
    private String nombre;

    ArrayList<Libro> prestados = new  ArrayList<>();

    public Usuario() {}

    public Usuario(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getPrestados() {
        return prestados;
    }


    public void prestarLibro(Libro libro)
    {
        this.prestados.add(libro);
    }

    public void devolverLibro( Libro libro )
    {
        this.prestados.remove(libro);
    }
}

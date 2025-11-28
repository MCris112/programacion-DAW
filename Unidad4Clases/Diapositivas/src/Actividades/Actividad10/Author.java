package Actividades.Actividad10;

import java.util.ArrayList;

public class Author {

    private String nombre;
    private ArrayList<String> premios = new ArrayList<>();

    public Author() {
    }

    public Author(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPremio(String premio) {
        this.premios.add(premio);
    }
    public ArrayList<String> getPremios() {
        return premios;
    }

    public void setPremios(ArrayList<String> premios) {
        this.premios = premios;
    }
}

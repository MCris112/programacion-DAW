package Activities.Activity7;

import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Practica extends Model {

    @DbColumn
    protected int id;

    @DbColumn
    protected String titulo;

    @DbColumn
    protected String dificultad;

    public Practica() {
    }

    public Practica(String titulo, String dificultad) {
        this.titulo = titulo;
        this.dificultad = dificultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Practica{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", dificultad='" + dificultad + '\'' +
                '}';
    }
}


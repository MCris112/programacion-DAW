package Activities.Activity7;

import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

import java.sql.Date;

public class ExamenTeorico extends Model {

    @DbColumn
    protected int id;

    @DbColumn
    protected String titulo;

    @DbColumn
    protected int numeroPreguntas;

    @DbColumn
    protected Date fecha;

    public ExamenTeorico() {
    }

    public ExamenTeorico(String titulo, int numeroPreguntas, Date fecha) {
        this.titulo = titulo;
        this.numeroPreguntas = numeroPreguntas;
        this.fecha = fecha;
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

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ExamenTeorico{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", numeroPreguntas=" + numeroPreguntas +
                ", fecha=" + fecha +
                '}';
    }
}

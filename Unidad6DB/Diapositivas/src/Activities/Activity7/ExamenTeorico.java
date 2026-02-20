package Activities.Activity7;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

import java.sql.Date;

public class ExamenTeorico extends Model {

    @DBColPrimary
    @DbColumn
    private int id;

    @DbColumn
    private String titulo;

    @DbColumn
    private int numeroPreguntas;

    @DbColumn
    private String fecha;

    @DBForeign(model = Profesor.class)
    @DbColumn
    private int profesorId;

    public ExamenTeorico() {
    }

    public ExamenTeorico(String titulo, int numeroPreguntas, String fecha) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
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

    @Override
    public String getDatabaseName() {
        return "mcris_er_alumno_examen";
    }
}

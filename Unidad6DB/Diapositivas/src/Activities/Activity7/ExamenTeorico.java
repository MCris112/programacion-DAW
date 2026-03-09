package Activities.Activity7;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

import java.sql.Date;

public class ExamenTeorico extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String titulo;

    @Column
    private int numeroPreguntas;

    @Column
    private String fecha;

    @DBForeign(model = Profesor.class)
    @Column
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

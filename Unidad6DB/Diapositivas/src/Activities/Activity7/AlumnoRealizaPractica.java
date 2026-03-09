package Activities.Activity7;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class AlumnoRealizaPractica extends Model {


    @DBForeign(model= Alumno.class)
    @Column
    private int alumnoId;

    @DBForeign(model= Practica.class)
    @Column
    private int practicaId;

    @Column
    private String fecha;

    @Column
    private double nota;

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getPracticaId() {
        return practicaId;
    }

    public void setPracticaId(int practicaId) {
        this.practicaId = practicaId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "AlumnoRealizaPractica{" +
                "alumnoId=" + alumnoId +
                ", practicaId=" + practicaId +
                ", fecha='" + fecha + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_alumno_examen";
    }
}

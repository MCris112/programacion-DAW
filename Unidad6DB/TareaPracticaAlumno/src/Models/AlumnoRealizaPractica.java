package Models;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class AlumnoRealizaPractica extends Model {

    @DBForeign(model = Alumno.class)
    @DbColumn
    protected int alumnoId;

    @DBForeign(model = Practica.class)
    @DbColumn
    protected int practicaId;

    @DbColumn
    private String fecha;

    @DbColumn
    private double nota;

    public AlumnoRealizaPractica() {
    }

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
}

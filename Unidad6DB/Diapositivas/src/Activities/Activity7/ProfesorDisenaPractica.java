package Activities.Activity7;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class ProfesorDisenaPractica extends Model {

    @DBForeign(model=Profesor.class)
    @DbColumn
    private int profesorId;

    @DBForeign(model=Practica.class)
    @DbColumn
    private int practicaId;

    @DbColumn
    private String fecha;

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
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

    @Override
    public String toString() {
        return "ProfesorDisenaPractica{" +
                "profesorId=" + profesorId +
                ", practicaId=" + practicaId +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_alumno_examen";
    }
}

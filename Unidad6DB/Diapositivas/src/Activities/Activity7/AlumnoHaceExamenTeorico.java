package Activities.Activity7;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class AlumnoHaceExamenTeorico extends Model {

    @DBForeign(model= Alumno.class)
    @Column
    private int alumnoId;

    @DBForeign(model = ExamenTeorico.class)
    @Column
    private int examenTeorico;

    @Column
    private int nota;

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getExamenTeorico() {
        return examenTeorico;
    }

    public void setExamenTeorico(int examenTeorico) {
        this.examenTeorico = examenTeorico;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "AlumnoHaceExamenTeorico{" +
                "alumnoId=" + alumnoId +
                ", examenTeorico=" + examenTeorico +
                ", nota=" + nota +
                '}';
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_alumno_examen";
    }
}

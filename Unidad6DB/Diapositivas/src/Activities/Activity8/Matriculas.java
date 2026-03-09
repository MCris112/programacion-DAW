package Activities.Activity8;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Matriculas extends Model {

    @DBForeign(model = Alumno.class)
    @Column
    private int alumnoId;

    @DBForeign(model = CursoEscolar.class)
    @Column
    private int cursoEscolarId;

    @DBForeign(model = Asignatura.class)
    @Column
    private int asignaturaId;

    public Matriculas() {
    }

    public Matriculas(int alumnoId, int cursoEscolarId, int asignaturaId) {
        this.alumnoId = alumnoId;
        this.cursoEscolarId = cursoEscolarId;
        this.asignaturaId = asignaturaId;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getCursoEscolarId() {
        return cursoEscolarId;
    }

    public void setCursoEscolarId(int cursoEscolarId) {
        this.cursoEscolarId = cursoEscolarId;
    }

    public int getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(int asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_alumno_matricula";
    }
}

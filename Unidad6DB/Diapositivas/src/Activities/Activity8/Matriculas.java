package Activities.Activity8;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Matriculas extends Model {

    @DBForeign(model = Alumno.class)
    @DbColumn
    private int alumnoId;

    @DBForeign(model = CursoEscolar.class)
    @DbColumn
    private int cursoEscolarId;

    @DBForeign(model = Asignatura.class)
    @DbColumn
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

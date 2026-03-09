package Models;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Matricula extends Model {

    @Primary
    @Column
    private int alumnoId;

    @Primary
    @Column
    private int cursoEscolarId;

    @Primary
    @Column
    private int asignaturaId;

    public Matricula() {
    }

    public Matricula(int alumnoId, int cursoEscolarId, int asignaturaId) {
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
        return "cristopher_activity_12";
    }
}

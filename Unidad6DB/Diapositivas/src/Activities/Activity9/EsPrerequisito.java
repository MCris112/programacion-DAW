package Activities.Activity9;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class EsPrerequisito extends Model {


    @DBForeign(model = Curso.class)
    @DbColumn
    private int cursoId;

    @DBForeign(model = Curso.class)
    @DbColumn
    private int requisitoId;

    @DbColumn
    private boolean esObligatorio;

    public EsPrerequisito() {
    }

    public EsPrerequisito(int cursoId, int requisitoId, boolean esObligatorio) {
        this.cursoId = cursoId;
        this.requisitoId = requisitoId;
        this.esObligatorio = esObligatorio;
    }


    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getRequisitoId() {
        return requisitoId;
    }

    public void setRequisitoId(int requisitoId) {
        this.requisitoId = requisitoId;
    }

    public boolean isEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }


    @Override
    public String getDatabaseName() {
        return "mcris_er_curso_empleado";
    }
}

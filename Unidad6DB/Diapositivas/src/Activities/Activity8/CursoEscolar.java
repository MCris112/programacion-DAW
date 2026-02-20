package Activities.Activity8;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class CursoEscolar extends Model {

    @DBColPrimary
    @DbColumn
    private int id;

    @DbColumn
    private int anoInicio;

    @DbColumn
    private int anoFin;

    public CursoEscolar() {
    }

    public CursoEscolar( int anoInicio, int anoFin) {
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(int anoFin) {
        this.anoFin = anoFin;
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_alumno_matricula";
    }
}

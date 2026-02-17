package Models;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class ProfesorDisenaPractica extends Model {

    @DBForeign(model = Practica.class)
    @DbColumn
    protected int practicaId;

    @DBForeign(model = Profesor.class)
    @DbColumn
    protected int profesorId;

    @DbColumn
    protected String fecha;

    public ProfesorDisenaPractica() {
    }

    public int getPracticaId() {
        return practicaId;
    }

    public void setPracticaId(int practicaId) {
        this.practicaId = practicaId;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

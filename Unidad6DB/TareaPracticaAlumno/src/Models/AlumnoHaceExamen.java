package Models;

import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class AlumnoHaceExamen extends Model {

    @DBForeign(model = Alumno.class)
    @DbColumn
    private int alumnoId;

    @DBForeign(model = ExamenTeorico.class)
    @DbColumn
    private int examenTeoricoId;

    @DbColumn
    private String fecha;

    public AlumnoHaceExamen() {
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getExamenTeoricoId() {
        return examenTeoricoId;
    }

    public void setExamenTeoricoId(int examenTeoricoId) {
        this.examenTeoricoId = examenTeoricoId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

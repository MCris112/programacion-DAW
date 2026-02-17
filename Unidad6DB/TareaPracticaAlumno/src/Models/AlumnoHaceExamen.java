package Models;

import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class AlumnoHaceExamen extends Model {

    @DbColumn
    private int alumnoId;

    @DbColumn
    private int examenTeoricoId;

    @DbColumn
    private String fecha;
}

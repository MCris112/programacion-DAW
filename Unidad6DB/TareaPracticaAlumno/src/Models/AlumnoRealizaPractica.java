package Models;

import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class AlumnoRealizaPractica extends Model {

    @DbColumn
    protected int alumnoId;

    @DbColumn
    protected int practicaId;

    @DbColumn
    private String fecha;

    @DbColumn
    private double nota;
}

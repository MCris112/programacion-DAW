package Models;

import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class ProfesorDisenaPractica extends Model {

    @DbColumn
    protected int practicaId;

    @DbColumn
    protected int profesorId;

    @DbColumn
    protected String fecha;
}

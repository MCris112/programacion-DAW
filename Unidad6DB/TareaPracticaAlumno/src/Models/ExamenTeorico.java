package Models;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class ExamenTeorico extends Model {

    @DBColPrimary
    @DbColumn
    protected int id;

    @DbColumn
    protected String titulo;

    @DbColumn
    protected int numeroPreguntas;

    @DbColumn
    protected String fecha;

    @DbColumn
    protected int profesorId;
}

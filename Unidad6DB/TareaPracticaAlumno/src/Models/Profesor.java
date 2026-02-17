package Models;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Profesor extends Model {

    @DbColumn
    @DBColPrimary
    protected int id;

    @DbColumn
    protected String nif;

    @DbColumn
    protected String nombre;

    @DbColumn
    protected String apellidos;

    @DbColumn
    protected int examenTeoricoId;
}

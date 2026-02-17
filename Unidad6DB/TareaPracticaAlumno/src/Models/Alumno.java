package Models;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Alumno extends Model {

    @DbColumn
    @DBColPrimary
    protected int id;

    @DbColumn
    protected String nif;

    @DbColumn
    protected String grupo;
}

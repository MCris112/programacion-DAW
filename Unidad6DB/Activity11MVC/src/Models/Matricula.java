package Models;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Matricula extends Model {

    @DBColPrimary
    @DbColumn
    private int alumnoId;

    @DBColPrimary
    @DbColumn
    private int cursoEscolarId;

    @DBColPrimary
    @DbColumn
    private int asignaturaId;
}

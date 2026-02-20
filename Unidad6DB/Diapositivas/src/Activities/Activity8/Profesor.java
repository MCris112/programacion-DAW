package Activities.Activity8;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Profesor extends Model {

    @DBColPrimary
    @DbColumn
    protected int id;

    @DbColumn
    protected String nif;

    @DbColumn
    protected String name;

    @DbColumn
    protected String apellido;

    public Profesor() {
    }

    public Profesor(String nif, String name, String apellido) {
        this.nif = nif;
        this.name = name;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_alumno_matricula ";
    }
}

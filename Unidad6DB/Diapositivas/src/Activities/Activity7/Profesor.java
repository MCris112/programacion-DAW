package Activities.Activity7;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Profesor extends Model {

    @Primary
    @Column
    protected int id;

    @Column
    protected String nif;

    @Column
    protected String name;

    @Column
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
        return "mcris_er_alumno_examen";
    }
}

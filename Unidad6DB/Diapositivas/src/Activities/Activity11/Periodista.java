package Activities.Activity11;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Periodista extends Model {

    @Primary
    @Column
    private long id;

    @Column
    private String nombre;

    @Column
    private String apellidos;

    @Column
    private String telefno;

    @Column
    private String especialidad;

    public Periodista() {
    }

    public Periodista(String nombre, String apellidos, String telefno, String especialidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefno = telefno;
        this.especialidad = especialidad;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

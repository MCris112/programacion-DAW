package Activities.Activity11;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Empleado extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String nif;

    @Column
    private String nombre;

    @Column
    private String apellidos;

    @Column
    private String telefono;

    public Empleado() {
    }

    public Empleado(String nif, String nombre, String apellidos, String telefono) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

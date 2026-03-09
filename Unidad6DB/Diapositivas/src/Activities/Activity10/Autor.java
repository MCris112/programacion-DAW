package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Autor extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String nombre;

    @Column
    private String apellido1;

    @Column
    private String apellido2;

    @Column
    private String url;

    @Column
    private String telefono;

    @Column
    private String direccion;

    @BelongsTo(model = Localidad.class)
    private Localidad localidad;

    public Autor() {
    }

    public Autor(String nombre, String apellido1, String apellido2, String url, String telefono, String direccion,
            Localidad localidad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.url = url;
        this.telefono = telefono;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

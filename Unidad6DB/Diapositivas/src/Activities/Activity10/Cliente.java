package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Cliente extends Model {

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
    private String direccion;

    @Column
    private String email;

    @Column
    private String telefono;

    @BelongsTo(model = Localidad.class)
    private Localidad localidad;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido1, String apellido2, String direccion, String email, String telefono,
            Localidad localidad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.localidad = localidad;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Almacen extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String telefono;

    @Column
    private String direccion;

    @BelongsTo(model = Localidad.class)
    private Localidad localidad;

    public Almacen() {
    }

    public Almacen(String telefono, String direccion, Localidad localidad) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

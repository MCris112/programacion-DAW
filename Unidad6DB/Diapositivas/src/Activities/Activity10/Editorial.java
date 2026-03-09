package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Editorial extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String nombre;

    @Column
    private String direccion;

    @Column
    private String telefono;

    @Column
    private String url;

    @BelongsTo(model = Localidad.class)
    private Localidad localidad;

    public Editorial() {
    }

    public Editorial(String nombre, String direccion, String telefono, String url, Localidad localidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.localidad = localidad;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

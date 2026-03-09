package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Localidad extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String nombre;

    @BelongsTo(model = Provincia.class)
    private Provincia provincia;

    public Localidad() {
    }

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

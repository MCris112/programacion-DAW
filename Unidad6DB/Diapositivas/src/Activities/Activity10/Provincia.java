package Activities.Activity10;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Provincia extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String nombre;

    public Provincia() {
    }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

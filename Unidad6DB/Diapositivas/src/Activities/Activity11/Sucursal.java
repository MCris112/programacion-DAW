package Activities.Activity11;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Sucursal extends Model {

    @Primary
    @Column
    private int codigo;

    @Column
    private String provincia;

    @Column
    private String ciudad;

    @Column
    private String direccion;

    @Column
    private String telefono;

    public Sucursal() {
    }

    public Sucursal(String provincia, String ciudad, String direccion, String telefono) {
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

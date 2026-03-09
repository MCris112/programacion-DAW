package Activities.Activity11;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Database.Model;

public class SucursalPublicaRevista extends Model {

    @BelongsTo(model = Sucursal.class)
    private Sucursal sucursal;

    @BelongsTo(model = Revista.class)
    private Revista revista;

    public SucursalPublicaRevista() {
    }

    public SucursalPublicaRevista(Sucursal sucursal, Revista revista) {
        this.sucursal = sucursal;
        this.revista = revista;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

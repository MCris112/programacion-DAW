package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Cesta extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String fecha_compra;

    @BelongsTo(model = Cliente.class)
    private Cliente cliente;

    public Cesta() {
    }

    public Cesta(String fecha_compra, Cliente cliente) {
        this.fecha_compra = fecha_compra;
        this.cliente = cliente;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

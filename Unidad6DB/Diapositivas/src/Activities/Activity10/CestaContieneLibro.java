package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class CestaContieneLibro extends Model {

    @Column
    private int cantidad;

    @BelongsTo(model = Cesta.class)
    private Cesta cesta;

    @BelongsTo(model = Libro.class)
    private Libro libro;

    public CestaContieneLibro() {
    }

    public CestaContieneLibro(Cesta cesta, Libro libro, int cantidad) {
        this.cesta = cesta;
        this.libro = libro;
        this.cantidad = cantidad;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

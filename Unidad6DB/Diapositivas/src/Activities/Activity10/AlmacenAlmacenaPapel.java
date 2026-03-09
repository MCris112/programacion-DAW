package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class AlmacenAlmacenaPapel extends Model {

    @Column
    private int stock;

    @BelongsTo(model = Almacen.class)
    private Almacen almacen;

    @BelongsTo(model = LibroPapel.class)
    private LibroPapel libroPapel;

    public AlmacenAlmacenaPapel() {
    }

    public AlmacenAlmacenaPapel(Almacen almacen, LibroPapel libroPapel, int stock) {
        this.almacen = almacen;
        this.libroPapel = libroPapel;
        this.stock = stock;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

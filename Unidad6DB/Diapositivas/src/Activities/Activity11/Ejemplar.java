package Activities.Activity11;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Ejemplar extends Model {

    @BelongsTo(model = Revista.class)
    private Revista revista;

    @Column
    private String fecha;

    @Column
    private int numeroPaginas;

    @Column
    private int numeroEjemplares;

    public Ejemplar() {
    }

    public Ejemplar(Revista revista, String fecha, int numeroPaginas, int numeroEjemplares) {
        this.revista = revista;
        this.fecha = fecha;
        this.numeroPaginas = numeroPaginas;
        this.numeroEjemplares = numeroEjemplares;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

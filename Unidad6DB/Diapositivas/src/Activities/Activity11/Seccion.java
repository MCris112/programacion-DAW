package Activities.Activity11;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Seccion extends Model {

    @BelongsTo(model = Revista.class)
    private Revista revista;

    @Column
    private String titulo;

    @Column
    private String extension;

    public Seccion() {
    }

    public Seccion(Revista revista, String titulo, String extension) {
        this.revista = revista;
        this.titulo = titulo;
        this.extension = extension;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Database.Model;

public class EditorialPublicaLibro extends Model {

    @BelongsTo(model = Editorial.class)
    private Editorial editorial;

    @BelongsTo(model = Libro.class)
    private Libro libro;

    public EditorialPublicaLibro() {
    }

    public EditorialPublicaLibro(Editorial editorial, Libro libro) {
        this.editorial = editorial;
        this.libro = libro;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

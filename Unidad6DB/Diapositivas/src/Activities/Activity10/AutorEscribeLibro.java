package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Database.Model;

public class AutorEscribeLibro extends Model {

    @BelongsTo(model = Autor.class)
    private Autor autor;

    @BelongsTo(model = Libro.class)
    private Libro libro;

    public AutorEscribeLibro() {
    }

    public AutorEscribeLibro(Autor autor, Libro libro) {
        this.autor = autor;
        this.libro = libro;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

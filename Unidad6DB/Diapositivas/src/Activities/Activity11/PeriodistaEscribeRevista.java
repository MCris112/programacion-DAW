package Activities.Activity11;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Database.Model;

public class PeriodistaEscribeRevista extends Model {

    @BelongsTo(model = Revista.class)
    private Revista revista;

    @BelongsTo(model = Periodista.class)
    private Periodista periodista;

    public PeriodistaEscribeRevista() {
    }

    public PeriodistaEscribeRevista(Revista revista, Periodista periodista) {
        this.revista = revista;
        this.periodista = periodista;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

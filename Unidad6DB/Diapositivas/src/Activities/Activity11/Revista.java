package Activities.Activity11;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Revista extends Model {

    @Primary
    @Column
    private int numeroRegistro;

    @Column
    private String titulo;

    @Column
    private String tipo;

    @Column
    private String periodicidad;

    public Revista() {
    }

    public Revista(String titulo, String tipo, String periodicidad) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.periodicidad = periodicidad;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_11";
    }
}

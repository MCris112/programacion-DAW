package Activities.Activity4;


import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Partido extends Model {

    @DBColPrimary
    @DbColumn
    protected int codigo;

    @Override
    public String getKeyName() {
        return "codigo";
    }

    @DbColumn
    protected String equipoLocal;

    @DbColumn
    protected String equipoVisitante;

    @DbColumn
    protected int puntosLocal;

    @DbColumn
    protected int puntosVisitante;

    @DbColumn
    protected String temporada;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Override
    public String getDatabaseName() {
        return "nba";
    }

    @Override
    public String toString() {
        return "Partido{" +
                "codigo=" + codigo +
                ", equipoLocal='" + equipoLocal + '\'' +
                ", equipoVisitante='" + equipoVisitante + '\'' +
                ", puntosLocal=" + puntosLocal +
                ", puntosVisitante=" + puntosVisitante +
                ", temporada='" + temporada + '\'' +
                '}';
    }
}

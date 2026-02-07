package Activities.Activity1;


import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Jugador extends Model {

    @DbColumn
    protected int codigo;

    @DbColumn("Nombre")
    protected String nombre;

    @DbColumn("Procedencia")
    protected String procedencia;

    @DbColumn("Altura")
    protected String altura;

    @DbColumn("Peso")
    protected int peso;

    @DbColumn("Posicion")
    protected String posicion;

    @DbColumn("Nombre_equipo")
    protected String nombreEquipo;


    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public String getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", altura='" + altura + '\'' +
                ", peso=" + peso +
                ", posicion='" + posicion + '\'' +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                '}';
    }


    @Override
    public String getDatabaseName() {
        return "nba";
    }
}

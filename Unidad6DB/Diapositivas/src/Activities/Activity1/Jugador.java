package Activities.Activity1;


import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Jugador extends Model {

    @Column
    protected int codigo;

    @Column("Nombre")
    protected String nombre;

    @Column("Procedencia")
    protected String procedencia;

    @Column("Altura")
    protected String altura;

    @Column("Peso")
    protected int peso;

    @Column("Posicion")
    protected String posicion;

    @Column("Nombre_equipo")
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

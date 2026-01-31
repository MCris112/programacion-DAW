package Activities.Activity1;

import DB.Model;

public class Jugador extends Model {

    protected int codigo;

    protected String nombre;

    protected String procedencia;

    protected String altura;
    protected int peso;
    protected String posicion;
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
}

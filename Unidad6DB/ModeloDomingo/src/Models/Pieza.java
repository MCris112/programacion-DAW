package Models;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Pieza extends Model {

    @DBColPrimary
    @DbColumn
    private int codigo;

    @Override
    public String getKeyName() {
        return "codigo";
    }

    @DbColumn
    private String nombre;

    @DbColumn
    private String color;

    @DbColumn
    private double precio;

    @DbColumn
    private int codCategoria;

    public Pieza() {}

    public Pieza(int codigo, String nombre, String color, double precio, int codCategoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.codCategoria = codCategoria;
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getColor() { return color; }
    public double getPrecio() { return precio; }
    public int getCodCategoria() { return codCategoria; }
}
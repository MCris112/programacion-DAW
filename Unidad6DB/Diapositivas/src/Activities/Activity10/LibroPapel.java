package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Database.Model;

public class LibroPapel extends Model {

    @Primary
    @BelongsTo(model = Libro.class)
    private Libro libro;

    @Column
    private String lugar_impresion;

    @Column
    private String fecha_impresion;

    @Column
    private double precio;

    public LibroPapel() {
    }

    public LibroPapel(Libro libro, String lugar_impresion, String fecha_impresion, double precio) {
        this.libro = libro;
        this.lugar_impresion = lugar_impresion;
        this.fecha_impresion = fecha_impresion;
        this.precio = precio;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getLugar_impresion() {
        return lugar_impresion;
    }

    public void setLugar_impresion(String lugar_impresion) {
        this.lugar_impresion = lugar_impresion;
    }

    public String getFecha_impresion() {
        return fecha_impresion;
    }

    public void setFecha_impresion(String fecha_impresion) {
        this.fecha_impresion = fecha_impresion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getDatabaseName() {
        return "cristopher_activity_10";
    }
}

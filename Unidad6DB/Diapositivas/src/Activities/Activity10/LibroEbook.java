package Activities.Activity10;

import com.darkredgm.querymc.Annotations.BelongsTo;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Database.Model;

public class LibroEbook extends Model {

    @Primary
    @BelongsTo(model = Libro.class)
    private Libro libro;

    @Column
    private double tamaño;

    @Column
    private double precio;

    public LibroEbook() {
    }

    public LibroEbook(Libro libro, double tamaño, double precio) {
        this.libro = libro;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
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

package Activities.Activity9;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Curso extends Model {

    @DBColPrimary
    @DbColumn
    private int id;

    @DbColumn
    private String nombre;

    @DbColumn
    private String descripcion;

    @DbColumn
    private int duracion;

    @DbColumn
    private double coste;

    public Curso() {
    }

    public Curso(String nombre, String descripcion, int duracion, double coste) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.coste = coste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_curso_empleado";
    }
}

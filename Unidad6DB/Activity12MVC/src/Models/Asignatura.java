package Models;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Asignatura extends Model {

    @Primary
    @Column
    private int codigo;

    @Column
    private String nombre;

    @Column
    private int numeroHoras;

    @Column
    private int profesorId;

    public Asignatura() {
    }

    public Asignatura(int codigo, String nombre, int numeroHoras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }


    @Override
    public String getDatabaseName() {
        return "cristopher_activity_12";
    }
}

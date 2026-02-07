package Activities.Activity7;

import com.darkredgm.querymc.Annotations.DbColumn;

public class Alumno {

    @DbColumn
    protected int id;

    @DbColumn
    protected String nif;

    @DbColumn
    protected String grupo;

    @DbColumn
    protected String nombre;

    @DbColumn
    protected String apellidos;

    public Alumno() {
    }

    public Alumno(String nif, String grupo, String nombre, String apellidos) {
        this.nif = nif;
        this.grupo = grupo;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", grupo='" + grupo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}

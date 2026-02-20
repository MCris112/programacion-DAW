package Activities.Activity9;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;
import com.darkredgm.querymc.Database.Model;

public class Empleado extends Model {

    @DBColPrimary
    @DbColumn
    protected Integer id;

    @DbColumn
    protected String nombre;

    @DbColumn
    protected String apellidos;

    @DbColumn
    protected String telefono;

    @DbColumn
    protected String direccion;

    @DbColumn
    protected String tipo; //Capacitado/NoCapacitado

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String telefono, String direccion, String tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipo = tipo;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTableName() {
        return "empleados";
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_curso_empleado";
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

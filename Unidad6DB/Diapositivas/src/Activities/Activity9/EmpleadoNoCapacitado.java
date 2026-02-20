package Activities.Activity9;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;

public class EmpleadoNoCapacitado extends Empleado{

    @DBColPrimary
    @DbColumn
    protected int id;

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

    public EmpleadoNoCapacitado() {
    }

    public EmpleadoNoCapacitado(String nombre, String apellidos, String telefono, String direccion) {
        super(nombre, apellidos, telefono, direccion, "no-capacitado");
    }
}

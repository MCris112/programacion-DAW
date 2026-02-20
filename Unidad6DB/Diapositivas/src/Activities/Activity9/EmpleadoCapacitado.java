package Activities.Activity9;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Annotations.DbColumn;

public class EmpleadoCapacitado extends Empleado{

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

    public EmpleadoCapacitado() {
    }

    public EmpleadoCapacitado(String nombre, String apellidos, String telefono, String direccion) {
        super(nombre, apellidos, telefono, direccion, "capacitado");
    }
}

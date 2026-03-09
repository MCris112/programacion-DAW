package Activities.Activity9;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;

public class EmpleadoNoCapacitado extends Empleado{

    @Primary
    @Column
    protected int id;

    @Column
    protected String nombre;

    @Column
    protected String apellidos;

    @Column
    protected String telefono;

    @Column
    protected String direccion;

    @Column
    protected String tipo; //Capacitado/NoCapacitado

    public EmpleadoNoCapacitado() {
    }

    public EmpleadoNoCapacitado(String nombre, String apellidos, String telefono, String direccion) {
        super(nombre, apellidos, telefono, direccion, "no-capacitado");
    }
}

package Activities.Activity9;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.Column;

public class EmpleadoCapacitado extends Empleado{

    @Primary
    @Column
    protected Integer id;

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

    public EmpleadoCapacitado() {
    }

    public EmpleadoCapacitado(String nombre, String apellidos, String telefono, String direccion) {
        super(nombre, apellidos, telefono, direccion, "capacitado");
    }
}

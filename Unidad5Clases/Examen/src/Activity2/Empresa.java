package Activity2;

import java.util.ArrayList;

public class Empresa {

    private String name;

    private String ciudad;
    private String pais;

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public Empresa(String name, String ciudad, String pais) {
        this.name = name;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getName() {
        return name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}

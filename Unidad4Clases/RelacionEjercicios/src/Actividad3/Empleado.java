package Actividad3;

import java.util.ArrayList;

public class Empleado {

    private String legajo, dni, nombre;

    private Domicilio domicilio;

    private ArrayList<String> telefonos;

    public Empleado() {
        this.telefonos = new ArrayList<>();
    }

    public Empleado(String legajo, String dni, String nombre, Domicilio domicilio, ArrayList<String> telefonos) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefonos = telefonos;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    /**
     * Añade telefono adicional
     * @param telefono formato de telefono
     */
    public void addTelefono(String telefono)
    {
        this.telefonos.add(telefono);
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
}

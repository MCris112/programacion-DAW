package Actividades.Actividad9;

public class Maquinista {

    private String nombre, dni, rango;
    private double sueldo;

    public Maquinista() {
    }

    public Maquinista(String nombre, String dni, String rango, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.rango = rango;
        this.sueldo = sueldo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

package Actividad3;

public class Cliente {
    private int id;
    private String nombre, ciudad, dni, fechaNacimiento;

    private Sucursal sucursal;
    private double descuento;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String ciudad, String dni, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

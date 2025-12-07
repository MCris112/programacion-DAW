package Actividades.Actividad4;

public class Empleado {
    private int id;

    private String dni;
    private String nombre, apellido, telefono;
    private Sucursal trabajo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Sucursal getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Sucursal trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        String add = "";

        if ( this.trabajo != null ) {
            add = this.trabajo.toString();
        }

        return "Empleado{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                "} " + add;
    }
}

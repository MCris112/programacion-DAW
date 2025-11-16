package Actividades.Actividad1;

import java.time.LocalDate;

//Persona (nombre, DNI, fechaNacimiento, dirección, género, estado civil)
public class Persona {
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;

    private String direccion;
    private Genero genero;

    private EstadoCivil estado;

    public Persona(String nombre, String dni, LocalDate fechaNacimiento, String direccion, Genero genero, EstadoCivil estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.genero = genero;
        this.estado = estado;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstado() {
        return estado;
    }

    public void setEstado(EstadoCivil estado) {
        this.estado = estado;
    }
}

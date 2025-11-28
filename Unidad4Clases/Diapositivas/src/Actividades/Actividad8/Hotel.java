package Actividades.Actividad8;

public class Hotel {

    private int id;
    private String nombre, telefono, ciudad, direccion;

    private int plazas;

    public Hotel() {
    }

    public Hotel(int id, String nombre, String telefono, String ciudad, String direccion, int plazas) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.plazas = plazas;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}

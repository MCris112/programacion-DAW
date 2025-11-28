package Actividad3;

public class Sucursal {

    private int id;
    private String domicilio, ciudad;

    public Sucursal() {
    }

    public Sucursal(int id, String domicilio, String ciudad) {
        this.id = id;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

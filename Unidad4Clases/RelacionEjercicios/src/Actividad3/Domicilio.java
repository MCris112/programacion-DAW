package Actividad3;

public class Domicilio {

    private String calle, ciudad;

    private int numero;

    public Domicilio() {
    }

    public Domicilio(String calle, String ciudad, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

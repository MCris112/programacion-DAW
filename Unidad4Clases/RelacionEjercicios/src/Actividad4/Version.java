package Actividad4;

public class Version {

    private int id, potencia;

    private String nombre;

    private double precioBase;

    private Combustible combustible;

    private Modelo modelo;

    public Version(){};

    public Version(int id, int potencia, String nombre, double precioBase, Combustible combustible) {
        this.id = id;
        this.potencia = potencia;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.combustible = combustible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Version{" +
                "id=" + id +
                ", potencia=" + potencia +
                ", nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", combustible=" + combustible +
                ", modelo=" + modelo +
                '}';
    }
}

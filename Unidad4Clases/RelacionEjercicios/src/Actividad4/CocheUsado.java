package Actividad4;

public class CocheUsado {

    private int id;
    private String matricula, nombre;
    private double precioTasacion;

    private Cliente cliente;

    public CocheUsado(){}

    public CocheUsado(int id, String matricula, String nombre, double precioTasacion) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.precioTasacion = precioTasacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioTasacion() {
        return precioTasacion;
    }

    public void setPrecioTasacion(double precioTasacion) {
        this.precioTasacion = precioTasacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CocheUsado{" +
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioTasacion=" + precioTasacion +
                ", cliente=" + cliente +
                '}';
    }
}

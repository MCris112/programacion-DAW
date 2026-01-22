public class Propietario extends Persona{

    private String direccion;

    public Propietario(String dni, String nombre, String apellido, String direccion) {
        super(dni, nombre, apellido);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String identificate() {
        return "Propietario";
    }
}

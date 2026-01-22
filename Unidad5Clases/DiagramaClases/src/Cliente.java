import java.util.ArrayList;

public class Cliente extends Persona{

    private String telefono;

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Cliente(String dni, String nombre, String apellido, String telefono) {
        super(dni, nombre, apellido);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    @Override
    public String identificate() {
        return "Cliente";
    }
}

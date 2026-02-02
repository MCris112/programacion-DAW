package Activities.Activity13;

public class Animal {

    protected String nombre, tipoAlimentacion;
    protected  int edad;

    public Animal(String nombre, String tipoAlimentacion, int edad) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

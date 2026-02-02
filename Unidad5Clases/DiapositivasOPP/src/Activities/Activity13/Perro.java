package Activities.Activity13;

public class Perro extends Mamifero{

    protected String raza;

    public Perro(String nombre, String tipoAlimentacion, int edad, int gestacion, String raza) {
        super(nombre, tipoAlimentacion, edad, gestacion);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

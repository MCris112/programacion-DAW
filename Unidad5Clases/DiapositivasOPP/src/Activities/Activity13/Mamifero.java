package Activities.Activity13;

public class Mamifero extends Animal{

    protected int gestacion;

    public Mamifero(String nombre, String tipoAlimentacion, int edad, int gestacion) {
        super(nombre, tipoAlimentacion, edad);
        this.gestacion = gestacion;
    }

    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }
}

package Activities.Activity13;

public class Caballo extends Mamifero{

    protected String comida;
    protected int ejercicio;

    public Caballo(String nombre, String tipoAlimentacion, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipoAlimentacion, edad, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }
}

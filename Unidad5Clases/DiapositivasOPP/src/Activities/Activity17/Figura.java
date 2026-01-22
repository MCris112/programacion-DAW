package Activities.Activity17;

public abstract class Figura {

    protected String nombre;

    Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", area="+calcularArea()+", perimetro="+calcularPerimetro()+"}";
    }
}

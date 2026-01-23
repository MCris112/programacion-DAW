package Activity7;

public abstract class Vehiculo {

    protected String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public abstract void arrancar();

    public void frenar()
    {
        System.out.println(this.marca+"está frenando");
    }
}

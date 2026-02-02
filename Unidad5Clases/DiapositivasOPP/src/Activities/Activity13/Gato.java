package Activities.Activity13;

public class Gato extends Mamifero{

    protected String pedigri;

    public Gato(String nombre, String tipoAlimentacion, int edad, int gestacion, String pedigri) {
        super(nombre, tipoAlimentacion, edad, gestacion);
        this.pedigri = pedigri;
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }
}

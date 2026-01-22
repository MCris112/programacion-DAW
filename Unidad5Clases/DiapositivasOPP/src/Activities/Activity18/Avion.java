package Activities.Activity18;

public class Avion implements Movible, Sonoro{
    @Override
    public void mover() {
        System.out.println("El avion vuela por el cielo");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El avion hace ruido de motores: !Vrooom!");
    }
}

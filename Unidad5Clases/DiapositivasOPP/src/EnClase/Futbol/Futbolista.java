package EnClase.Futbol;

public class Futbolista extends SeleccionFutbol{

    @Override
    public void concentrarse() {
        System.out.println("Consentrandose.... Pensanding....");
    }

    @Override
    public void viajar() {
        System.out.println("Yendo de viaje");
    }

    @Override
    public void entrenar() {
        System.out.println("Calentando....");
        System.out.println("Entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando...");
    }
}

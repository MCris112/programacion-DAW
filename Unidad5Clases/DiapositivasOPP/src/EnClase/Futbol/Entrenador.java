package EnClase.Futbol;

public class Entrenador extends  SeleccionFutbol{

    @Override
    public void concentrarse() {
        System.out.println("Entrenador pensanding...");
    }

    @Override
    public void viajar() {
        System.out.println("Etrenador viajando por el mundo de las comisiones...");
    }

    @Override
    public void entrenar() {
        System.out.println("Gritando a los futbolistas a entrenar");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Verificando el partido de los futbolista");
    }
}

package EnClase.Futbol;

public class Masajista extends  SeleccionFutbol{
    @Override
    public void concentrarse() {
        System.out.println("Am.......");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando al local de los futbolistas");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando manos...");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Viendo el partido");
    }
}

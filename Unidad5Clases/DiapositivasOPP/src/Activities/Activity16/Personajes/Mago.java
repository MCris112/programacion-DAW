package Activities.Activity16.Personajes;

import Activities.Activity16.Personaje;

public class Mago extends Personaje {

    public Mago() {
    }

    public Mago(String nombre, int atk, int def, int vida) {
        super(nombre, atk, def, vida);
    }

    @Override
    public void atacar(Personaje personaje) {
        System.out.println("ATAQUE MAGICO!!!!");
        super.atacar(personaje);
    }
}

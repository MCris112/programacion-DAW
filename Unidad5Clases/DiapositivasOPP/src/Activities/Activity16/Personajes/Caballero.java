package Activities.Activity16.Personajes;

import Activities.Activity16.Personaje;

public class Caballero extends Personaje {

    public Caballero() {
    }

    public Caballero(String nombre, int atk, int def, int vida) {
        super(nombre, atk, def, vida);
    }

    @Override
    public void atacar(Personaje personaje) {
        System.out.println("Caballero atacando con su espada");
        super.atacar(personaje);
    }
}

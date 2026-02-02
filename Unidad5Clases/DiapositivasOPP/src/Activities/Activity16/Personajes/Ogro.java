package Activities.Activity16.Personajes;

import Activities.Activity16.Personaje;

public class Ogro extends Personaje {

    public Ogro() {
    }

    public Ogro(String nombre, int atk, int def, int vida) {
        super(nombre, atk, def, vida);
    }

    @Override
    public void atacar(Personaje personaje) {
        System.out.println("El Ogro ataca");
        super.atacar(personaje);
    }
}

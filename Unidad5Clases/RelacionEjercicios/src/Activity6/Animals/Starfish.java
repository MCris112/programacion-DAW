package Activity6.Animals;

import Activity6.Invertebrates.Echinodermata;

public class Starfish extends Echinodermata {

    public Starfish() {
        super("Estrella de mar", "Fondos marinos", false);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " no hace sonidos");
    }

    @Override
    public void eat() {
        System.out.println(name + " saca estómago por fuera para digerir");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " se fragmenta y regenera (asexual)");
    }
}

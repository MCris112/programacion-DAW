package Activity6.Animals;

import Activity6.Vertebrates.Amphibian;

public class Frog extends Amphibian {

    public Frog() {
        super("Rana", "Pantanos", false);
    }

    @Override
    public void move() {
        System.out.println(name + " salta y nada");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": ¡Croac croac!");
    }

    @Override
    public void eat() {
        System.out.println(name + " come insectos con lengua pegajosa");
    }
}

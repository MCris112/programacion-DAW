package Activity6.Animals;

import Activity6.Invertebrates.Mollusk;

public class Octopus extends Mollusk {

    public Octopus() {
        super("Pulpo común", "Océanos profundos", false);
    }

    @Override
    public void move() {
        System.out.println(name + " nada con 8 tentáculos (jet propulsion)");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " no hace sonidos (comunica con colores)");
    }

    @Override
    public void eat() {
        System.out.println(name + " atrapa cangrejos con brazos succionadores");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " pone miles de huevos y la hembra muere cuidándolos");
    }

}

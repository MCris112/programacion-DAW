package Activity6.Animals;

import Activity6.Vertebrates.Mammal;

public class Dog extends Mammal {

    public Dog() {
        super("Perro doméstico", "Casas y calles", false);
    }

    @Override
    public void move() {
        System.out.println(name + " corre rápido con 4 patas");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": ¡Guau guau guau!");
    }

    @Override
    public void eat() {
        System.out.println(name + " come croquetas, carne o huesos");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " da a luz cachorros vivas (vivíparo)");
    }

}

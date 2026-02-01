package Activity6.Animals;

import Activity6.Vertebrates.Reptile;

public class Snake extends Reptile {

    public Snake() {
        super("Víbora", "Desiertos", false);
    }

    @Override
    public void move() {
        System.out.println(name + " repta ondulando cuerpo");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": ¡Ssssss!");
    }

    @Override
    public void eat() {
        System.out.println(name + " traga presas enteras");
    }
}

package Activity6.Animals;

import Activity6.Vertebrates.Bird;

public class Eagle extends Bird {

    public Eagle() {
        super("Águila real", "Montañas y cielos", true);  // Amenazada
    }

    @Override
    public void move() {
        System.out.println(name + " vuela alto y planea con alas anchas");
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": ¡Kiii kiii! (chillido agudo)");
    }

    @Override
    public void eat() {
        System.out.println(name + " caza con garras serpientes y conejos");
    }


}

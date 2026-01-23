package Activity6;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public abstract void eat();

    public abstract void move();

    public abstract void sleep();
}

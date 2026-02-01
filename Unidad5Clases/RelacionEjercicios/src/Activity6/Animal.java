package Activity6;

public abstract class Animal {

    protected String name;
    protected String habitat;
    protected boolean isEndangered;

    public Animal(String name, String habitat, boolean isEndangered) {
        this.name = name;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    // Metodos que pueden cambiar por animal
    abstract public void move();
    abstract public void makeSound();
    abstract public void eat();
    abstract public void reproduce();

    // Métodos que existe en cada animal
    public void breathe() {
        System.out.println(name + " respira oxígeno");
    }

    public void sleep() {
        System.out.println(name + " duerme para recuperar energía");
    }

    public void print() {
        System.out.printf("%s | Hábitat: %s | %s\n",
                name, habitat, isEndangered ? "EN PELIGRO" : "No amenazado");
    }
}

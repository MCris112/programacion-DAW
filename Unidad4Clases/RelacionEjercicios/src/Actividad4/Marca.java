package Actividad4;

public class Marca {

    private int id;

    private String string;

    public Marca()
    {
    }

    public Marca(int id, String string) {
        this.id = id;
        this.string = string;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", string='" + string + '\'' +
                '}';
    }
}

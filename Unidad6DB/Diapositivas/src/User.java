import DB.Model;

public class User extends Model {

    protected int id;
    protected String nombre;

    @Override
    public String getTableName() {
        return "personas";
    }

    /**
     * Si está null, cogera el valor de las variables de entorno
     * @return
     */
    public String getDatabaseName()
    {
        return null;
    }

    @Override
    public User newModel() {
        return new User();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }
}

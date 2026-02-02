import DB.Model;

public class User extends Model {

    @Override
    public String getTableName() {
        return "persona";
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
}

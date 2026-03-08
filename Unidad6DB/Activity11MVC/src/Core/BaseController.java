package Core;

import Views.BaseView;

public abstract class BaseController {

    public BaseView view = new BaseView();

    /**
     * Obtener el nombre para el menu
     * @return
     */
    abstract public String getName();

    /**
     * Mostrar lista de todo
     */
    abstract public void index();

    /**
     * Guardar un nuevo dato
     */
    abstract public void store();

    /**
     * Mostrar un solo elemento
     */
    abstract public void show();

    /**
     * Actualizar algun item
     */
    abstract public void update();


    /**
     * Eliminar algun item
     */
    abstract public void delete();
}

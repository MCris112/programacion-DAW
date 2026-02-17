import Core.Service;
import Models.Alumno;
import Views.BaseView;
import com.darkredgm.querymc.Collections.MCList;
import com.darkredgm.querymc.Database.Model;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {

    static Scanner sc = new Scanner(System.in);
    private BaseView view = new BaseView();

    public void index(Class<? extends Model> clazz)
    {
       try{
           MCList<?> models =  QueryBuilder.use(clazz).get();

           this.view.table(models);
       }catch (SQLException e)
       {

       }
    }

    public void store(Class<? extends Model> clazz)
    {
        this.view.fillModel(clazz);
    }

    public void update(Class<? extends Model> clazz)
    {
        Model model = Service.update(clazz);

        if ( model != null )
        {
            this.view.show(model);
        }
    }


    public void show(Class<? extends Model> clazz)
    {
        Model model = Service.getModel(clazz);

        if ( model != null )
        {
            this.view.show(model);
        }
    }

    public <M extends Model> void delete(Class<M> clazz)
    {
        M model = Service.getModel( clazz );

        if ( model == null )
        {
            System.out.println("--- CANCELANDO ELIMINACIÓN ---");
            return;
        }

        System.out.println("Seguro que deseas eliminar? (SI)");

        if ( sc.nextLine().equalsIgnoreCase("SI") )
        {
            QueryBuilder.use(clazz).where(model.getKeyName(), model.getKeyValue());
            return;
        }

        System.out.println("--- SE CANCELO LA ELIMINACIÓN ---");
    }
}

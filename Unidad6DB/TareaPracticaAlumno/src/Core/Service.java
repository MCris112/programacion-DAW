package Core;

import com.darkredgm.querymc.Annotations.DBColPrimary;
import com.darkredgm.querymc.Database.Model;
import com.darkredgm.querymc.Database.ModelAttribute;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;
import com.darkredgm.utilitiesmc.MC;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Scanner;

public class Service {

    static Scanner sc = new Scanner(System.in);


    public static <M extends Model> M getModel( Class<M> modelClass )
    {
        Field pk = null;

        for (Field field : modelClass.getDeclaredFields()) {
            if ( field.isAnnotationPresent(DBColPrimary.class))
            {
                pk = field;
            }
        }

        if ( pk == null )
        {
            MC.title.outlineY("No se puede procesar");
            return null;
        }

        System.out.printf("Ingrese el [%s] para buscar %s%n", pk.getName(), modelClass.getSimpleName());

        try{
            M m = modelClass.getConstructor().newInstance();

            M model = QueryBuilder.use(modelClass).where(m.getKeyName(), Integer.parseInt(sc.nextLine())).first();

            if ( model == null ){
                MC.title.outlineY("[404] - No se pudo encontrar");
                return null;
            }

            return model;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }catch (NumberFormatException e){
            MC.title.outlineY("[ERR] Coloca un numero válido");

        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        return getModel(modelClass);
    }

    public static <M extends Model> M update( Class<M> modelClass )
    {
        M model = getModel( modelClass );

        if ( model == null )
        {
            System.out.println("--- CANCELANDO ACTUALIZACIÓN ---");
            return null;
        }

        try{
            for ( ModelAttribute attr: model.getFieldAttributes())
            {
                System.out.printf("¿Cual es el nuevo valor para [%s]?%n", attr.getName());
                String line = sc.nextLine();

                if ( !line.isEmpty() )
                    model.setAttribute( attr.getName(), line );
            }

            model.save();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return model;
    }

}

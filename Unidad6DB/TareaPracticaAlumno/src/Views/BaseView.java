package Views;

import com.darkredgm.querymc.Collections.MCList;
import com.darkredgm.querymc.Database.Model;
import com.darkredgm.querymc.Database.ModelAttribute;
import com.darkredgm.utilitiesmc.MC;
import com.darkredgm.utilitiesmc.Table;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseView {

    public <M extends Model> void table(MCList<M> models )
    {
        if ( models.isEmpty() )
        {
            MC.title.outlineY("No hay datos por mostrar");
            return;
        }

        Table table = new Table();

        List<ModelAttribute> attributes = models.get(0).getFieldAttributes();

        ArrayList<String> headers = new ArrayList<>();

        for ( ModelAttribute attribute : attributes )
        {
            headers.add(attribute.getName());
        }

        table.addRow(headers);

        for ( Model m : models )
        {
            ArrayList<String> rows = new ArrayList<>();

            for ( String attribute : headers )
            {
                try{
                    rows.add( m.getAttribute(attribute).toString() );
                } catch (IllegalAccessException e) {
                    rows.add("ERR!");
                }
            }

            table.addRow(rows);
        }

        table.print();
    }


    public <M extends Model> void fillModel( Class<M> modelClass )
    {
        Scanner scanner = new Scanner( System.in );

        try{
            // Se crea una nueva clase del modelo
            M model = (M)  modelClass.getConstructor().newInstance();

            // Obtiene todos los atributos del modelo que están vinculados con la base de datos
            for ( ModelAttribute attribute: model.getFieldAttributes() )
            {
                System.out.println("Inserte el valor ["+attribute.getName()+"]:");

                String line = scanner.nextLine();

                // Verificar los casos especiales porque tira error según el tipo que sea distinto
                if ( !line.isEmpty() )
                {
                    if ( attribute.asField().getType() == Integer.class || attribute.asField().getType() == int.class )
                    {
                        model.setAttribute(attribute.asField().getName(), Integer.parseInt(line));
                    }else if ( attribute.asField().getType() == Boolean.class || attribute.asField().getType() == boolean.class )
                    {
                        model.setAttribute(attribute.asField().getName(), Boolean.parseBoolean(line));
                    } else if (attribute.asField().getType() == double.class || attribute.asField().getType() == Double.class) {
                        model.setAttribute(attribute.asField().getName(), Double.parseDouble(line));
                    } else {
                        model.setAttribute( attribute.getName(), line );
                    }
                }
            }

            model.save();

            MC.title.outlineY("Se guardo correctamente");
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
            MC.title.outlineY("ERROR DE CREACION DE MODELO");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            MC.title.outlineY("SQL ERROR", e.getMessage() );
            throw new RuntimeException(e);
        }
    }

    public void show( Model model )
    {
        MCList<Model> models = new MCList<>();
        models.add(model);
        this.table( models );
    }
}

package Utilities;

import com.darkredgm.querymc.Database.Model;
import com.darkredgm.querymc.Database.ModelAttribute;

import java.util.List;

public class ModelHelper {

    public static void show(List<Model> models )
    {
        for (Model m : models)
        {
            System.out.println("\n".repeat(5));

            show(m);
        }
    }

    public static void show(Model model)
    {
        try{
            Table table =  Table.instance().addRow(model.getClass().getSimpleName() );

            TableRow header = new TableRow();
            TableRow values = new TableRow();
            table.addRow( header );
            table.addRow( values );

            for (ModelAttribute attr: model.getFieldAttributes())
            {
                header.addColumn( attr.getName() );
                values.addColumn( attr.getValue().toString() );
            }

            table.print();
        } catch (IllegalAccessException e) {
            MC.title.outlineY("No se pudo procesar el modelo");
            System.out.println(e.getMessage());
        }
    }
}

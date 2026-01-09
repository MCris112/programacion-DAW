package Activities.Activity7;

import Utilities.Table;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Activity7 {

    static void main() {
        try
        {
            Object obj = new JSONParser().parse( new FileReader("src/heroes.json") );

            JSONArray data = (JSONArray) obj;

            Table table = Table.instance()
                    .addRow("Super Hero", "Alter Ego");

            for ( Object item: data)
            {
                JSONObject object = (JSONObject) item;

                if ( ((String) object.get("publisher")).contains("Marvel") )
                {
                    table.addRow(
                            (String) object.get("superhero"),
                            (String) object.get("alter_ego")
                    );
                }
            }

            table.print();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado");
        } catch (ParseException e) {
            System.out.println("El JSON insertado no es válido");
        } catch (Exception e) {
            System.out.println("Algo sucedio");
        }
    }
}

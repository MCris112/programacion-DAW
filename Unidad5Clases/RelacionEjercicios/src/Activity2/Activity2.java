package Activity2;

import Utilities.Table;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 2. Lee el fichero heroes.json para obtener un formato tabla de salida con la información los héroes
 * de DC cuyo superhero empieza por ‘G’.
 */
public class Activity2 {

    static void main() {

        JSONParser parser = new JSONParser();

        // Headers de la tabla
        Table table = Table.instance()
                .addRow("DC Comics")
                .addRow("Superhero", "Alter Ego", "First Appearance", "characters");

        try{
            Object obj = parser.parse( new FileReader("src/Activity2/heroes.json") );

            JSONArray heroes = (JSONArray) obj;

            for ( Object item: heroes ) {
                JSONObject hero = (JSONObject) item;

                if (
                        ((String) hero.get("superhero") ).startsWith("G") // Si el superhero comienza con G
                        &&
                        ( (String) hero.get("publisher") ).startsWith("DC") // Si el publisher es DC
                )
                {
                    table.addRow(
                            (String) hero.get("superhero"),
                            (String) hero.get("alter_ego"),
                            (String) hero.get("first_appearance"),
                            (String) hero.get("characters")
                    );
                }
            }

        } catch (ParseException e) {
            System.out.println("Error parsing heroes.json");
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: heroes.json");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        table.print(); // mostrar tabla
    }
}

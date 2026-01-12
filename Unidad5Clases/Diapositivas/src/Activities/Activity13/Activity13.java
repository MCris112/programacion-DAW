package Activities.Activity13;

import Utilities.MC;
import Utilities.Table;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * Actividad tipo examen: A partir del fichero heroes.json, vamos a:
 * – Leer el fichero para obtener su JSONArray
 * – Crear un Map<String, List<Heroe>> como HashMap
 * – Mientras se recorren los héroes:
 * ● Se obtendrá su nombre y editorial y se creará el Heroe
 * ● Se creará un nuevo par clave-valor si no existe la clave
 * ● Se añadirá el héroe a la lista correspondiente por clave
 * – Se imprimen las listas de héroes de cada editorial por clave
 */
public class Activity13 {

    static Map<String, List<Heroe>> db = new HashMap<>();

    static void main() {
        try (Reader reader = new FileReader("src/heroes.json")) {
            Object content = new JSONParser().parse( reader );

            JSONArray data = (JSONArray) content;
            for ( Object obj: data)
            {
                JSONObject item = (JSONObject) obj;

                addHero(
                        new Heroe(
                                (String) item.get("superhero"),
                                (String) item.get("publisher"),
                                (String) item.get("alter_ego"),
                                (String) item.get("first_appearance"),
                                (String) item.get("characters")
                        )
                );
            }
        } catch (IOException e) {
            MC.title.outlineY("Algo paso...");
            return;
        } catch (ParseException e) {
            MC.title.outlineY("El JSON no es valido");
            return;
        }

        showMenu();
    }

    public static void addHero( Heroe heroe)
    {
        // Añadir en caso no exista
        db.computeIfAbsent( heroe.publisher, k -> new ArrayList<>()).add(heroe);
    }

    public static void showMenu()
    {
        Table.instance()
                .addRow("Opciones")
                .addRow("1", "Mostrar datos")
                .addRow("0", "Salir")
                .print();

        Scanner sc = new Scanner(System.in);

        try{
            switch ( Integer.parseInt(sc.nextLine()) )
            {
                case 1: showData(); break;
                case 0:
                    MC.title.outlineY("Muchas Gracias");
                    return;
                default: System.out.println("Opción incorrecta, intente de nuevo"); break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Opción incorrecta, intente de nuevo");
        }

        showMenu();
    }

    public static void showData()
    {
        db.forEach( (publisher, heroes) -> {
            Table table = Table.instance();
            table.addRow(publisher).addRow("Superhero", "Publisher", "Alter Ego", "First Appearance", "Characters");

            for (Heroe hero: heroes )
            {
                table.addRow(
                        hero.getSuperhero(),
                        hero.getPublisher(),
                        hero.getAlterEgo(),
                        hero.getFirstAppearance(),
                        hero.getCharacter()
                );
            }

            table.print();

            System.out.println();
        });

    }
}

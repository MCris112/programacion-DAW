package Activity3;

import Utilities.Table;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 3. Crea un programa que lea el siguiente formato JSON y muestre por cada alumno la media actual
 * y en un HashMap<String,Integer>, cuántos suspensos, aprobados, notable y sobresalientes tenemos.
 * {
 *  "curso": "DAW",
 *  "alumnos": [
 *  {
 *  "nombre": "Juan",
 *  "notas": [7, 8, 9]
 *  },
 *  {
 *  "nombre": "Ana",
 *  "notas": [8, 9, 10]
 *  },
 *  {
 *  "nombre": "Pedro",
 *  "notas": [4, 6, 3]
 *  }
 *  ]
 * }
 */
public class Activity3 {

    static void main() {

        Map<String, Integer> db = new HashMap<>();

        // Dejar los valores por defecto
        db.put("Suspenso", 0);
        db.put("Aprobado", 0);
        db.put("Notable", 0);
        db.put("Sobresaliente", 0);

        try {
            JSONParser parser = new JSONParser();

            JSONObject data = (JSONObject) parser.parse( new FileReader("src/Activity3/data.json") ) ;

            for ( Object item : (JSONArray) data.get("alumnos") )
            {
                JSONObject alumno = (JSONObject) item;

                int media = 0;
                JSONArray notas = (JSONArray) alumno.get("notas");

                // Iterar en todas las notas
                for ( Object numItem : notas )
                {
                    media += (Long) numItem;
                }

                String status = getScoreStatusKey(media / notas.size());

                db.put(
                        status, // Obtener el nombre
                        db.get(status)+1
                );
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Mostrar los resultados en la consola
        Table table = Table.instance()
                .addRow("Estado", "Cantidad");

        for ( String key : db.keySet() )
        {
            table.addRow( key, db.get(key) + "" );
        }

        table.print();
    }

    public static String getScoreStatusKey( int nota )
    {
        if (nota >= 5 && nota < 7) {
            return "Aprobado";
        }

        if (nota >= 7 && nota < 9) {
            return "Notable";
        }

        if (nota >= 9) {
            return "Sobresaliente";
        }

        return "Suspenso";
    }
}

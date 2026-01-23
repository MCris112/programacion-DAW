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

                db.put(
                        (String) alumno.get("nombre"), // Obtener el nombre
                        media / notas.size() // calcular la media
                );
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        Table table = Table.instance()
                .addRow("Nombre", "Nota Final", "Estado");

        int suspensos = 0, aprovados = 0, notables = 0, sobresalientes = 0;

        for (Map.Entry<String, Integer> entry : db.entrySet()) {
            int nota = entry.getValue();

            // suspensos, aprobados, notable y sobresalientes
            String eval = "Suspenso";
            if (nota >= 5 && nota < 7) {
                eval = "Aprobado";
                aprovados +=1;
            } else if (nota >= 7 && nota < 9) {
                eval = "Notable";
                notables++;
            } else if (nota >= 9) {
                eval = "Sobresaliente";
                aprovados++;
            }else{
                suspensos++;
            }

            table.addRow( entry.getKey(), nota+"", eval );
        }

        table.print();

        Table.instance()
            .addRow("Estadistica")
            .addRow("Estado", "Totales")
            .addRow("Suspenso", String.valueOf(suspensos))
            .addRow("Aprobados", String.valueOf(aprovados))
            .addRow("Notables", String.valueOf(notables))
            .addRow("Sobresalientes", String.valueOf(sobresalientes))
                .print();
    }
}

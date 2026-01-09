package EnClase.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class PruebaJson {

    static void main() {
        // Lectura del contenido del fichero JSON
        try {
            Object ob = new JSONParser().parse(new FileReader("src/EnClase/Json/domingo.json"));

            // Convertir objeto a JSON y procesarlo
            JSONObject js = (JSONObject) ob;
            String firstName = (String) js.get("firstName");
            String lastName = (String) js.get("lastName");
            System.out.println("First name is: " + firstName);
            System.out.println("Last name is: " + lastName);
            JSONArray arr = (JSONArray) js.get("phoneNumbers");
            for (Object item : arr) {
                JSONObject data = (JSONObject) item;
                String post_id = (String) data.get("phone-number");
                System.out.println(post_id);
            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        } catch (ParseException e) {
            System.out.println("El archivo JSON no es válido");
        }
    }
}

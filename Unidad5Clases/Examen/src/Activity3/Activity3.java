package Activity3;

import Utilities.MC;
import Utilities.Table;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 3. Se desea desarrollar un programa en Java que permita buscar sinónimos en español a partir de un
 * diccionario español-inglés. Para ello, se utilizará una estructura de datos HashMap<String, String>
 * donde: (2 puntos)
 * • La clave será una palabra en español.
 * • El valor será su traducción al inglés.
 * El programa irá pidiendo palabras en español y dará la palabra en inglés si está o no en otro caso o
 * Salir en otro caso para finalizar la ejecución.
 * Contenido básico del diccionario:
 *
 * TABLA[...]
 *
 * Ejemplo: Si por teclado le escribes “caliente”, te dará: “En inglés la palabra es hot”. Si le escribes
 * “oro”, te dará: “Palabra no encontrada en el diccionario”
 */
public class Activity3 {

    static Map<String, String> diccionario = new HashMap<String, String>();

    static void main() {
        loadData();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su palabra a buscar:");

        String palabra = sc.nextLine();

        if (diccionario.containsKey(palabra.toLowerCase())) {
            MC.title.outlineY("En inglés la palabra es", diccionario.get(palabra.toLowerCase()));
        }else{
            MC.title.outlineY("Palabra no encontrada en el diccionario");
        }
    }

    public static void loadData()
    {
        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");
    }
}

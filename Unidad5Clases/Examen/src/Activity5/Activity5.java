package Activity5;

import Utilities.MC;

/**
 * Responder
 */
public class Activity5 {
    static void main() {

        MC.title.outline("¿Cuándo puede interesarnos crear una clase abstracta?");

        System.out.println(
                "Nos puede interesar usar una clase abstracta cuando se requiere heredar alguna funcionalidad, " +
                        "siendo el mismo objeto al que se esta referenciando " +
                        "Cuando ciertos atributos o funcionalidades por defecto se requiere usar en otras clases " +
                        "Tales como un producto, puede ser fisico o virtual, ambos siguen siendo productos, ambos tienen los mismos atributos base "+
                        "tienen la function, pero uno tiene para hacer envio y otro para descargar"
        );

        MC.title.outline("¿Y una clase interfaz?");

        System.out.println(
                "Una clase interfaz nos interesa caundo se requiere que ciertas clases tengan la misma funcion pero implementarla de manera distinta " +
                        "Tal como ejemplo: Se tiene distintos tipos de envio, CorreosExpress, GPL, InPost, todos tienen la funcion enviar, empacar, trakear, pero cada uno lo implementa de manera distinta"
        );
    }
}

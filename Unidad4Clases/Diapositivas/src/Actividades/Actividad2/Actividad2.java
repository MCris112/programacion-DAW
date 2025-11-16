package Actividades.Actividad2;

/**
 * Crea las clases en JAVA con sus correspondientes
 * constructores y funciones necesarias para mostrar información y
 * modificar los atributos del siguiente diagrama de clases
 */
public class Actividad2 {
    static void main() {
        Fecha fecha = new Fecha(10, 8, 2003);
        Ciudad nacimiento = new Ciudad(1, "Callao", 23);
        Ciudad residencia = new Ciudad(2, "Lima", 23);

        Persona person = new Persona(
                "2388344HG",
                "Cristopher",
                "Quiñones",
                'M'
        );

        person.setFecha(fecha);
        person.setNacimiento(nacimiento);
        person.setResidencia(residencia);

        person.show();
    }
}

package Activities.Activity9;

/**
 * Actividad 2: Realiza un método genérico que localiza un elemento a
 * buscar en el array o devuelva -1 si no lo encuentra
 */
public class Activity9 {

    static void main() {

        String[] nombres = { "Aurora", "Nicolas", "Margio", "Maria" };
        Integer[] numeros = {1, 2, 3, 4};

        System.out.println( searchIndexIn(nombres, "Nicolas") );
    }

    public static <T> int searchIndexIn(T[] array, T find)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals( find )) {
                return i;
            }
        }
        return -1;
    }
}

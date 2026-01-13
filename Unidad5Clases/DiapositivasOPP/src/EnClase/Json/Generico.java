package EnClase.Json;

public class Generico {

    static void main() {

        Double[] decimales = {1.3, 3.6, 4.6 };
        String[] data = {"hola", "test"};

        imprimirArray( decimales );
    }

    public static <T> void imprimirArray( T[] array )
    {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

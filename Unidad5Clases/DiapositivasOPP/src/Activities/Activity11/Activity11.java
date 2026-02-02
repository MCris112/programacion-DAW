package Activities.Activity11;

/**
 * Actividad: Realiza una clase genérica que
 * simule el comportamiento de una pila. Crea las
 * operaciones de insertar, borrar, buscar, devolver,
 * estaVacia y sobrecarga toString utilizando la
 * clase ArrayList.
 */
public class Activity11 {

    static void main() {
        Pila<Integer> pila = new Pila<>();

        if ( pila.estaVacia() )
        {
            System.out.println("Pila vacia");
        }

        pila.insertar(10);
        pila.insertar(20);
        pila.insertar(5);

//        pila.borrar(20);

        System.out.println(pila);
    }
}

package Activities.Activity16;

/**
 * Actividad 2: Vamos a desarrollar un RPG basado en la
 * actividad del tema 4 donde tenemos la clase Personaje con
 * atributos (nombre, vida) y las funciones (estaVivo,
 * recibirDaño y atacar). Las clases hijas implementan la
 * función abstracta atacar ya que cada uno hace un daño
 * aleatorio por el arma que usa. Haz uso de las clases en una
 * batalla con ArrayList hasta que una quede vacía.
 */
public class Activity16 {

    static void main() {

        // En este caso reutilize toda la practica anterior y la adapte con las clases de herencia con personaje de mago, caballero, ogro, y algunos cambios menores
        // en el codigo
        // espero este correcto ya que ese dia falte por trabajo, que me fui desde el miercoles hasta domingo

        Batalla batalla = new Batalla();

        // Mostrar el menu principal
        batalla.showMenu();

        // Nota para Cristopher del futuro:
        // Este proyecto estuvo interesante en su momento, que se grabo un video de presentar de tarea, buscalo en tu canal de youtube por si no lo recuerdas
        // En su momento pensaste algo mejor de este proyecto, pero ahora que lo volvi a ver, como que no era necesario tanta herencia mas que para el personaje
        // en fin, ガンバテ
    }
}

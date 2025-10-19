package Activity;

import Utilities.MC;
import Utilities.Table;

import java.util.Scanner;

/**
 * 4. Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas
 * que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un
 * número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media
 * sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se
 * califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la
 * recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso
 * contrario, se mantiene la nota media anterior.
 *
 * LEE nota1, nota2
 * SI media(nota1, nota2) >= 5 ENTONCES
 *  MOSTRAR "aprovado"
 *  MOSTRAR media
 *
 *  SI media(nota1, nota2) < 5 ENTONCES
 *      LEER esApto?
 *
 *      SI esApto = si ENTONCES Mostrar "Nota es 5"
 *      SINO MantenerNota anterior
 */
public class Activity4 {

    static void main() {
        MC.printBanner();
        MC.title.outline("Calculador de notas");

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte Nota 1:");
        int nota1 = sc.nextInt();

        System.out.println("Inserte Nota 2:");
        int nota2 = sc.nextInt();

        if ( media(nota1, nota2) >= 5) {
            MC.title.outline("¡ESTA APROVADO!", "Nota final: " , String.valueOf(media(nota1, nota2)) );
        }else{
            System.out.println("¿Cuál ha sido el resultado de la\n" +
                    "recuperación?");

            Table.instance()
                    .addRow("0", "No Apto")
                    .addRow("1", "Apto")
                    .print();

            System.out.print("Seleccione una opcion (0, 1): ");
            int opcion = sc.nextInt();
            int notaFinal = 0;

            switch (opcion) {
                case 0: notaFinal = media(nota1, nota2); break;
                case 1: notaFinal = 5; break;
            }

            MC.title.outline("Nota final: " , String.valueOf(notaFinal));
        }
    }

    static int media(int num1, int num2)
    {
        return (num1 + num2) / 2;
    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funciones {

    public static void main(String[] args) {

        //Uso de fechas JAVA
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println( hoy.toString() );
        System.out.println( hoy.getDayOfWeek() );

        //Tratamiento math
        System.out.println(Math.pow(2,8));

        //Numeor aleatorio
        int min = 1;
        int max = 15;
        int aleatorio = (int) (Math.random() * (max-min+1))+min;
        System.out.println("Aleatorio: "+ aleatorio );

        //Uso de funciones propias externas

        System.out.println( Matematicas.sumar(5,3));

        //Operaciones
        int valor = 1;
        //Guardar en memoria
        //valor = valor++; // 1, 2
        valor = ++valor; // 2, 3

        // No es lo mismo variable++ que ++variable
        System.out.println("Valor: "+ valor );
        valor = valor+1;
        System.out.println("Valor: "+ valor );

        //Expresiones relacionales
        System.out.println( 5>3 && 5>6);

        //Opera asigna
        int numero11 = 3, numero12 = 4;
        numero11 += numero12;
        System.out.println("Valor asignado: "+ numero11 );

        //Operador alternario
        int a = 3, b = 5;
        int x = a==10 ? b*2 : a;
        System.out.println("X: "+ x );
        System.out.println("|--------------------------------|");
        System.out.printf("| %-30s | \n", x);
        System.out.println("|--------------------------------|");
    }
}

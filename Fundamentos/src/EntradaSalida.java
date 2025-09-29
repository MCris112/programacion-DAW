import java.util.Scanner;

public class EntradaSalida {

    public static void main(String[] args) {
        // Instrucciones de salida por pantalla
        int valor = 7;

        System.out.println(valor);

        //Escribre con formato
        double precio = 130.345869;

        // %s = Cadena texto
        // %f = double
        System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d \n", "Tablet", precio, 3);

        // Incluir un icono
        System.out.println( "Que ganas tengo de unas vacaciones \u26F1");

        //Formato reciente system
        System.out.println("El precio del producto "+"tablet"+" tiene un valor de "+precio+" y se han comprado 3");

        // Formato salida texto
        System.out.printf( "%20s, %-15s", "Cristopher", "Informatico");
        System.out.println();

        //Formato tabal
        System.out.println( "|----------|----------|------------|");
        System.out.printf( "|%-10s|%-10s|%-12s|\n", "producto", "cantidad", "valor");
        System.out.println( "|----------|----------|------------|");
        System.out.printf( "|%-10s| %-9d| %3.6f " +
                "|\n", "Producto", valor, precio);
        System.out.println( "|----------|----------|------------|");

        System.out.println();

        System.out.println( "|----------|----------|------------|");
        System.out.println( "ºProducto  |Cantidad  |Valor       |");
        System.out.println( "|----------|----------|------------|");
        System.out.println( "|Producto  | "+valor+"        | "+precio+" |");
        System.out.println( "|----------|----------|------------|");

        //Introducir entrada por teclado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cadena de texto deseada: ");
        //int number = scanner.nextInt();

        //System.out.println("El numero introducido es: "+number);
//
//        System.out.println("Introduce: Nombre, Apellido, Edad, Profesion");
//
//        //Lee nombre
//        String nombre = scanner.next();
//        //Leer apellido
//        String apellido = scanner.next();
//        //Leer edad
//        int edad = scanner.nextInt();
//        //Leer profesion
//        String profesion = scanner.next();
//
//        System.out.println("El usuario se llama "+nombre+" "+apellido+" tiene: "+edad+" años y trabaja en: "+profesion);

            System.out.println("Introduce tu nombre");
            String nombre = scanner.nextLine();

            System.out.println("Introduce tu apellido: ");
            String apellido = scanner.nextLine();

            System.out.println("Introduce tu edad: ");
            int edad = scanner.nextInt();

            System.out.println("Introduce tu profesion: ");
            String profesion = scanner.nextLine();

            System.out.println("El usuario se llama "+nombre+" "+apellido+" tiene: "+edad+" años y trabaja en: "+profesion);



            scanner.close();
    }
}

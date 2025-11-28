import java.util.Scanner;

public class Dinamic {
    
    public static void main(String[] args) {
        int[] data = { 3, 2, 6, 8};
        // String[] nombres = { "Pepe", "Juan", "Ricolas", "Pedro"};
        String[] contactos;

        Scanner sc = new Scanner(System.in);


        System.out.println("Dime el tamaño de tus contactos");
        contactos = new String[ sc.nextInt() ];

        for (int i = 0; i < contactos.length; i++) {
            System.out.println("Nombre del contacto "+(i+1)+":");
            contactos[i] = sc.nextLine();
        }

        for (int i = 0; i < contactos.length; i++) {
            System.out.println("Contacto "+i+" : "+ contactos[i]);
        }
    }
}

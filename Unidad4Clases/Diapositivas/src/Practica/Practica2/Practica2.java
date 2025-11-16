package Practica.Practica2;

public class Practica2 {

    static void main() {
        Libro libro = new Libro( "123", "Isla del tesoro", 1979, 19.85);

        Editorial editorial = new Editorial(1, "Santillana", 1984);

        libro.print();
        editorial.imprimir();
    }
}

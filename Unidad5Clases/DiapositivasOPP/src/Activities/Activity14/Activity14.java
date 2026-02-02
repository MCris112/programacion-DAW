package Activities.Activity14;

import Utilities.Table;

import java.util.ArrayList;

/**
 * Realiza un programa que considere la clase padre Producto
 * (Atributos: id, nombre, precio y el método de precioFinal) y las clases
 * hijas ProductoFisico (Añade peso y coste de envío) y ProductoDigital
 * (Añade URL de descarga y tamaño en MB). En el caso de Producto físico,
 * se añadirá un 10% más si pesa más de 2Kg
 */
public class Activity14 {

    static void main() {

        // Crear ArrayList que simula el carrito
        ArrayList<Producto> carrito = new ArrayList<>();

        // Productos físicos
        ProductoFisico libro = new ProductoFisico("P001", "Libro Java", 25.0, 1.2, 4.99);
        ProductoFisico monitor = new ProductoFisico("P002", "Monitor 27in", 199.0, 5.5, 12.99);

        // Productos digitales
        ProductoDigital ebook = new ProductoDigital("D001", "Ebook React", 15.99, "http://ebook.com/react.pdf", 12.5);
        ProductoDigital videoCurso = new ProductoDigital("D002", "Curso Python", 49.99, "http://curso.com/python.zip", 850.0);

        // Agregar al carrito
        carrito.add(libro);
        carrito.add(monitor);
        carrito.add(ebook);
        carrito.add(videoCurso);

        // Mostrar en consola
        Table table = Table.instance().addRow("Tu carrito de compras");

        double total = 0;
        for (Producto producto : carrito) {
            table.addRow( producto.toString(), "€"+producto.getPrecio() );
            total += producto.precioFinal();
        }

        table.addRow("TOTAL", "€"+total);
        table.print();
    }
}

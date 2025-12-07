package Actividades.Actividad3;

/**
 * Actividad: Crea las clases en JAVA con sus correspondientes
 * constructores y funciones necesarias para mostrar información y
 * modificar los atributos del siguiente diagrama E-R
 */
public class Actividad3 {

    static void main() {
        Categoria categoria1 = new Categoria(1, "Madera");
        Categoria categoria2 = new Categoria(2, "Metal");

        Pieza pieza1 = new Pieza(1, "Palo", "Marron", 2.3);
        pieza1.setCategoria(categoria1);

        Pieza pieza2 = new Pieza(2, "Tablon", "Gris", 33.9);
        pieza2.setCategoria(categoria2);

        Proveedor p1 = new Proveedor(1, "CALLE GRANADA", "ALMERIA", "HUERCAL");

        //Suministra Palos
        Suministra sumistro1 = new Suministra();
        sumistro1.setPieza(pieza1);
        sumistro1.setProveedor(p1);
        sumistro1.setCantidad(3);
        sumistro1.setFecha("20/11/25");

        //Suministra tablones
        Suministra suministro2 = new Suministra();
        suministro2.setPieza(pieza2);
        suministro2.setProveedor(p1);
        suministro2.setCantidad(10);

        //Mostrar la relacion en consola
        System.out.println(sumistro1);

        System.out.println(suministro2);
    }
}

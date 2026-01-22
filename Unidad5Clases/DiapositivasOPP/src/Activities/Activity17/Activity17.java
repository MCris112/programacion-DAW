package Activities.Activity17;

/**
 * Pasar texto a clases
 */
public class Activity17 {

    static void main() {
        CajaFigura<Circulo> circulos = new CajaFigura<>();

        circulos.guardar( new Circulo(3) );
        circulos.guardar( new Circulo(9) );
        circulos.guardar( new Circulo(12.3) );

        circulos.mostrarContenido();

        circulos.calcularAreaTotal();

        CajaFigura<Rectangulo> rectangulos = new CajaFigura<>();

        rectangulos.guardar( new Rectangulo(32, 10) );
        rectangulos.guardar( new Rectangulo(3, 6) );
        rectangulos.mostrarContenido();
        rectangulos.calcularAreaTotal();

        System.out.println();
        System.out.println();

        CajaFigura<Figura> figuras = new CajaFigura<>();

        figuras.guardar( new Circulo(7) );
        figuras.guardar( new Rectangulo(10, 3) );
        figuras.mostrarContenido();
    }
}

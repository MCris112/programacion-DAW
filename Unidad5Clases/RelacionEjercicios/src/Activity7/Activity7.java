package Activity7;

/**
 * 7. Crea una clase abstracta Vehiculo con:
 * Atributo marca (String) y método arrancar() abstracto.
 * Método concreto frenar() que imprima “<marca> está frenando”.
 * Crea dos clases Coche y Moto que hereden de Vehiculo y sobreescriban arrancar().
 * En main, crea objetos de las clases Coche y Moto y llama a arrancar() y frenar() para ver el
 * resultado
 */
public class Activity7 {

    static void main() {
        Coche coche = new Coche("Mercedes");
        Moto moto = new Moto("Fiat");

        coche.arrancar();
        moto.arrancar();

        coche.frenar();
        moto.arrancar();
        moto.frenar();
    }
}

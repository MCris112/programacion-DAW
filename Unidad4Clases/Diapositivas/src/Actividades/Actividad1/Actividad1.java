package Actividades.Actividad1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *  Actividad: Crea las clase CuentaCorriente que tiene como atributos
 * una Persona (nombre, DNI, fechaNacimiento, dirección, género,
 * estado civil), el número de cuenta y su saldo. En ambas clases crea
 * sus correspondientes constructores y funciones necesarias para
 * mostrar información y modificar los valores de atributos. Haz uso de
 * ambas clases en otro fichero que tendrá el main.
 */
public class Actividad1 {

    static void main() {
        CuentaCorriente cuenta = new  CuentaCorriente();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Persona aurora = new Persona("Aurora", "72QUESO", LocalDate.parse("01/10/2003", fmt), "Calle Aguaimanto", Genero.FEMININO, EstadoCivil.SOLTERO);

        cuenta.setPersona(aurora);
        cuenta.setSaldo(303.30);

        cuenta.imprimir();
    }
}

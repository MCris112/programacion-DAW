package Actividades.Actividad1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

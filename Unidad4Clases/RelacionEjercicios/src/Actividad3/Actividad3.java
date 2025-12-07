package Actividad3;

/**
 * 3. Crea el proyecto que tenga las clases equivalentes de los siguientes diagramas E-R. En la clase
 * que incluya main puedes crear cada objeto con los valores que quieras pero tiene que verse la
 * relación entre ellas y su funcionamiento.
 */
public class Actividad3 {

    /**
     * NOTA PARA EL PROFESOR DOMINGO
     * ||||
     *
     * Aqui haria realmente un array list para asi porder obtener la tarjeta
     * junto con mas relaciones, asi hacerlo algo mas dinamico
     * pero me comento que sea asi super simple y que no importa que se repitan elementos
     * espero que sea como pidio y haya comprendido bien :")
     */
    static void main() {
        Sucursal sucursal1 = new Sucursal(101, "Av. Principal 123", "Almería");

        Cliente cliente1 = new Cliente(1, "Aurora", "Almería", "12345678A", "01/10/2003");
        cliente1.setSucursal(sucursal1);
        cliente1.setDescuento(10.5);
        cliente1.show();

        Tarjeta tarjeta1 = new Tarjeta("1111-2222-3333-4444", "PIDE+", "A1B2C3", "12/2026");
        tarjeta1.setCliente(cliente1);

        System.out.println( tarjeta1 );


        Domicilio domEmpleado = new Domicilio("Calle Granada", "Almería", 45);
        Empleado emp1 = new Empleado("E001", "87654321B", "Domingo", domEmpleado);
        emp1.addTelefono("600123456");
        emp1.addTelefono("950987654");

        Trabajos trabajo1 = new Trabajos(sucursal1, emp1, 3, "09:00 - 17:00");
        trabajo1.show();

        Fabrica fabrica1 = new Fabrica("30-12345678-9", "FabricaSur", "España", "Laura", 120);
        Producto producto1 = new Producto(501, "Mesa de madera", 89.99, Color.ROJO);
        producto1.setFabrica(fabrica1);

        producto1.show();
    }
}

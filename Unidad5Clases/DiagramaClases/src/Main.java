public class Main
{

    static void main() {
        Propietario aurora = new Propietario("354546x", "Aurora", "Lopez", "Calle Magnesio");

        Taller taller = new Taller("AuriMotors", "Calle Agunaldo 20", aurora);

        taller.addCliente( new Cliente("s3848345b", "Nicolas", "Asencio", "999393022" ) );

        Cliente nicolas = taller.getClientes().getFirst();

        nicolas.addVehiculo( new Coche("3344-ABC", "Ferrari", "AD2", 1200, 450) );
        nicolas.addVehiculo( new Moto("454-MOTO", "Audi", "23D", false) );

        System.out.println("Clientes de taller:");
        System.out.println("-------------");
        for ( Cliente cliente : taller.getClientes() )
        {
            System.out.println("Cliente: "+cliente.getNombre() );
        }
    }
}
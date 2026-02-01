package Activity5.Old;

import Utilities.MC;
import Utilities.MCBox;

import java.io.IOException;
import java.util.Scanner;

/**
 * 5. Implementa el control de acceso al área restringida de un programa. Se debe pedir por teclado un
 * nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa
 * dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se
 * agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
 * nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una
 * estructura de la clase HashMap leída de un fichero que tiene el formato línea a línea de usuario password.
 */
public class Activity5 {

    static Db db;
    static Scanner sc = new Scanner(System.in);

    static void main() {
        try
        {
           db = new Db();
        }catch (Exception ex)
        {
            MC.title.outlineY("DB ERR: Archivo no encontrado");
            return;
        }

        askCredentials();
    }

    public static void askCredentials()
    {
        MCBox box = new MCBox();

        box.add("Usuario:");
        System.out.println("Ingrese su usuario");
        String usuario = sc.nextLine();

        System.out.println("Ingrese su contraseña");
        String password = sc.nextLine();

        User user = db.getUser(usuario);
        if( user == null )
        {
            MC.title.outlineY("Credenciales no son correctos");

            return;
        }

        if ( user.getTries() >= 3 )
        {
            System.out.println("  ╔═══════╗");
            System.out.println("  ║  🔒   ║  Lo siento, no tiene acceso al área restringida");
            System.out.println("  ║       ║");
            System.out.println("  ╚═══════╝");
            return;
        }

        if ( !db.attempt(usuario, password) ) {
            MC.title.outlineY("Credenciales no son correctos");

            try{
                db.consumeTry( usuario );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            askCredentials();
            return;
        }

        MC.title.outlineY("Ha accedido al área restringida");
    }
}

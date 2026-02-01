package Activity5;

import Activity5.Old.Db;
import Activity5.Old.User;
import Utilities.MC;
import Utilities.MCBox;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 5. Implementa el control de acceso al área restringida de un programa. Se debe pedir por teclado un
 * nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa
 * dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se
 * agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
 * nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una
 * estructura de la clase HashMap leída de un fichero que tiene el formato línea a línea de usuario password.
 *
 * NOTA PARA PROFE: aqui dice usuarios, aunque me dijo que era solo un usuario
 */
public class Activity5 {

    static Scanner sc = new Scanner(System.in);

    static void main() {
        int tries = 0;

        String user = null, password = null;

        try{
            Scanner fileScanner = new Scanner( new FileReader("src/Activity5/db.txt") );

            if (fileScanner.hasNextLine()) {
                String[] line = fileScanner.nextLine().split("-"); // se guarda como user-password

                user = line[0];
                password = line[1];
            }
        } catch (FileNotFoundException e) {
            MC.title.outlineY("No se puede abrir el archivo");
            throw new RuntimeException(e);
        }


        boolean continuar = false;

        do{
            if ( tries >= 3 )
            {
                continuar = true;
            }else{
                System.out.println("Ingrese su usuario");

                if ( sc.nextLine().equals(user) )
                {

                    System.out.println("Ingrese su contraseña");
                    if( sc.nextLine().equals(password) )
                    {
                        continuar = true;
                    }else{
                        tries++;
                        System.out.println("Credenciales incorrectas. Intentos restantes: " + (3 - tries));
                    }
                }else{
                    tries++;
                    System.out.println("Credenciales incorrectas. Intentos restantes: " + (3 - tries));
                }
            }
        }while ( !continuar );

        if ( tries < 3 )
        {
            MC.title.outlineY("Ha accedido al área restringida");
        }else{
            System.out.println("  ╔═══════╗");
            System.out.println("  ║  🔒   ║  Lo siento, no tiene acceso al área restringida");
            System.out.println("  ║       ║");
            System.out.println("  ╚═══════╝");
        }
    }
}

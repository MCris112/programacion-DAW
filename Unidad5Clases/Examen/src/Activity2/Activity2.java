package Activity2;

import Utilities.MC;
import Utilities.Table;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Procesa el siguiente JSON para que en un menú muestre: (2,5 puntos)
 * 1- Número de empleados activos y cómo se llaman
 * 2- Número de empleados que tienen rol administrador
 * 3- Imprime los datos de la empresa (Nombre y dirección)
 * 4- Pregunte por un empleado y diga sus datos o muestre que no es empleado
 * {
 *  "empresa": "TechCorp",
 *  "empleados": [
 *  {
 *  "id": 1,
 *  "nombre": "Laura",
 *  "roles": ["admin", "backend"],
 *  "activo": true
 *  },
 *  {
 *  "id": 2,
 *  "nombre": "Pedro",
 *  "roles": ["frontend"],
 *  "activo": false
 *  },
 *  {
 *  "id": 3,
 *  "nombre": "Juan",
 *  "roles": ["frontend","admin"],
 *  "activo": true
 *  }
 *  ],
 *  "direccion": {
 *  "ciudad": "Barcelona",
 *  "pais": "España"
 *  }
 * }
 */
public class Activity2 {

    static Empresa empresa;
    static Scanner sc = new Scanner(System.in);

    static void main() {
        read();

        menu();
    }

    public static void menu()
    {
        Table.instance()
                .addRow("Menu")
                .addRow("1", "Usuarios Activos")
                .addRow("2", "Mostrar Administradores")
                .addRow("3", "Mostrar info de la empresa")
                .addRow("4", "Buscar empleado")
                .addRow("0", "Salir")
                .print();
        System.out.println("Seleccione una opción:");

        try{
            switch ( Integer.parseInt(sc.nextLine()) ) {
                case 0:
                    MC.title.outlineY("MUCHAS GRACIAS");
                    break;
                case 1: showActiveUsers(); break;
                case 2: showAdmins(); break;
                case 3: showCompanyInfo(); break;
                case 4: searchUser(); break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }catch(NumberFormatException e){
            System.out.println("Opción incorrecta, intente de nuevo");
        }

        menu();
    }

    public static void read()
    {

        JSONParser parser = new JSONParser();

        try{
            JSONObject data = (JSONObject) parser.parse(new FileReader("src/Activity2/data.json"));

            JSONObject direccion = (JSONObject) data.get("direccion");

            empresa = new Empresa(
                    (String) data.get("empresa"),
                    (String) direccion.get("ciudad"),
                    (String)  direccion.get("pais")
            );

            for ( Object object: (JSONArray) data.get("empleados") )
            {
                JSONObject empleado = (JSONObject) object;

                JSONArray rolesJson = (JSONArray) empleado.get("roles");

                String[] roles = new String[rolesJson.size()];
                for (int i = 0; i < rolesJson.size(); i++) {
                    roles[i] = (String) rolesJson.get(i);
                }

                empresa.getEmpleados().add(
                        new Empleado(
                                Integer.parseInt(String.valueOf((Long) empleado.get("id"))),
                                (String) empleado.get("nombre"),
                                roles,
                                (Boolean) empleado.get("activo")
                        )
                );
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showCompanyInfo()
    {
        Table.instance()
                .addRow("Nombre", empresa.getName() )
                .addRow("Direccion")
                .addRow("Ciudad", empresa.getCiudad() )
                .addRow("Pais", empresa.getPais() )
                .print();

        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void showActiveUsers() {
        Table table = Table.instance()
                .addRow("Usuarios Activos")
                .addRow("Id", "Nombre", "Roles"  );

        for (Empleado empleado : empresa.getEmpleados() )
        {
            if ( empleado.isActivo() )
            {
                table.addRow( "#"+empleado.getId(), empleado.getNombre(), Arrays.toString(empleado.getRoles()) );
            }
        }

        table.print();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void showAdmins()
    {
        Table table = Table.instance()
                .addRow("Usuarios Administradores")
                .addRow("Id", "Nombre", "Roles", "¿Está Activo?"  );

        for (Empleado empleado : empresa.getEmpleados() )
        {
            if ( empleado.isAdmin() )
            {
                table.addRow( "#"+empleado.getId(), empleado.getNombre(), Arrays.toString(empleado.getRoles()), empleado.isActivo() ? "SI" : "NO" );
            }
        }

        table.print();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void searchUser()
    {
        System.out.println("Escribe del empleado a buscar:");
        String nombre = sc.nextLine();

        boolean found = false;
        for ( Empleado empleado : empresa.getEmpleados() )
        {
            // Buscar el empleado sin importar es upper o lower case
            if ( empleado.getNombre().equalsIgnoreCase(nombre) )
            {
                found = true;
                System.out.println(empleado.getId());
                Table.instance()
                        .addRow("Empleado encontrado")
                        .addRow("Id", "Nombre", "Roles", "¿Está Activo?"  )
                        .addRow( "#"+empleado.getId(), empleado.getNombre(), Arrays.toString(empleado.getRoles()), empleado.isActivo() ? "SI" : "NO" )
                        .print();
            }
        }

        if ( !found )
        {
            MC.title.outlineY("No existe el empleado");
        }
    }
}

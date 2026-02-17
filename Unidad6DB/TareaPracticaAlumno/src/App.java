import Models.*;
import com.darkredgm.querymc.Database.Model;
import com.darkredgm.utilitiesmc.MC;
import com.darkredgm.utilitiesmc.Table;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public ArrayList<Class<? extends Model>> models;

    public App() {
        this.models = loadModels();
    }

    public void init() throws SQLException {
        this.showMenu();
    }

    /**
     * Muestra el menu principal de todos los modelos
     */
    public void showMenu()
    {
        Table table = Table.instance().addRow("Opcion", "Nombre");

        for (int i = 0; i < this.models.size(); i++) {
            table.addRow( i+1+"", this.models.get(i).getSimpleName() );
        }

        table.print();

        System.out.println("Seleccione una opción: ");

        if ( sc.hasNextInt() )
        {
            int opcion =  sc.nextInt() - 1;

            if (opcion < 0 || opcion >= this.models.size())
            {
                System.out.println("Opción no valida");
                System.out.println("\n".repeat(10));

            }else{
                // En caso que la opción sea correcta, mostrar el menu del modelo
                showModelMenu( this.models.get(opcion) );
                return;
            }


        }else{
            System.out.println("Opción no valida");
            System.out.println("\n".repeat(10));
        }

        sc.nextLine();

        showMenu();
    }

    /**
     * Mostrar el menu en base al modelo seleccionado
     * @param model
     */
    public void showModelMenu( Class<? extends Model> model )
    {
        // Mostrar todas los modelos principales como si fuera una api
        System.out.println("-".repeat(20));
        System.out.println("0 - Volver atrás " );
        System.out.println("1 - [GET]    api/"+model.getSimpleName() );
        System.out.println("2 - [POST]   api/"+model.getSimpleName() );
        System.out.println("3 - [SHOW]   api/"+model.getSimpleName()+"/[id]" );
        System.out.println("4 - [PUT]    api/"+model.getSimpleName()+"/[id]" );
        System.out.println("5 - [DELETE] api/"+model.getSimpleName() );
        System.out.println("-".repeat(20));

        // Cargar el controlador único para usarse
        Controller controller = new Controller();

        if ( sc.hasNextInt() ) {

            // Con base en la selección cargar lo que se necesita
            switch (sc.nextInt())
            {
                case 0: showMenu(); return; //Bloquear el showModelMenu final
                case 1: controller.index(model); break;
                case 2: controller.store(model); break;
                case 3: controller.show(model); break;
                case 4: controller.update(model); break;
                case 5: controller.delete(model); break;
                default:
                    MC.title.outlineY("OPCIÓN NO VÁLIDA");
                    break;
            }

        }else{
            MC.title.outlineY("COLOQUE UNA OPCIÓN CORRECTA");
        }

        sc.nextLine();

        // Al finalizar volver al bucle del menu del modelo
        showModelMenu(model);
    }


    /**
     * Cargar los modelos existententes en el folder de modelos
     * @return
     */
    public ArrayList<Class<? extends Model>> loadModels() {
        ArrayList<Class<? extends Model>> models = new ArrayList<>();
        models.add(Alumno.class);
        models.add(Practica.class);
        models.add(Profesor.class);
        models.add(ExamenTeorico.class);
        models.add(AlumnoHaceExamen.class);
        models.add(AlumnoRealizaPractica.class);
        models.add(ProfesorDisenaPractica.class);

        return models;
    }
}

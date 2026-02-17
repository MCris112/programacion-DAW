import Database.Migration;
import Models.Practica;
import Models.Profesor;
import com.darkredgm.querymc.Database.Model;
import com.darkredgm.utilitiesmc.MC;
import com.darkredgm.utilitiesmc.Table;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public ArrayList<Class<? extends Model>> models;

    public App() {
        this.models = loadModels();
    }

    //
//    ArrayList<BaseController> controllers = new  ArrayList<>();
//
    public void init() throws SQLException {
        Migration.load();


//        try{
//            loadControllers();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("\n".repeat(10));
//
        this.showMenu();
    }
//
//    public void loadControllers() throws IOException {
//        File controllersDir = new File("src/Controller");
//        if (!controllersDir.exists()) {
//            System.err.println("Directory not found: " + controllersDir.getAbsolutePath());
//            return;
//        }
//
//        URL[] urls = { controllersDir.toURI().toURL() };
//        URLClassLoader loader = new URLClassLoader(urls, Thread.currentThread().getContextClassLoader());
//
//        File[] classFiles = controllersDir.listFiles((dir, name) -> name.endsWith(".class") || name.endsWith(".java") );
//        System.out.println("Class files found: " + classFiles.length);
//
//        for (File cf : classFiles) {
//            String simpleName = cf.getName().replace(".class", "").replace(".java", "");
//            String fullClassName = "Controller." + simpleName;  // Adjust package if different
//
//            try {
//                Class<?> cls = loader.loadClass(fullClassName);
//                if (BaseController.class.isAssignableFrom(cls)) {
//                    BaseController instance = (BaseController) cls.getDeclaredConstructor().newInstance();
//                    controllers.add(instance);
//                    System.out.println("Loaded controller: " + fullClassName);
//                } else {
//                    System.out.println("Skipping non-BaseController: " + fullClassName);
//                }
//            } catch (ClassNotFoundException e) {
//                System.err.println("Class not found: " + fullClassName + " (check package/compile)");
//                e.printStackTrace();
//            } catch (Exception e) {  // Instantiation errors
//                System.err.println("Failed to instantiate: " + fullClassName);
//                e.printStackTrace();
//            }
//        }
//        loader.close();  // Good practice
//    }
//
    public void showMenu()
    {
        Table table = Table.instance().addRow("Opcion", "Nombre");

        for (int i = 0; i < this.models.size(); i++) {
            table.addRow( i+1+"", this.models.get(i).getSimpleName() );
        }

        table.print();

        System.out.println("Seleccione una opción: ");

        // TODO, ENTRA EN BUCLE CUANDO HAY ERROR
        if ( sc.hasNextInt() )
        {
            int opcion =  sc.nextInt() - 1;

            if (opcion < 0 || opcion >= this.models.size())
            {
                System.out.println("Opción no valida");
                System.out.println("\n".repeat(10));

            }else{
                showModelMenu( this.models.get(opcion) );
                return;
            }


        }else{
            System.out.println("Opción no valida");
            System.out.println("\n".repeat(10));
        }

        showMenu();
    }
//
    public void showModelMenu( Class<? extends Model> model )
    {
        System.out.println("-".repeat(20));
        System.out.println("1 - [GET] api/"+model.getSimpleName() );
        System.out.println("2 - [POST] api/"+model.getSimpleName() );
        System.out.println("3 - [SHOW] api/"+model.getSimpleName()+"/[id]" );
        System.out.println("4 - [PUT] api/"+model.getSimpleName()+"/[id]" );
        System.out.println("5 - [DELETE] api/"+model.getSimpleName() );
        System.out.println("-".repeat(20));

        Controller controller = new Controller();

        if ( sc.hasNextInt() ) {

            switch (sc.nextInt())
            {
                case 1: controller.index(model); break;
                case 2: controller.store(model); break;
                case 3: controller.show(model); break;
                case 4: controller.update(model); break;
                case 5: controller.delete(model); break;
                default:
                    MC.title.outlineY("OPCIÓN NO VÁLIDA");
                    break;
            }

            sc.nextLine();
        }else{
            MC.title.outlineY("COLOQUE UNA OPCIÓN CORRECTA");
        }

        showModelMenu(model);
    }


    public ArrayList<Class<? extends Model>> loadModels() {
        ArrayList<Class<? extends Model>> models = new ArrayList<>();
        models.add(Practica.class);
        models.add(Profesor.class);

        return models;
    }
}

import Core.BaseController;
import com.darkredgm.utilitiesmc.MC;
import com.darkredgm.utilitiesmc.Table;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    ArrayList<BaseController> controllers = new  ArrayList<>();

    public void init()
    {
        try{
            loadControllers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n".repeat(10));

        this.showMenu();
    }

    public void loadControllers() throws IOException {
        File controllersDir = new File("src/Controller");
        if (!controllersDir.exists()) {
            System.err.println("Directory not found: " + controllersDir.getAbsolutePath());
            return;
        }

        URL[] urls = { controllersDir.toURI().toURL() };
        URLClassLoader loader = new URLClassLoader(urls, Thread.currentThread().getContextClassLoader());

        File[] classFiles = controllersDir.listFiles((dir, name) -> name.endsWith(".class") || name.endsWith(".java") );
        System.out.println("Class files found: " + classFiles.length);

        for (File cf : classFiles) {
            String simpleName = cf.getName().replace(".class", "").replace(".java", "");
            String fullClassName = "Controller." + simpleName;  // Adjust package if different

            try {
                Class<?> cls = loader.loadClass(fullClassName);
                if (BaseController.class.isAssignableFrom(cls)) {
                    BaseController instance = (BaseController) cls.getDeclaredConstructor().newInstance();
                    controllers.add(instance);
                    System.out.println("Loaded controller: " + fullClassName);
                } else {
                    System.out.println("Skipping non-BaseController: " + fullClassName);
                }
            } catch (ClassNotFoundException e) {
                System.err.println("Class not found: " + fullClassName + " (check package/compile)");
                e.printStackTrace();
            } catch (Exception e) {  // Instantiation errors
                System.err.println("Failed to instantiate: " + fullClassName);
                e.printStackTrace();
            }
        }
        loader.close();  // Good practice
    }

    public void showMenu()
    {
        Table table = Table.instance().addRow("Opcion", "Nombre");

        for (int i = 0; i < this.controllers.size(); i++) {
            table.addRow( i+1+"", this.controllers.get(i).getName() );
        }

        table.print();

        System.out.println("Seleccione una opción: ");

        // TODO, ENTRA EN BUCLE CUANDO HAY ERROR
        if ( sc.hasNextInt() )
        {
            int opcion =  sc.nextInt() - 1;

            if (opcion < 0 || opcion >= controllers.size())
            {
                System.out.println("Opción no valida");
                System.out.println("\n".repeat(10));

            }else{
                showControllerMenu( controllers.get(opcion) );
                return;
            }


        }else{
            System.out.println("Opción no valida");
            System.out.println("\n".repeat(10));
        }

        showMenu();
    }

    public void showControllerMenu( BaseController controller )
    {
        System.out.println("-".repeat(20));
        System.out.println("1 - [GET] api/"+controller.getName() );
        System.out.println("2 - [POST] api/"+controller.getName() );
        System.out.println("3 - [SHOW] api/"+controller.getName()+"/[id]" );
        System.out.println("4 - [PUT] api/"+controller.getName()+"/[id]" );
        System.out.println("5 - [DELETE] api/"+controller.getName() );
        System.out.println("-".repeat(20));

        if ( sc.hasNextInt() ) {

            switch (sc.nextInt())
            {
                case 1: controller.index(); break;
                case 2: controller.store(); break;
                case 3: controller.show(); break;
                case 4: controller.update(); break;
                case 5: controller.delete(); break;
                default:
                    MC.title.outlineY("OPCIÓN NO VÁLIDA");
                    break;
            }

            sc.nextLine();
        }else{
            MC.title.outlineY("COLOQUE UNA OPCIÓN CORRECTA");
        }

        showControllerMenu(controller);
    }
}

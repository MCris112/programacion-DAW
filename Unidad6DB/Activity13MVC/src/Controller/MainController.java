package Controller;

import Core.Service;
import Models.Alumno;
import Models.Asignatura;
import Models.CursoEscolar;
import Models.Profesor;
import Views.MainView;
import com.darkredgm.querymc.Database.Model;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;
import com.darkredgm.utilitiesmc.MC;

import java.sql.SQLException;
import java.util.Scanner;

public class MainController {

    private final MainView view = new MainView();
    private final Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1 - Gestionar Alumnos");
            System.out.println("2 - Gestionar Asignaturas");
            System.out.println("3 - Gestionar Cursos Escolares");
            System.out.println("4 - Gestionar Profesores");
            System.out.println("0 - Salir");
            System.out.println("Seleccione una opción: ");

            if (sc.hasNextInt()) {
                int opcion = sc.nextInt();
                sc.nextLine(); // clear buffer

                if (opcion == 0)
                    break;

                switch (opcion) {
                    case 1 -> handleModelMenu(Alumno.class, "Alumnos");
                    case 2 -> handleModelMenu(Asignatura.class, "Asignaturas");
                    case 3 -> handleModelMenu(CursoEscolar.class, "Cursos Escolares");
                    case 4 -> handleModelMenu(Profesor.class, "Profesores");
                    default -> System.out.println("Opción no válida.");
                }
            } else {
                sc.next(); // Consume invalid input
                System.out.println("Opción no válida.");
            }
        }
    }

    private <M extends Model> void handleModelMenu(Class<M> modelClass, String title) {
        while (true) {
            System.out.println("-".repeat(20));
            System.out.println("Gestión de " + title);
            System.out.println("1 - [GET] Ver todos");
            System.out.println("2 - [POST] Crear nuevo");
            System.out.println("3 - [SHOW] Ver detalles por ID");
            System.out.println("4 - [PUT] Actualizar por ID");
            System.out.println("5 - [DELETE] Eliminar por ID");
            System.out.println("0 - Volver atrás");
            System.out.println("-".repeat(20));
            System.out.println("Seleccione una opción: ");

            if (sc.hasNextInt()) {
                int opcion = sc.nextInt();
                sc.nextLine(); // clear buffer

                if (opcion == 0)
                    break;

                try {
                    switch (opcion) {
                        case 1 -> view.table(QueryBuilder.use(modelClass).get());
                        case 2 -> view.fillModel(modelClass);
                        case 3 -> {
                            M model = Service.getModel(modelClass);
                            if (model != null)
                                view.show(model);
                        }
                        case 4 -> {
                            M model = Service.update(modelClass);
                            if (model != null)
                                view.show(model);
                        }
                        case 5 -> Service.delete(modelClass);
                        default -> MC.title.outlineY("OPCIÓN NO VÁLIDA");
                    }
                } catch (SQLException e) {
                    System.out.println("Error de base de datos: " + e.getMessage());
                }
            } else {
                String input = sc.next();
                if (input.equals("..") || input.equals("0")) {
                    break;
                }
                MC.title.outlineY("COLOQUE UNA OPCIÓN CORRECTA");
            }
        }
    }
}

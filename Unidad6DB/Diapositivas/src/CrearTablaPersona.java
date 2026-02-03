

import DB.MCList;
import DB.Schema.Schema;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class CrearTablaPersona {

    public static void main(String[] args) throws FileNotFoundException, SQLException {
        // SQL para crear tabla persona

//        User.query(User.class).get();

        User user = new User();

        user.setName("Nicolas");
        user.save();
//
//        MCList<User> users = new User().query().get();
//
//        for (User u : users) {
//            System.out.println(u.getName());
//
//            u.setName("Antonio");
//        }

        String sql = "CREATE TABLE IF NOT EXISTS persona (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "nombre VARCHAR(100), " +
                "email VARCHAR(100)" +
                ")";


//        try {
//            Schema.create("personas", table -> {
//                table.id();
//                table.varchar("nombre", 100).notNull().defaultVal("Algo");
//                table.varchar("email", 100);
//                table.date("fecha_nacimiento");
//                table.intCol("persona_id");
//                table.foreignKey("persona_id").references("persona_dos").on("id");
//            });
//
//            System.out.println("Tabla persona creada correctamente");
//        } catch (SQLException e) {
//            System.err.println("Error al crear tabla: " + e.getMessage());
//        }
    }


}

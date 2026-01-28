

import DB.Schema;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablaPersona {

    public static void main(String[] args) {
        // SQL para crear tabla persona



        String sql = "CREATE TABLE IF NOT EXISTS persona (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "nombre VARCHAR(100), " +
                "email VARCHAR(100)" +
                ")";


        try {
            Schema.create("persona_tres", table -> {
                table.id();
                table.varchar("nombre", 100).notNull().defaultVal("Algo");
                table.varchar("email", 100);
                table.date("fecha_nacimiento");
                table.intCol("persona_id");
                table.foreignKey("persona_id").references("persona_dos").on("id");
            });

            System.out.println("Tabla persona creada correctamente");
        } catch (SQLException e) {
            System.err.println("Error al crear tabla: " + e.getMessage());
        }
    }


}

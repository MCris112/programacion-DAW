package Activities.Activity6;

import Databases.DawDB;
import Env.Env;

import java.sql.SQLException;

public class Activity6 {

    static DawDB dawDB = new DawDB();

    static void main() {

        // crear las tablas
        createTables();


    }

    /**
     * Toda la migración de crear tablas
     */
    public static void createTables()
    {
        try{
            dawDB.schema.dropIfExists("proveedores");
            dawDB.schema.createIfNotExists("proveedores", table -> {
                table.intCol("codigo").setPrimaryKey(true).autoIncrement();
                table.varchar("direccion", 100);
                table.varchar("ciudad", 100);
                table.varchar("provincia", 100);
            });

            dawDB.schema.dropIfExists("categorias");
            dawDB.schema.createIfNotExists("categorias", table -> {
                table.intCol("codigo").setPrimaryKey(true).autoIncrement();
                table.varchar("direccion", 100);
            });

            dawDB.schema.dropIfExists("piezas");
            dawDB.schema.createIfNotExists("piezas", table -> {
                table.intCol("codigo").setPrimaryKey(true).autoIncrement();
                table.varchar("nombre", 100);
                table.varchar("color", 100);
                table.decimal("precio", 10,2);
                table.intCol("codigo_categoria");
                table.foreignKey("codigo_categoria").references("caregorias").on("codigo");
            });

            dawDB.schema.dropIfExists("suministros");
            dawDB.schema.createIfNotExists("suministros", table -> {
                table.intCol("codigo_proovedor").setPrimaryKey(true);
                table.intCol("codigo_pieza").setPrimaryKey(true);
                table.datetime("fecha_hora").setPrimaryKey(true);
                table.intCol("cantidad");

                table.foreignKey("codigo_proovedor").references("proveedores").on("codigo");
                table.foreignKey("codigo_pieza").references("piezas").on("codigo");
            });
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

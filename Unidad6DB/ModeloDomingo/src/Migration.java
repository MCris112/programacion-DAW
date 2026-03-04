import Models.Categoria;
import Models.Pieza;
import Models.Proveedor;
import Models.Suministro;
import com.darkredgm.querymc.Database.DB;

import java.sql.SQLException;

public class Migration {

    static void main() throws SQLException {
        try{
            DB.deleteDatabase("cristopher_proovedor_gui");
        }catch(SQLException e){
            System.out.println("Error al borrar datos del proveedor");
        }

        DB.createDatabase("cristopher_proovedor_gui");

        DB.verify(
                Categoria.class,
                Pieza.class,
                Proveedor.class,
                Suministro.class
        );
    }
}

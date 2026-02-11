import Modelo.Persona;
import com.darkredgm.querymc.Database.DB;

import java.sql.SQLException;

public class Migration {

    static void main() throws SQLException {

//        DB.createDatabase("daw");

        DB.verify( Persona.class );
    }
}

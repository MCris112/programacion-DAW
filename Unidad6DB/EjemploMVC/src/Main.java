import Controllador.PersonaController;

import java.sql.SQLException;

public class Main
{
    static void main() throws SQLException {
        PersonaController ejemplo = new PersonaController();

        ejemplo.listarPersonas();
    }
}
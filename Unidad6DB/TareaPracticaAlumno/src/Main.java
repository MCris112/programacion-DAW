import Database.Migration;

import java.sql.SQLException;

void main() throws SQLException {

    // Para cargar la base de datos y los modelos,
    // esto creara una nueva base de datos
    // junto a los modelos correspondientes
    //Migration.load();

    // Cargar la app
    new App().init();
}

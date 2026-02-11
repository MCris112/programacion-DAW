package Controllador;

import Modelo.Persona;
import Vista.PersonaView;
import com.darkredgm.querymc.Collections.MCList;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.SQLException;

public class PersonaController {

    private final PersonaView personaView;

    public PersonaController() {
        personaView = new PersonaView();
    }

    public void listarPersonas() throws SQLException {
        MCList<Persona> personas = QueryBuilder.use(Persona.class).get();

        personaView.mostrarPersonas(personas);
    }



}

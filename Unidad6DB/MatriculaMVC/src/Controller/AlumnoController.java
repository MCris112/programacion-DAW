package Controller;

import Core.BaseController;
import Core.Service;
import Models.Alumno;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;
import com.darkredgm.utilitiesmc.MC;

import java.sql.SQLException;
import java.util.Scanner;

public class AlumnoController extends BaseController {


    @Override
    public String getName() {
        return "Alumnos";
    }

    @Override
    public void index() {

        try{
            this.view.table( QueryBuilder.use(Alumno.class).get() );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void store() {
        this.view.fillModel(Alumno.class);
    }

    @Override
    public void show() {
        Alumno alumno = Service.getModel(Alumno.class);

        if ( alumno != null )
        {
            this.view.show(alumno);
        }
    }

    @Override
    public void update() {
        Alumno alumno = Service.update(Alumno.class);

        if ( alumno != null )
        {
            this.view.show(alumno);
        }
    }

    @Override
    public void delete() {
        Service.delete(Alumno.class);
    }
}

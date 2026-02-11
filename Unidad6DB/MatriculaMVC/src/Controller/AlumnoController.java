package Controller;

import Core.BaseController;
import Models.Alumno;
import com.darkredgm.querymc.Database.ORM.QueryBuilder;

import java.sql.SQLException;

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
        System.out.println("Show");
    }

    @Override
    public void update() {
        System.out.println("Update");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }
}

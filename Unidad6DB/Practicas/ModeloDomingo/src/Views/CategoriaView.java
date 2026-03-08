package Views;

import Models.Categoria;
import com.darkredgm.querymc.Database.Model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CategoriaView extends BaseView {


    @Override
    public Model getModel() {
        return new Categoria();
    }
}

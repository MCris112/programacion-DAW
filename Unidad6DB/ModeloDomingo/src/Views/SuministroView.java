package Views;

import Models.Suministro;
import com.darkredgm.querymc.Database.Model;

import javax.swing.*;

public class SuministroView extends BaseView {


    @Override
    public Model getModel() {
        return new Suministro();
    }
}

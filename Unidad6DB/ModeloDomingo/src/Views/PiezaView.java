package Views;

import Models.Pieza;
import com.darkredgm.querymc.Database.Model;

import javax.swing.*;

public class PiezaView extends BaseView {
    @Override
    public Model getModel() {
        return new Pieza();
    }
}

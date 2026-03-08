package Views;

import Models.Proveedor;
import com.darkredgm.querymc.Database.Model;

import javax.swing.*;

public class ProveedorView extends BaseView {
    @Override
    public Model getModel() {
        return new Proveedor();
    }
}

import Controllers.CategoriaController;
import Controllers.PiezaController;
import Controllers.ProveedorController;
import Controllers.SuministroController;
import Views.CategoriaView;
import Views.PiezaView;
import Views.ProveedorView;
import Views.SuministroView;

import javax.swing.*;

public class Main {

    static void main() {
        JFrame frame = new JFrame("IES CURA VALERA");

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50,50,300,200);

        CategoriaView view = new CategoriaView();
         PiezaView piezaView = new PiezaView();
         ProveedorView proveedorView = new ProveedorView();
         SuministroView suministroView = new SuministroView();

        tabbedPane.addTab("Categoria", view);
        tabbedPane.addTab("Pieza", piezaView);
        tabbedPane.addTab("Proovedor", proveedorView);
        tabbedPane.addTab("Suministro", suministroView);

        CategoriaController categoriaController = new CategoriaController(view);
        PiezaController piezaController = new PiezaController(piezaView);
        ProveedorController proveedorController = new ProveedorController(proveedorView);
        SuministroController suministroController = new SuministroController( suministroView );

        frame.setContentPane(tabbedPane);

        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

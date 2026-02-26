import javax.swing.*;

public class FormularioBaseA extends JFrame {

    private JTextField test;
    private JPanel demo;
    private JButton button1;

    public FormularioBaseA() {

        setTitle("FormularioBase");
        setSize(800,600);
        setVisible(true);
    }

    static void main() {
        FormularioBaseA frame = new FormularioBaseA();

        frame.setVisible(true);
    }
}

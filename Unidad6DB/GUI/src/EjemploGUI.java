import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploGUI extends JWindow {

    public EjemploGUI() {
        initComponents();
    }

    private void initComponents() {
        // Configuramos los parámetros de la ventana
//        setTitle("Ejemplo de ventana");
        setLocation(200, 500); //setLocationRelativeTo(null);
        setSize(300, 200);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 2) Crear los componentes
        JTextField operator1 = new JTextField(20);
        JTextField operator2 = new JTextField(20);

        JLabel resultado = new JLabel("El Resultado es:");

        JButton btnSum = new JButton("Sumar");
        JButton btnSus = new JButton("Restar");

        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int opt1 = Integer.parseInt(operator1.getText());
                    int opt2 = Integer.parseInt(operator2.getText());

                    resultado.setText("El Resultado es: " + (opt1 + opt2));
                } catch (NumberFormatException nfe) {
                    resultado.setText("El Resultado es invalido, inserta numnero");
                }
            }
        });

        btnSus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int opt1 = Integer.parseInt(operator1.getText());
                    int opt2 = Integer.parseInt(operator2.getText());

                    resultado.setText("El Resultado es: " + (opt1 - opt2));
                } catch (NumberFormatException nfe) {
                    resultado.setText("El Resultado es invalido, inserta numnero");
                }
            }
        });

// 3) Crear un contenedor
        JPanel panelDeContenido = new JPanel();
        // 4) Asociar los componentes al contenedor
        panelDeContenido.add(operator1);
        panelDeContenido.add(operator2);

        JPanel btns = new JPanel();
        btns.add(btnSum);
        btns.add(btnSus);

        panelDeContenido.add(btns);

        // 5) Asociar el contenedor a la ventana
        setContentPane(panelDeContenido);
        add(resultado);

        // 6) Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        EjemploGUI ejemplo = new EjemploGUI();
    }
}
package pro01;

// Autor: [Tu Nombre]
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PRO01 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(900, 650); // Ajustado para que quepa la tabla y el formulario
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null); // Centra la ventana
            ventana.setVisible(true);
        });
    }
}
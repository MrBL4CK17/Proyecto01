package pro01;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {

    private JComboBox<String> comboHabitacion;
    private JRadioButton rbSencilla, rbDoble, rbSuite, rbPresidencial;
    private JCheckBox cbDesayuno, cbWifi, cbSpa, cbTransporte;
    private JTextArea areaResumen;
    private JTextField txtNombre;
    private JTable tablaReservas;
    private DefaultTableModel modeloTabla;
    private JLabel lblCosto;
    private JLabel lblImagenUbicacion; 
    private double costoTotal = 0;

    private JPanel panelCartas; 
    private CardLayout cl;

    public Ventana() {
        super("Proyecto 01 TAP: Hotel Grand Horizon");
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // --- PANTALLA 1: FORMULARIO ---

        // Sub-panel Izquierdo

        // Radio Buttons

        // Checkboxes

        // Añadiendo al panel (Orden corregido)

        // Sub-panel Derecho

        // PANTALLA 2: LISTA

        // EVENTOS
    }

    private void actualizarImagenUbicacion() {
        //Codigo
        
        try {
            // Buscamos la imagen en el mismo paquete/carpeta
        } catch (Exception e) {
            
        }
    }

    private void calcular() {
        costoTotal = rbSencilla.isSelected() ? 800 : rbDoble.isSelected() ? 1200 : rbSuite.isSelected() ? 2500 : 5000;
        if(cbDesayuno.isSelected()) costoTotal += 200;
        if(cbWifi.isSelected()) costoTotal += 50;
        if(cbSpa.isSelected()) costoTotal += 500;
        if(cbTransporte.isSelected()) costoTotal += 300;

        areaResumen.setText("Huésped: " + txtNombre.getText() + "\nUbicación: " + comboHabitacion.getSelectedItem() + "\nTotal: $" + costoTotal);
        lblCosto.setText("Total: $" + costoTotal + " MXN");
    }

    private void guardar() {
        //Codigo de Logica para guardar el registro de la reservacion
        JOptionPane.showMessageDialog(this, "Registrado.");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradoscelsius;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Matias
 */
public class TemperatureConverterApp extends JFrame implements ActionListener {
    private JTextField celsiusTextField;
    private JButton convertButton;

    public TemperatureConverterApp() {
        // Configuración de la ventana
        setTitle("Convertidor de Temperatura");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Crear componentes de la interfaz
        celsiusTextField = new JTextField(10);
        convertButton = new JButton("Convertir");

        // Configurar el botón para escuchar eventos
        convertButton.addActionListener(this);

        // Configurar el diseño de la interfaz
        JPanel panel = new JPanel();
        panel.add(new JLabel("Temperatura Celsius:"));
        panel.add(celsiusTextField);
        panel.add(convertButton);

        setLayout(new FlowLayout());
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            // Obtener la temperatura en grados Celsius del campo de texto
            String celsiusText = celsiusTextField.getText();
            try {
                double celsius = Double.parseDouble(celsiusText);
                // Realizar la conversión
                double fahrenheit = celsius * 9/5 + 32;
                // Mostrar el resultado en un cuadro de diálogo
                JOptionPane.showMessageDialog(this, "Temperatura en Fahrenheit: " + fahrenheit);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese una temperatura válida en Celsius.");
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureConverterApp app = new TemperatureConverterApp();
            app.setVisible(true);
        });
    }
}

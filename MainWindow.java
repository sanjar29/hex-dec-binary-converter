import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private JTextField txtDecimal;
    private JTextField txtBinary;
    private JTextField txtHex;
    private JLabel lblError;

    public MainWindow(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBackground(new Color(60, 63, 65));

        JLabel lblDecimal = new JLabel("Enter Decimal:");
        JLabel lblBinary = new JLabel("Enter Binary:");
        JLabel lblHex = new JLabel("Enter Hexadecimal:");

        txtDecimal = new JTextField();
        txtBinary = new JTextField();
        txtHex = new JTextField();

        lblDecimal.setForeground(Color.WHITE);
        lblBinary.setForeground(Color.WHITE);
        lblHex.setForeground(Color.WHITE);

        JButton btnCompute = new JButton("Compute");
        btnCompute.setBackground(new Color(30, 144, 255));
        btnCompute.setForeground(Color.WHITE);
        btnCompute.setFocusPainted(false);
        btnCompute.setFont(new Font("Tahoma", Font.BOLD, 12));

        // Error Label
        lblError = new JLabel("", SwingConstants.CENTER);
        lblError.setForeground(Color.RED);

        panel.add(lblDecimal);
        panel.add(txtDecimal);
        panel.add(lblBinary);
        panel.add(txtBinary);
        panel.add(lblHex);
        panel.add(txtHex);
        panel.add(new JLabel()); // Empty for spacing
        panel.add(btnCompute);
        panel.add(lblError); // Error message here

        frame.setContentPane(panel);

        // Add button action listener
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateInputs()) {
                    new OptionsWindow(frame, txtDecimal.getText(), txtBinary.getText(), txtHex.getText());
                }
            }
        });
    }

    // Input validation method
    private boolean validateInputs() {
        try {
            Integer.parseInt(txtDecimal.getText()); // Decimal check
        } catch (NumberFormatException e) {
            lblError.setText("Invalid Decimal Input!");
            return false;
        }

        try {
            Integer.parseInt(txtBinary.getText(), 2); // Binary check
        } catch (NumberFormatException e) {
            lblError.setText("Invalid Binary Input!");
            return false;
        }

        try {
            Integer.parseInt(txtHex.getText(), 16); // Hex check
        } catch (NumberFormatException e) {
            lblError.setText("Invalid Hexadecimal Input!");
            return false;
        }

        return true;
    }
}

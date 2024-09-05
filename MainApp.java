import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Decimal, Binary, and Hexadecimal Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);

            JLabel lblDecimal = new JLabel("Decimal:");
            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(lblDecimal, gbc);

            JTextField txtDecimal = new JTextField(15);
            gbc.gridx = 1;
            gbc.gridy = 0;
            panel.add(txtDecimal, gbc);

            JLabel lblBinary = new JLabel("Binary:");
            gbc.gridx = 0;
            gbc.gridy = 1;
            panel.add(lblBinary, gbc);

            JTextField txtBinary = new JTextField(15);
            gbc.gridx = 1;
            gbc.gridy = 1;
            panel.add(txtBinary, gbc);

            JLabel lblHex = new JLabel("Hexadecimal:");
            gbc.gridx = 0;
            gbc.gridy = 2;
            panel.add(lblHex, gbc);

            JTextField txtHex = new JTextField(15);
            gbc.gridx = 1;
            gbc.gridy = 2;
            panel.add(txtHex, gbc);

            JButton btnCompute = new JButton("Compute");
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            panel.add(btnCompute, gbc);

            JTextArea txtOutput = new JTextArea(10, 30);
            txtOutput.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(txtOutput);
            gbc.gridx = 0;
            gbc.gridy = 4;
            gbc.gridwidth = 2;
            panel.add(scrollPane, gbc);

            frame.getContentPane().add(panel);
            frame.setVisible(true);

            btnCompute.addActionListener(e -> {
                new ConversionWindow(frame, txtDecimal, txtBinary, txtHex, txtOutput);
            });
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversionsWindow extends JFrame {
    private JTextField txtDecimal;
    private JTextField txtBinary;
    private JTextField txtHex;
    private JTextArea txtOutput;

    public ConversionsWindow(JFrame parent, JTextField txtDecimal, JTextField txtBinary, JTextField txtHex,
            JTextArea txtOutput) {
        this.txtDecimal = txtDecimal;
        this.txtBinary = txtBinary;
        this.txtHex = txtHex;
        this.txtOutput = txtOutput;

        setTitle("Conversions");
        setSize(300, 200);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(0, 1));

        JButton btnDecimalToBinary = new JButton("Decimal to Binary");
        JButton btnBinaryToDecimal = new JButton("Binary to Decimal");
        JButton btnDecimalToHex = new JButton("Decimal to Hexadecimal");
        JButton btnHexToDecimal = new JButton("Hexadecimal to Decimal");
        JButton btnBack = new JButton("Back");

        add(btnDecimalToBinary);
        add(btnBinaryToDecimal);
        add(btnDecimalToHex);
        add(btnHexToDecimal);
        add(btnBack);

        btnDecimalToBinary.addActionListener(e -> performDecimalToBinary());
        btnBinaryToDecimal.addActionListener(e -> performBinaryToDecimal());
        btnDecimalToHex.addActionListener(e -> performDecimalToHex());
        btnHexToDecimal.addActionListener(e -> performHexToDecimal());
        btnBack.addActionListener(e -> dispose());

        setVisible(true);
    }

    private void performDecimalToBinary() {
        try {
            int decimal = Integer.parseInt(txtDecimal.getText());
            txtOutput.append("Decimal to Binary: " + Integer.toBinaryString(decimal) + "\n");
        } catch (NumberFormatException ex) {
            txtOutput.append("Error: Invalid input for Decimal to Binary conversion.\n");
        }
    }

    private void performBinaryToDecimal() {
        try {
            int binary = Integer.parseInt(txtBinary.getText(), 2);
            txtOutput.append("Binary to Decimal: " + binary + "\n");
        } catch (NumberFormatException ex) {
            txtOutput.append("Error: Invalid input for Binary to Decimal conversion.\n");
        }
    }

    private void performDecimalToHex() {
        try {
            int decimal = Integer.parseInt(txtDecimal.getText());
            txtOutput.append("Decimal to Hexadecimal: " + Integer.toHexString(decimal).toUpperCase() + "\n");
        } catch (NumberFormatException ex) {
            txtOutput.append("Error: Invalid input for Decimal to Hexadecimal conversion.\n");
        }
    }

    private void performHexToDecimal() {
        try {
            int hex = Integer.parseInt(txtHex.getText(), 16);
            txtOutput.append("Hexadecimal to Decimal: " + hex + "\n");
        } catch (NumberFormatException ex) {
            txtOutput.append("Error: Invalid input for Hexadecimal to Decimal conversion.\n");
        }
    }
}

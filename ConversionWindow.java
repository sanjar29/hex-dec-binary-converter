import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversionWindow extends JFrame {

    public ConversionWindow(JFrame parent, JTextField txtDecimal, JTextField txtBinary, JTextField txtHex,
            JTextArea txtOutput) {
        setTitle("Options");
        setSize(300, 200);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(0, 1));

        JButton btnConversions = new JButton("Conversions");
        JButton btnOnesComplement = new JButton("One's Complement");
        JButton btnTwosComplement = new JButton("Two's Complement");
        JButton btnBitwise = new JButton("Bitwise Operations");

        add(btnConversions);
        add(btnOnesComplement);
        add(btnTwosComplement);
        add(btnBitwise);

        btnConversions.addActionListener(e -> new ConversionsWindow(this, txtDecimal, txtBinary, txtHex, txtOutput));
        btnOnesComplement.addActionListener(e -> performOnesComplement(txtDecimal, txtBinary, txtHex, txtOutput));
        btnTwosComplement.addActionListener(e -> performTwosComplement(txtDecimal, txtBinary, txtHex, txtOutput));
        // btnBitwise should be handled similarly

        setVisible(true);
    }

    private void performOnesComplement(JTextField txtDecimal, JTextField txtBinary, JTextField txtHex,
            JTextArea txtOutput) {
        try {
            int decimal = Integer.parseInt(txtDecimal.getText());
            String binary = txtBinary.getText();
            String hex = txtHex.getText();

            int bitLength = Math.max(binary.length(), 8);

            txtOutput.append("One's Complement:\n");
            txtOutput.append("Decimal: " + Operations.onesComplement(decimal, bitLength) + "\n");
            txtOutput.append("Binary: " + Operations.onesComplement(Integer.parseInt(binary, 2), bitLength) + "\n");
            txtOutput.append("Hexadecimal: " + Operations.onesComplement(Integer.parseInt(hex, 16), bitLength) + "\n");

        } catch (NumberFormatException ex) {
            txtOutput.append("Error: Invalid input for one's complement.\n");
        }
    }

    private void performTwosComplement(JTextField txtDecimal, JTextField txtBinary, JTextField txtHex,
            JTextArea txtOutput) {
        try {
            int decimal = Integer.parseInt(txtDecimal.getText());
            String binary = txtBinary.getText();
            String hex = txtHex.getText();

            int bitLength = Math.max(binary.length(), 8);

            txtOutput.append("Two's Complement:\n");
            txtOutput.append("Decimal: " + Operations.twosComplement(decimal, bitLength) + "\n");
            txtOutput.append("Binary: " + Operations.twosComplement(Integer.parseInt(binary, 2), bitLength) + "\n");
            txtOutput.append("Hexadecimal: " + Operations.twosComplement(Integer.parseInt(hex, 16), bitLength) + "\n");

        } catch (NumberFormatException ex) {
            txtOutput.append("Error: Invalid input for two's complement.\n");
        }
    }
}

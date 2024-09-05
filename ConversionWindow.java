import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversionWindow {
    public ConversionWindow(JFrame frame, String decimal, String binary, String hex) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1, 10, 10));
        panel.setBackground(new Color(72, 61, 139));

        JLabel lblConversions = new JLabel("Conversions", SwingConstants.CENTER);
        lblConversions.setForeground(Color.WHITE);
        lblConversions.setFont(new Font("Arial", Font.BOLD, 16));

        JButton btnBinaryToDecimal = new JButton("Binary to Decimal: " + Integer.parseInt(binary, 2));
        JButton btnBinaryToHex = new JButton(
                "Binary to Hex: " + Integer.toHexString(Integer.parseInt(binary, 2)).toUpperCase());
        JButton btnDecimalToBinary = new JButton(
                "Decimal to Binary: " + Integer.toBinaryString(Integer.parseInt(decimal)));
        JButton btnDecimalToHex = new JButton(
                "Decimal to Hex: " + Integer.toHexString(Integer.parseInt(decimal)).toUpperCase());
        JButton btnHexToDecimal = new JButton("Hex to Decimal: " + Integer.parseInt(hex, 16));
        JButton btnHexToBinary = new JButton("Hex to Binary: " + Integer.toBinaryString(Integer.parseInt(hex, 16)));

        JButton btnBack = new JButton("Back");

        styleButton(btnBinaryToDecimal);
        styleButton(btnBinaryToHex);
        styleButton(btnDecimalToBinary);
        styleButton(btnDecimalToHex);
        styleButton(btnHexToDecimal);
        styleButton(btnHexToBinary);
        styleButton(btnBack);

        panel.add(lblConversions);
        panel.add(btnBinaryToDecimal);
        panel.add(btnBinaryToHex);
        panel.add(btnDecimalToBinary);
        panel.add(btnDecimalToHex);
        panel.add(btnHexToDecimal);
        panel.add(btnHexToBinary);
        panel.add(btnBack);

        frame.setContentPane(panel);
        frame.revalidate();

        // Back button listener
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OptionsWindow(frame, decimal, binary, hex); // Back to options window
            }
        });
    }

    // Method to style buttons
    private void styleButton(JButton button) {
        button.setBackground(new Color(30, 144, 255));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Tahoma", Font.BOLD, 12));
    }
}

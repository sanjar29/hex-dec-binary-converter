import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnesComplementWindow {
    public OnesComplementWindow(JFrame frame, String decimal, String binary, String hex) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        panel.setBackground(new Color(139, 0, 139));

        JLabel lblOnesComp = new JLabel("One's Complement", SwingConstants.CENTER);
        lblOnesComp.setForeground(Color.WHITE);
        lblOnesComp.setFont(new Font("Arial", Font.BOLD, 16));

        JButton btnBinaryOnesComp = new JButton("Binary One's Complement: " + onesComplement(binary));
        JButton btnDecimalOnesComp = new JButton(
                "Decimal One's Complement: " + onesComplement(Integer.toBinaryString(Integer.parseInt(decimal))));
        JButton btnHexOnesComp = new JButton(
                "Hex One's Complement: " + onesComplement(Integer.toBinaryString(Integer.parseInt(hex, 16))));

        JButton btnBack = new JButton("Back");

        styleButton(btnBinaryOnesComp);
        styleButton(btnDecimalOnesComp);
        styleButton(btnHexOnesComp);
        styleButton(btnBack);

        panel.add(lblOnesComp);
        panel.add(btnBinaryOnesComp);
        panel.add(btnDecimalOnesComp);
        panel.add(btnHexOnesComp);
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

    // Method to calculate one's complement
    private String onesComplement(String binary) {
        StringBuilder complement = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            complement.append(bit == '0' ? '1' : '0');
        }
        return complement.toString();
    }

    // Method to style buttons
    private void styleButton(JButton button) {
        button.setBackground(new Color(30, 144, 255));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Tahoma", Font.BOLD, 12));
    }
}

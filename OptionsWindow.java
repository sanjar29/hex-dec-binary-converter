import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsWindow {
    public OptionsWindow(JFrame frame, String decimal, String binary, String hex) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        panel.setBackground(new Color(0x123456));

        JLabel lblOptions = new JLabel("Choose an operation", SwingConstants.CENTER);
        lblOptions.setForeground(Color.WHITE);
        lblOptions.setFont(new Font("Arial", Font.BOLD, 16));

        JButton btnConversions = new JButton("Conversions");
        JButton btnOnesComplement = new JButton("One's Complement");
        JButton btnBack = new JButton("Back");

        styleButton(btnConversions);
        styleButton(btnOnesComplement);
        styleButton(btnBack);

        panel.add(lblOptions);
        panel.add(btnConversions);
        panel.add(btnOnesComplement);
        panel.add(btnBack);

        frame.setContentPane(panel);
        frame.revalidate();

        // Add listeners for button actions
        btnConversions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConversionWindow(frame, decimal, binary, hex);
            }
        });

        btnOnesComplement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OnesComplementWindow(frame, decimal, binary, hex);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainWindow(frame); // Go back to input window
            }
        });
    }

    // Method to style buttons with visible background and text color
    private void styleButton(JButton button) {
        button.setBackground(new Color(30, 144, 255)); // A nice blue color
        button.setForeground(Color.WHITE); // White text
        button.setFocusPainted(false); // Removes border around text
        button.setFont(new Font("Tahoma", Font.BOLD, 12));

        // Optional: Add hover effect
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(70, 130, 180)); // Change to lighter blue on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(30, 144, 255)); // Revert to original color
            }
        });
    }
}

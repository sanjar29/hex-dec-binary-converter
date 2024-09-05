import javax.swing.*;
import java.awt.*;

class GradientPanel extends JPanel {
    private final Color color1 = new Color(0, 100, 255);
    private final Color color2 = new Color(0, 200, 255);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
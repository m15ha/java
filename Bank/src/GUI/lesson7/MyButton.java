package GUI.lesson7;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JComponent {
    private String title;
    private Color color;

    public MyButton(String title) {
        this.title = title;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Arial", Font.BOLD, 20);
        g2.setFont(font);
        g2.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        g2.setColor(color);
        g2.drawString(title, 20, 20);
    }
}

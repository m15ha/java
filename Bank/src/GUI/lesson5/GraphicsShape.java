package GUI.lesson5;

import javax.swing.*;
import java.awt.*;

public class GraphicsShape extends JFrame {
    public static void main(String[] args) {
        new GraphicsShape();
    }
    public GraphicsShape(){
        super("Title");
        setBounds(800, 500, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint (Graphics g){
        super.paint(g);
        Graphics g2 = (Graphics2D) g;
        g2.drawLine(10, 10, 200, 200);
        g2.setColor(new Color(0, 255, 0));
        g2.drawLine(20, 20, 300, 400);
        Color cRed = new Color(255, 0, 0);
        g2.setColor(cRed);
    }
}

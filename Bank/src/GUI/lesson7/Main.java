package GUI.lesson7;

import GUI.lesson4.MyListener;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(400, 300, 800, 400);
        jframe.setVisible(true);
        jframe.setLayout(new FlowLayout());
        MyButton button = new MyButton("Button");
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jframe.add(button);
    }
}

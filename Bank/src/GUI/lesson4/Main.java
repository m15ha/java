package GUI.lesson4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JFrame jframe = new JFrame();
        MyListener listener = new MyListener(jframe);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(400, 300, 800, 400);
        jframe.setLayout(new BorderLayout());
        JMenuBar md = new JMenuBar();
        JMenu main = new JMenu("File");
        JMenu bg = new JMenu("Background");
        JMenu color = new JMenu("Color");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem yellow = new JMenuItem("Yellow");

        md.add(main);
        md.add(bg);
        main.add(exit);
        bg.add(color);
        color.add(blue);
        color.add(yellow);
        jframe.setJMenuBar(md);

        exit.addActionListener(listener);
        blue.addActionListener(listener);
        yellow.addActionListener(listener);

        jframe.setVisible(true);
    }
}

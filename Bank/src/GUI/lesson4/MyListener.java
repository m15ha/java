package GUI.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    JFrame jframe;

    public MyListener(JFrame jframe) {
        this.jframe = jframe;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        String c = ae.getActionCommand();
        if (c.equals("Exit")){
            System.exit(0);
        } else if (c.equals("Blue")){
            jframe.getContentPane().setBackground(Color.BLUE);
        } else if (c.equals("Yellow")){
            jframe.getContentPane().setBackground(Color.YELLOW);
        }
    }
}

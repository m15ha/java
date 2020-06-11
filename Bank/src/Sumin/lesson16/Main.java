package Sumin.lesson16;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Type your first number");
        String s2 = JOptionPane.showInputDialog(null, "Type your second number");
        try {
            int a1 = Integer.parseInt(s1);
            int a2 = Integer.parseInt(s2);
            if (a1 < 0 || a2 < 0) throw new NegativeExeption();
            JOptionPane.showMessageDialog(null, "Total is: " + (a1 + a2));
        } catch (NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Not number!!!");
        } catch (NegativeExeption e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

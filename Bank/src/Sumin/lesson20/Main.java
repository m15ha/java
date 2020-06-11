package Sumin.lesson20;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog(null, "Type first number");
        String in2 = JOptionPane.showInputDialog(null, "Type second number");
        try {
            int a1 = Integer.parseInt(in1);
            int a2 = Integer.parseInt(in2);
            if (a1 <=0 || a2 <=0) throw new NegativeExeption();
            JOptionPane.showMessageDialog(null, a1 + a2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        } catch (NegativeExeption e1) {
            JOptionPane.showMessageDialog(null, e1);
            System.out.println(e1);
        }
    }
}

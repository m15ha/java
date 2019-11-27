package Rusakov.lesson5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Input fist number");
        String s2 = JOptionPane.showInputDialog(null, "Input second number");
        try {
            int p1 = Integer.parseInt(s1);
            int p2 = Integer.parseInt(s2);
            if (p1 <= 0 || p2 >=0) throw new Exception();
            JOptionPane.showMessageDialog(null, "Total: " + (s1 + s2));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Wrong simbol");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Positive only");
        } finally {
        }
    }
}

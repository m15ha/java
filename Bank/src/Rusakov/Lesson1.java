package Rusakov;

import javax.swing.*;

public class Lesson1 {
    public static void main(String[] args) {
        String in;
        in = JOptionPane.showInputDialog(null, "Type positive number", JOptionPane.QUESTION_MESSAGE);
        if ((in != null) && !in.equals("")) {
            int n = Integer.parseInt(in);
            int summ = 0;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    summ += i;
                }
                System.out.println(summ);
            } else {
                System.out.println("Try again2");
            }
        }
        // JOptionPane.showMessageDialog(null, "hello");
    }
}

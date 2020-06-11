package Sumin.lesson17;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null, "Type your Login:");
        User user = new User();
        try {
            user.setLogin(in);
        } catch (UserExeption ex) {

            if (ex.getCode() == UserExeption.SHORT_LOGIN) {
                JOptionPane.showMessageDialog(null, "too short");

            } else if (ex.getCode() == UserExeption.LONG_LOGIN) {
                JOptionPane.showMessageDialog(null, "too long");
            }
        }
        JOptionPane.showMessageDialog(null, "Your login: " + in);
    }
}

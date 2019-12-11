package Rusakov.lesson6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null, "Type Login name");
        User user = new User();
        try {
            user.setLogin(in);
        } catch (UserExeption ex) {
            if (ex.getCode() == UserExeption.SHORT){
              JOptionPane.showMessageDialog(null, "SHORT");
            } else if (ex.getCode() == UserExeption.LONG){
                JOptionPane.showMessageDialog(null, "LONG");
            }
        }
        JOptionPane.showMessageDialog(null, "Your login is: " + in);
    }
}

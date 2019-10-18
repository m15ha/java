package Rusakov;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        if (a>b){
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }

        String str = a < b ? "a<b" : "a > b";
        System.out.println(str);
        System.out.println(a<b ? "a<b" : "a>b");

       // JOptionPane.showMessageDialog(null, "hello");
    }
}

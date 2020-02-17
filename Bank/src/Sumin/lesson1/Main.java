package Sumin.lesson1;

public class Main {
    public static void main(String[] args) {
        int sec = 500000;
        int days = sec / 86400;
        int hours = sec % 86400 - 60;
        int min = sec - days * 86400 - hours * 60;
        int secLeft = 5000;
        System.out.println(hours);
    }
}

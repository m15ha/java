package Sumin.lesson3;

public class Main {
    public static void main(String[] args) {
        String result = "It's Ivan, he is 34 years old, his height is 165 sm. Position - programmer.";
        String n = result.substring(5, 9);
        String a = result.substring(17, 19);
        String h = result.substring(42, 48);
        int h1 = (int)h;
        String p = result.substring(64, 74);
        Man man = new Man(n, a, h, p);
    }
}

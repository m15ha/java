package Sumin.lesson18;

public class Main {
    public static void main(String[] args) {
        char[] sArr = {'a', 'b'};
        String s = new String(sArr);
        System.out.println(s);
        String s1 = "Hello!";
        String s2 = "Hello!";
        System.out.println(s1.charAt(1));
        System.out.println(s1.equals(s2));
    }
}

package Sumin.lesson4;

public class Main {
    public static void main(String[] args) {
        String result = "32, 44, Ivan, Prog";
        String n = result.substring(8, 14);
        String p = result.substring(14, 17);
        String a = result.substring(0, 2);
        int a1 = Integer.parseInt(a);
        String s = result.substring(4, 6);
        int s1 = Integer.parseInt(s);
        System.out.println(n + p + " " + a + " " + s);
        Man man = new Man(n, p, a1, s1);
        System.out.println(man.getAge());
    }
}

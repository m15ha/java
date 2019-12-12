package Rusakov.test2;

public class Main {
    public static void main(String[] args) {
        Firm f = new Firm("NewEra", "Igor", 56);
        System.out.println(f.director.isPensioner());
    }
}

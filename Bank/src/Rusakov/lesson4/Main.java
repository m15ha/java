package Rusakov.lesson4;

public class Main {
    public static void main(String[] args) {
        Firm firm = new Firm("3DM", "Daniel", 30);
        System.out.println(firm.director.isPensioner());

        System.out.println(MyMath.add(6, 8));
    }

}

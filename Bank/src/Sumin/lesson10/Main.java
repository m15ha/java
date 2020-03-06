package Sumin.lesson10;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public String report(int qtyOfMonths) {
                return null;
            }
        }, 5);
    }
}

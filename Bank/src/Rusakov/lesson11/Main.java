package Rusakov.lesson11;

public class Main {
    public static void main(String[] args) {
        Person q1 = new Person();
        Person q2 = new Person("Bob", "Buh", 43);
        q1.whoIsOlder(q2);
    }
}

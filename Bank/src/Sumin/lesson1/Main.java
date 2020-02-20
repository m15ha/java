package Sumin.lesson1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Alex";
        human.age = 18;
        human.speed = 4;
        String infos = human.info();
        System.out.println(infos);
        System.out.println("His name is: " + human.name + " and he is " + human.age);
        human.run();
    }
}

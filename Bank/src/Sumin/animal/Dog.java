package Sumin.animal;

public class Dog extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("eat bones");
    }

    @Override
    public void run() {
        System.out.println("run go go");
    }
}

package Sumin.animal;

public class Cat extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("wiskas");
    }

    @Override
    public void run() {
        System.out.println("run run run");
    }
}

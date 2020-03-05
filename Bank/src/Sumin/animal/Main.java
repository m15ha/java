package Sumin.animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        ArrayList<CanRun> animal = new ArrayList<>();
        animal.add(dog);
        animal.add(cat);
        animal.add(cat1);
        animal.add(cat2);
        for (CanRun animals :
                animal) {
            animals.run();
        }
    }
}

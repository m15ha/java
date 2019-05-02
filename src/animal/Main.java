package animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        for (Animal anim: animals
             ) {
            anim.eat();
        }
    }
}

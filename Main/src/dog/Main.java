package dog;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.speed = 4;
        myDog.type = "pudel";
        myDog.name = "Gera";
        System.out.println(myDog.Info());
        myDog.Run();
    }
}

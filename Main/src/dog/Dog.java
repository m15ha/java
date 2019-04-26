package dog;

public class Dog {
    String name;
    String type;
    int speed;
    void Run() {
        for (int i = 0; i < this.speed; i++) {
            System.out.print("Run ");
        }
    }
    String Info(){
        return this.name + " " + this.type + " " + this.speed;
    }

}

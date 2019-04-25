package monster;

public class Main {
    public static void main(String[] args) {
        Monster myMonster = new Monster(5);
        System.out.println(myMonster.Legs);
        myMonster.voice();
        myMonster.voice(5);
        myMonster.voice(2, "Huaaa");
    }
}

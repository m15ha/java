package Sumin.lesson2;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster(2, 3, 4);
        Monster monster2 = new Monster(3, 4, 4);
        int result = monster.compare(monster2);
        switch (result){
            case -1:
                System.out.println("Bigger");
                break;
            case 1:
                System.out.println("Smoller");
                break;
            case 0:
                System.out.println("Equal");
        }
        monster.voice(2, "rrrrr");

    }
}

package Sumin.lesson1;

public class Human {
    String name;
    int age;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "run";

            //Проверяем последнее ли это слово "бегу" - если последнее, то ставим точку, если нет, то ставим запятую и пробел
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
    String info (){
        return name + age + speed;
    }
}

package Rusakov.lesson3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Bob", "12345");
        User user2 = new User(2, "Mike", "qwerty");
        User[] first = new User[3];
        first[0] = new User (3, "James", "efrftg");
        first[1] = new User (4, "Nade", "eweftg");
        first[2] = new User (5, "Leon", "666663g");
     /*   for (int i = 0; i < first.length; i ++){
            System.out.println(first[i].id);
        }*/
        for (User j : first
             ) {
            System.out.println("id = " + j.id + "; Login: " + j.login + "; Password: " + j.password);
        }
    }
}

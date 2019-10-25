package Rusakov.lesson3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Bob", "12345");
        User user2 = new User(2, "Mike", "qwerty");
        UserSocial us = new UserSocial(6, "Daniel", "kjjjklh", "Daniel", 28);
        WebMaster wm = new WebMaster(7, "Dan", "5444lh", "mail.com");

        wm.setWebAddress("mail.ru");
        System.out.println(wm.getWebAddress());
        wm.getInfo();

        User user3 = new User();
        User[] first = new User[3];
        user1.setLogin("Boby");
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
        user1.getInfo();
        System.out.println(user1.getLogin());
        user1.whoIsOlder (user2);
        user3.getInfo();
    }
}

package Sumin.lesson12;

public class Main {
    public static void main(String[] args) {
        Person pers = new Person("Bob", 12);
        Person x = new Person();
        Person[] persArr = new Person[3];
        x.whoIsOlder(pers);
        persArr[0] = new Person("Mike", 11);
        persArr[1] = new Person("James", 12);
        for (Person per :
             persArr) {
            System.out.println(per.getName() + per.getAge());
        }
    }
}

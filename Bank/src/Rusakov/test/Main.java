package Rusakov.test;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jack", "Moscow", 11);
        System.out.println(person.name);
        Person[] pers = new Person[2];
        pers[0] = new Person("Bob", "China", 13);
        pers[1] = new Person("Mike", "Moldova", 18);

        for (Person n1 : pers
        ) {
            System.out.println(n1.name + " " + n1.age + " " + n1.city);
            person.setName("Lada");
            System.out.println(person.getPersonInfo());
        }
        InnerClass f = new InnerClass("BB", "Bill", 45);
        System.out.println(f.director.name);
        System.out.println(f.director.isPensioner());
    }

}

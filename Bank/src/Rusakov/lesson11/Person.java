package Rusakov.lesson11;

public class Person {
    private String name;
    private String pos;
    private int age;


    public Person(String name, String pos, int age) {
        this.name = name;
        this.pos = pos;
        this.age = age;
    }

    public Person() {
        this("default name", "default pos", 12);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void whoIsOlder(Person p) {
        if (this.age > p.age) System.out.println("older");
        else if (this.age < p.age) System.out.println("yanger");
    }
}

package Sumin.lesson12;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("default name", 11);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return name + age;
    }

    public void whoIsOlder(Person x){
        if (this.age > x.age) System.out.println("Older");
        else if(this.age < x.age) System.out.println("Yanger");
        else System.out.println("Same");
    }
}


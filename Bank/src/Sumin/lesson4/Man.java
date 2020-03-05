package Sumin.lesson4;

public class Man {
    private String name;
    private String position;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Man(String name, String position, int age, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }
}

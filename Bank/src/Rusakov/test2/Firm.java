package Rusakov.test2;

public class Firm {
    public String firmName;
    public Director director;

    public Firm(String firmName, String directorName, int age) {
        this.firmName = firmName;
        this.director = new Director(directorName, age);
        System.out.println(directorName);
    }

    public class Director {
        String name;
        int age;

        public Director(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public boolean isPensioner(){
            return age >=60;
        }
    }
}

package Rusakov.lesson4;

public class Firm {
    public String firmName;
    public Director director;

    public Firm(String firmName, String nameDirector, int age) {
        this.firmName = firmName;
        this.director = new Director (nameDirector, age);
    }

    public class Director {
        public String name;
        public int age;

        public Director(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public boolean isPensioner (){
            return age >=60;
        }
    }
}

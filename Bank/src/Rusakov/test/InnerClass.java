package Rusakov.test;

public class InnerClass {
    public String nameFirm;
    public Director director;

    public InnerClass(String nameFirm, String nameDirector, int age) {
        this.nameFirm = nameFirm;
        this.director = new Director (nameDirector, age);
    }

    public class Director{
        public String name;
        public int age;

        public Director(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public boolean isPensioner(){
            return age >=60;
        }
    }
}

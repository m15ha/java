package man;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge (int age){
       if (age > 0) {
           this.age = age;
       } else {
           System.out.println("wrong age");
       }
    }

    public int getAge(){
        return age;
    }

    public void Show(){
        System.out.println(name + " " + age);
    }
}

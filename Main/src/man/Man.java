package man;

public class Man {
    private String name;
<<<<<<< HEAD
    private String positions;
//    private int age;
//    private double height;

    public Man(String name, String positions) {
        this.name = name;
        this.positions = positions;
//        this.age = age;
//        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getPositions() {
        return positions;
=======
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
>>>>>>> ec1dc4a45d8f3944f1f3ea56184a131d01b8bd6e
    }
}

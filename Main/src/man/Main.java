package man;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        String s = "This is Ivan, his 34 yo. Hi is programmer, his 165.4";
        String name = s.substring(8, 12);
        String positions = s.substring(15, 19);
//                String positions = s.substring(23, 29);
//                String height = s.substring(35, 40);
        Man myMan = new Man(name, positions);
        System.out.println(myMan.getName() + myMan.getPositions());
=======
        Man myMan = new Man("John", 10);
        myMan.setAge(6);
        System.out.println(myMan.getAge());
        myMan.Show();
>>>>>>> ec1dc4a45d8f3944f1f3ea56184a131d01b8bd6e
    }
}

package man;

public class Main {
    public static void main(String[] args) {
        Man myMan = new Man("John", 10);
        myMan.setAge(6);
        System.out.println(myMan.getAge());
        myMan.Show();
    }
}
